package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
<<<<<<< HEAD

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
=======
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


class loginCheckTest{
    private LoginCheck
            loginCheck;

    @BeforeEach


    void setUp(){
        loginCheck = new LoginCheck();
    }

    @Test
    void
    test_login_anhar_succsess() {

>>>>>>> anhar

        boolean loginResult = loginCheck.loginProccess("anhar", "shebib");

        assertTrue(loginResult);
    }
<<<<<<< HEAD

    @Test
    void test_login_kamran_success() {
=======
    @Test
    void test_login_kamran_success(){
>>>>>>> anhar
        boolean loginResult = loginCheck.loginProccess("kamran", "dalir");

        assertTrue(loginResult);

    }

    @Test
<<<<<<< HEAD
    void test_login_anhar_fail() {
=======
    void
    test_login_anhar_fail() {
>>>>>>> anhar
        boolean loginResult = loginCheck.loginProccess("ahnran", "wroong");

        assertFalse(loginResult);
    }
<<<<<<< HEAD

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
=======
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
>>>>>>> anhar
}