package com.example.demo.application.controller;

import com.example.demo.application.dto.user.UserRequestDTO;
import com.example.demo.application.dto.user.UserResponseDTO;
import com.example.demo.model.user.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class CreateUserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userDTO) {
        User user = userService.createUser(userDTO);
        return new UserResponseDTO(user.getId());
    }

    @GetMapping("/user")
    public String getUser() {return "Hello";}
}
