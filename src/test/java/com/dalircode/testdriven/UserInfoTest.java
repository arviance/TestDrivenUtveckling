package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
class UserInfoTest {

    UserInfo user;

    @BeforeEach
    void setup() {
        user = new UserInfo("ann", "1234");
    }


    @Test
    void user_info_is_correct() {
        assertThat(user.getUsername(), is("ann"));
        assertThat(user.getPassword(), is("1234"));
    }


}