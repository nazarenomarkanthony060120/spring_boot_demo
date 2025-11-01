package com.example.demo.application.dto.register;

public class RegisterRequestDTO {
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
    public RegisterRequestDTO() {}

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

