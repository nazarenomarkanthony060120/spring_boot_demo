package com.example.demo.model.history;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "history")
public class History {

    @Id
    private String id;
    private String userId;
    private String message;

    @CreatedDate
    private LocalDateTime createDate;

    public History() {}

    public History(String userId, String message) {
        this.userId = userId;
        this.message = message;
        this.createDate = LocalDateTime.now();
    }

    // getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getCreateDate() { return createDate; }
    public void setCreateDate(LocalDateTime createDate) { this.createDate = createDate; }
}
