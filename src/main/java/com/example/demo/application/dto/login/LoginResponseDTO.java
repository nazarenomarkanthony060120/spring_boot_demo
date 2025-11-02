package com.example.demo.application.dto.login;

public class LoginResponseDTO {
    private String id;
    private String message;

    public LoginResponseDTO(String id, String message) {
        this.id = id;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }
}
