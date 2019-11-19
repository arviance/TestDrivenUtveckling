package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AuthenticationServiceVerifyTokenTest {

    private LoginCheckService logincheck;
    private Token workingToken;
    private Token expiredToken;

    @BeforeEach
    void setUp() {
        workingToken = new Token(UUID.randomUUID().toString());
        expiredToken = new Token(UUID.randomUUID().toString());

        List<Token> tokens = Arrays.asList(workingToken);
        logincheck = new LoginCheckService(null, null, tokens);
    }

    @Test
    void verify_token_ok() {
        boolean tokenOk = logincheck.verifyToken(workingToken);

        assertTrue(tokenOk);
    }

    @Test
    void verify_token_fail() {
        boolean tokenOk = logincheck.verifyToken(expiredToken);

        assertFalse(tokenOk);
    }

    @Test
    void verify_token_from_succesful_login() {
        // Given

        PasswordEncrypter passwordDestroyer = mock(PasswordEncrypter.class);
        when(passwordDestroyer.encrypt(anyString())).thenReturn("pwd");
        List<User> users = Arrays.asList(
                new User("anhar", "pwd"),
                new User("kamran", "pwd"),
                new User("martin", "pwd"),
                new User("lotta", "pwd")
        );
        LoginCheckService authenticationService = new LoginCheckService(passwordDestroyer, users, new LinkedList<>());
        Token token = authenticationService.login("anhar", "pwd").get();

        // When
        boolean tokenOk = authenticationService.verifyToken(token);

        // THen
        assertTrue(tokenOk);
    }
}