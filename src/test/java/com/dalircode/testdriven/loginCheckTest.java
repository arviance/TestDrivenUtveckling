package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class loginCheckTest{
    private loginCheck
    loginCheck;

    @BeforeEach
    void setUp(){
        loginCheck = new loginCheck();
    }

    @Test
    void
    test_login_anhar_succsess() {

        boolean loginResult = loginCheck.loginProccess("anhar", "shebib");

        assertTrue(loginResult);
    }
    @Test
    void test_login_kamran_success(){
        boolean loginResult = loginCheck.loginProccess("kamran", "dalir");

        assertTrue(loginResult);

    }

    @Test
    void
    test_login_anhar_fail() {
        boolean loginResult = loginCheck.loginProccess("ahnran", "wroong");

        assertFalse(loginResult);
    }
    @Test
    void
    test_login_kamran_fail() {
        boolean loginResult = loginCheck.loginProccess("karman", "wroong");

        assertFalse(loginResult);
    }
    @ParameterizedTest
    @ValueSource(strings = {"anna:losen","berit:123456","kalle:password"})
    void test_login_success(String param) {
        String[] split = param.split(":");
        String username = split[0];
        String password = split[1];








}