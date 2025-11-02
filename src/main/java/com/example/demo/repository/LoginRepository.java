package com.example.demo.repository;

import com.example.demo.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
