package com.example.demo.repository.implementation;

import com.example.demo.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginRepositoryImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void customSave(User user) {
        mongoTemplate.save(user);
    }
}
