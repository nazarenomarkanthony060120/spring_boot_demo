package com.example.demo.service.implementation;

import com.example.demo.application.dto.login.LoginRequestDTO;
import com.example.demo.model.user.User;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public User login(LoginRequestDTO  loginRequestDTO) {
        loginRepository.save(null);
        return null;
    }
}
