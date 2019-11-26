package com.dalircode.testdriven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordEncrypterClassTest {

    @Test
    void test_hash_password() {
        PasswordEncrypterClass passwordDestroyer = new PasswordEncrypterClass();

        String encryptedPassword = passwordDestroyer.encrypt("password");

        assertEquals("-1785260211", encryptedPassword);
    }



}