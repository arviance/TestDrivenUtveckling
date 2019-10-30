package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class UserInfoTest {

    UserInfo userInfo;

    @BeforeEach
    void setUp() {
        userInfo = new UserInfo();
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna", "berit", "kalle"})
    void test_login_name_successful(String userName) {
        boolean loginResult = userInfo.loginName(userName, "");
        assertTrue(loginResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"losen", "123456", "password"})
    void test_login_password_successful(String userPassword) {
        boolean loginResult = userInfo.loginPassword("", userPassword);
        assertTrue(loginResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {})
    void test_login_name_fail(String userName) {
        boolean loginResult = userInfo.loginName(userName, "");
        assertTrue(loginResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {})
    void test_login_password_fail(String userPassword) {
        boolean loginResult = userInfo.loginPassword("", userPassword);
        assertTrue(loginResult);
    }









}