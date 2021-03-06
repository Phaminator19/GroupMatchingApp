package com.example.project_1;

public class Message {

    private String message;
    private String userId;
    private String userName;
    private String timestamp;

    public Message() {
        this.message = "empty";
    }

    public Message(String message) {
        this.message = message;
    }


    public Message(String message, String userId, String userName, String timestamp) {
        this.message = message;
        this.userId = userId;
        this.userName = userName;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getUserName() {
        return this.userName;
    }
}