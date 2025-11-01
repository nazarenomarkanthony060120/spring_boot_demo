package com.example.demo.repository;

import com.example.demo.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public class UserRepository extends MongoRepository<User, String> {
}
