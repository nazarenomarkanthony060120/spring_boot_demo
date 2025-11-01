package com.example.demo.service;

import com.example.demo.application.dto.login.LoginRequestDTO;
import com.example.demo.model.user.User;

public interface LoginService {
    User login (LoginRequestDTO  loginRequestDTO);
}
