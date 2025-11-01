package com.example.demo.repository.implementation;

import com.example.demo.model.history.History;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class HistoryRepositoryImpl {

    @Autowired
    private MongoTemplate  mongoTemplate;

    public void customSave(History history) {
        mongoTemplate.save(history);
    }
}
