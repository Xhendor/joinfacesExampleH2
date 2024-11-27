package com.example.security.bean;

import jakarta.faces.view.ViewScoped;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import jakarta.servlet.ServletException;
import jakarta.faces.context.FacesContext;
import java.io.Serializable;

@Component
@ViewScoped
@Getter
@Setter
public class LoginBean implements Serializable {
    
    public String logout() {
        SecurityContextHolder.clearContext();
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "/login?faces-redirect=true";
    }
}
