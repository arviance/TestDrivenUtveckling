package com.dalircode.testdriven;

public class UserInfo {

    String userName;
    String userPassword;



    public String fullInfo() {

        return String.format("%s %s %s", userName, userPassword);
    }
}
