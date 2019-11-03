package com.dalircode.testdriven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {


    @Test
    void testLogin() {

        LoginInfo user1 = new LoginInfo("Kamran", true);
        LoginInfo user2 = new LoginInfo("Anhur", false);

        Account kamran = new Account("Kamran", "123456");
        Account anhur = new Account("Anhur", "losen");

        assertEquals(true, user1.successfulLogin(kamran));
        assertEquals(false, user1.failedLogin(kamran));

       assertEquals(false, user2.successfulLogin(anhur));
       assertEquals(true, user2.failedLogin(anhur));


    }
}