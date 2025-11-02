package com.example.demo.service.implementation;

import com.example.demo.application.dto.login.LoginRequestDTO;
import com.example.demo.model.history.History;
import com.example.demo.model.user.User;
import com.example.demo.repository.HistoryRepository;
import com.example.demo.repository.LoginRepository;
import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private HistoryRepository historyRepository;

    @Override
    public User login(LoginRequestDTO loginRequestDTO) {
        // find user by email
        User user = loginRepository.findByEmail(loginRequestDTO.getEmail());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        // validate password
        if (!user.getPassword().equals(loginRequestDTO.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        // record successful login in history
        History history = new History(user.getId(), "User logged in successfully");
        historyRepository.save(history);

        return user;
    }
}
