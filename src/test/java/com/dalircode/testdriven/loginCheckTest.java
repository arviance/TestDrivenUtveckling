package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class loginCheckTest {
    private loginCheck
            loginCheck;

    @BeforeEach
    void setUp() {
        loginCheck = new loginCheck();
    }

    @Test
    void test_login_anhar_succsess() {

        boolean loginResult = loginCheck.loginProccess("anhar", "shebib");

        assertTrue(loginResult);
    }

    @Test
    void test_login_kamran_success() {
        boolean loginResult = loginCheck.loginProccess("kamran", "dalir");

        assertTrue(loginResult);

    }

    @Test
    void test_login_anhar_fail() {
        boolean loginResult = loginCheck.loginProccess("ahnran", "wroong");

        assertFalse(loginResult);
    }

    @Test
    void test_login_kamran_fail() {
        boolean loginResult = loginCheck.loginProccess("kamran", "wroong");

        assertFalse(loginResult);
    }

    @Test
    void test_login_fail_password_false() {
        boolean loginResult = loginCheck.loginProccess("kamran", "wroong");

        assertFalse(loginResult);

    }
}