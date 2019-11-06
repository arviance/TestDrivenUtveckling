package com.dalircode.testdriven;

import lombok.Value;

@Value
public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
