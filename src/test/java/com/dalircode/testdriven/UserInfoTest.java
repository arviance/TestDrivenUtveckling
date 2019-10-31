package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

import static junit.framework.Assert.assertEquals;

class UserInfoTest {

    UserInfo user;

    @BeforeEach
    void setUp() {
        user = new UserInfo();
    }

    @ParameterizedTest
    @CsvSource({"anna, losen", "bergit, 123456", "kalle, pass"})
    void check_login_correct(ArgumentsAccessor argumentsAccessor) {
        String userName = argumentsAccessor.getString(0);
        String passWord = argumentsAccessor.get(1, String.class);
        String expectedFullInfo = argumentsAccessor.getString(2);

        UserInfo user = new UserInfo();
        assertEquals(expectedFullInfo, user.fullInfo());
    }

}