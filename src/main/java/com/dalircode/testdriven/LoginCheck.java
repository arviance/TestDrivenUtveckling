package com.dalircode.testdriven;


import java.util.Arrays;
import java.util.List;

public class LoginCheck {
    User user1 = new User("anhar", "shebib");
    User user2 = new User( "kamran", "dalir");
    User user3 = new User( "martin", "kläschen");
    User user4 = new User( "lotta", "kuparinen");


    List<User> users = Arrays.asList(user1, user2, user3, user4);

    public boolean loginProccess(String username, String password) {
        return users.contains(new User(username, password));
    }
}
