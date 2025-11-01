package com.example.demo.application.dto.user;

public class UserResponseDTO {
    private String id;

    public UserResponseDTO(String id) {
        this.id = id;
    }

    // Getters only (optional)
    public String getId() {
        return id;
    }
}
