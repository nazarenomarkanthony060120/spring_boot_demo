package com.example.demo.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/register")
public class CreateUserController {

    @PostMapping("/user")
    public void createUser(@RequestParam String param) {
    }
}
