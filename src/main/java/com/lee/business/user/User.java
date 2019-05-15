package com.lee.business.user;

public class User {

    private long userId;

    private String userName;
    private String passWorld;

    public User(String userName, String passWorld) {
        this.userName = userName;
        this.passWorld = passWorld;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWorld() {
        return passWorld;
    }

}
