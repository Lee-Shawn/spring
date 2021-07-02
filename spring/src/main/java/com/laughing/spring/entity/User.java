package com.laughing.spring.entity;

/**
 * @author : laughing
 * @create : 2021-07-02 22:20
 * @description :
 */
public class User {
    private String username;
    private String password;
    private School school;

    public void setSchool(School school) {
        this.school = school;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", school=" + school +
                '}';
    }
}
