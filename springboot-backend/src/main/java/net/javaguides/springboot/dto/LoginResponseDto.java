package net.javaguides.springboot.dto;

public class LoginResponseDto {
    private String token;
	private String email;
    private String role;

    // Constructor, Getters, Setters
    public LoginResponseDto(String token, String email, String role) {
        this.token = token;
        this.email = email;
        this.role = role;
    }
    
    // ... getters and setters
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
