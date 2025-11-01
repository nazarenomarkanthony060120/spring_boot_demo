package com.example.demo.application.dto.register;

public class RegisterResponseDTO {
    /**
     * Declared Global Variables
     * */
    private String name;
    private Long phoneNumber;
    private String email;
    private String password;

    /**
     * Constructor
     * */
    public RegisterResponseDTO() {}

    public RegisterResponseDTO(String name, Long phoneNumber, String email, String password) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
    }

    /**
     * Setter method
     * */
    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter method
     * */
    public String getName() {
        return name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
