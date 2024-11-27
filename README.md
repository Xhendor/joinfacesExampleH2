
# Project Structure:

 - Maven-based project with Spring Boot 3.1.5
 - JoinFaces integration for JSF support
 - Spring Security for authentication
 - H2 database for data storage
 - PrimeFaces for modern UI components

# Key Components:

## Backend:
 - User.java: Entity class for user data
 - UserRepository.java: JPA repository for database operations
 - UserService.java: Service layer implementing UserDetailsService
 - SecurityConfig.java: Spring Security configuration
 - RegisterBean.java: Handles user registration
 - LoginBean.java: Handles logout functionality

## Frontend:
 - login.xhtml: Login page with username/password fields
 - register.xhtml: Registration page for new users
 - index.xhtml: Welcome page after successful login

# Features:
 - Secure login/logout functionality
 - User registration with validation
 - Password encryption using BCrypt
 - Session management
 - Modern UI with PrimeFaces components
 - H2 in-memory database (can be easily switched to other databases)
