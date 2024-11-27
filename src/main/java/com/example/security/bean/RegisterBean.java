package com.example.security.bean;

import com.example.security.model.User;
import com.example.security.service.UserService;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
@ViewScoped
@Getter
@Setter
public class RegisterBean implements Serializable {
    
    private User user = new User();
    
    @Autowired
    private UserService userService;
    
    public String register() {
        try {
            userService.registerNewUser(user);
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, "Success", "Registration successful"));
            return "login?faces-redirect=true";
        } catch (RuntimeException e) {
            FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", e.getMessage()));
            return null;
        }
    }
}
