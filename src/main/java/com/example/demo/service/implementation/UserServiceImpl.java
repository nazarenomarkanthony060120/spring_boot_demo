package com.example.demo.service.implementation;

import com.example.demo.application.dto.user.UserRequestDTO;
import com.example.demo.model.user.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserRequestDTO userRequestDTO) {
        // Convert DTO to Entity
        User user = new User();
        user.setName(userRequestDTO.getName());
        user.setPhoneNumber(userRequestDTO.getPhoneNumber());
        user.setEmail(userRequestDTO.getEmail());
        user.setPassword(userRequestDTO.getPassword()); // You may encrypt this later

        userRepository.save(user);

        return user;
    }
}
