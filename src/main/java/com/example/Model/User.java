package com.example.Model;

public class User {
    Integer userId;
    String userName;

    public User(Integer userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }
}
