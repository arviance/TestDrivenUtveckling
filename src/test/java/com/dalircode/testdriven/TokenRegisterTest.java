package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TokenRegisterTest {

    private TokenRegister tokenRegister;

    @BeforeEach
    void setUp() {
        tokenRegister = new TokenRegister();
    }

    @Test
    void test_registerToken() {
        boolean name = tokenRegister.registeredUsers();
        assertTrue(name);
    }

}