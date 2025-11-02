package com.example.demo.application.controller;

import com.example.demo.application.dto.login.LoginRequestDTO;
import com.example.demo.application.dto.login.LoginResponseDTO;
import com.example.demo.model.user.User;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/")
    public LoginResponseDTO login(@RequestBody LoginRequestDTO loginRequestDTO) {
        User result = loginService.login(loginRequestDTO);

        if (result.getId().isEmpty())
            return new LoginResponseDTO(null, "Login Failed");

        return new LoginResponseDTO(result.getId(), "Login Successful");
    }
}
