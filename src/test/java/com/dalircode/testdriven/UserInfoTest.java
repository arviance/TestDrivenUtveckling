package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class UserInfoTest {

    UserInfo user;

    @BeforeEach
    void setUp() {
        user = new UserInfo("Kamran", "123456");
    }

    @Test
    void test_name_and_password() {
        assertThat(user.getName(), is("Kamran"));
        assertThat(user.getPassword(), is("123456"));

        assertEquals("Kamran", user.getName());
        assertEquals("123456", user.getPassword());


    }
}