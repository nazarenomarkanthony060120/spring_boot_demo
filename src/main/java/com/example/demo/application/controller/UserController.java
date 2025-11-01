package com.example.demo.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/1")
    public String getMethodName(@RequestParam String param) {
        return new String("Hello world"+param);
    }
    
}
