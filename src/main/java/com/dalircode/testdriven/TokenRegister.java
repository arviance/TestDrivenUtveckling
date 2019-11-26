package com.dalircode.testdriven;

import java.util.HashMap;

public class TokenRegister implements Map {

    User user1 = new User("anhar", "pwd");
    User user2 = new User("kamran", "pwd");
    User user3 = new User("lotta", "pwd");
    User user4 = new User("martin", "pwd");

    Token userToken1 = new Token("Banana");
    Token userToken2 = new Token("Apple");
    Token userToken3 = new Token("Kiwi");

    @Override
    public boolean registeredUsers() {

        HashMap<Token, User> registerUsers = new HashMap<>();

        registerUsers.put(userToken1, user1);
        registerUsers.put(userToken2, user2);
        registerUsers.put(userToken1, user3);
        registerUsers.put(userToken3, user4);

        return registerUsers.containsKey(userToken1);
    }
}