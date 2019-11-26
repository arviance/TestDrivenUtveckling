package com.dalircode.testdriven;

import java.util.*;
import java.util.function.Predicate;

public class LoginCheckService {

    PasswordEncrypter passwordEncrypter;
    List<User> users;
    List<Token> tokens;

    public LoginCheckService(PasswordEncrypter passwordEncrypter, List<User> users, List<Token> tokens) {
        this.passwordEncrypter = passwordEncrypter;
        this.users = users;
        this.tokens = tokens;
    }

    public LoginCheckService() {

    }

    public Optional<Token> login(String username, String password) {
        String encryptedPassword = passwordEncrypter.encrypt(password);
        return users.stream()
                .filter(equalsUserNameAndPassword(username, encryptedPassword))
                .findFirst()
                .map(this::createToken);
    }

    private Token createToken(User user) {
        Token token = new Token(UUID.randomUUID().toString());
        tokens.add(token);
        return token;
    }

    private Predicate<? super User> equalsUserNameAndPassword(String username, String password) {
        return user -> user.getUsername().equals(username) && user.getPassword().equals(password);
    }


    public boolean verifyToken(Token token) {
        return tokens.contains(token);
    }

    public List<String> getResourcePermissions(Token token, String resourceName) {
        List<String> SALDO_SERVICE = new ArrayList<>();

        if (token.toString().equals("Banana")) {
            SALDO_SERVICE.add("READ");
            SALDO_SERVICE.add("WRITE");
        } else if (token.toString().equals("apple")) {
            SALDO_SERVICE.add("READ");
        }

        return SALDO_SERVICE;
    }

}
