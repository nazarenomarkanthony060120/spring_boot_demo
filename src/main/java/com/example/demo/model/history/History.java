package com.example.demo.model.history;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "history")
public class History {

    @Id
    private String id;
    private String userId;
    private String message;

    @CreatedDate
    private String createDate;

    @LastModifiedBy
    private String updateDate;

    public History() {}

    public History(String id, String userId, String message, String createDate, String updateDate) {
        this.id = id;
        this.userId = userId;
        this.message = message;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getMessage() {
        return message;
    }

    public String getCreateDate() {
        return createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }
}
