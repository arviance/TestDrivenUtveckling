<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;

class PasswordEncrypterTest {

=======
package com.dalircode.testdriven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PasswordEncrypterTest {


        @Test
        void test_hash_password() {
        PasswordEncrypter PasswordEncrypter = new PasswordEncrypterClass();

        String encryptedPassword = PasswordEncrypter.encrypt("password");

        assertEquals("1216985755", encryptedPassword);
    }

>>>>>>> anhar
}