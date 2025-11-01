package com.example.demo.service;

import com.example.demo.application.dto.user.UserRequestDTO;
import com.example.demo.model.user.User;

public interface UserService {
    User createUser(UserRequestDTO userRequestDTO);
}
