package com.dalircode.testdriven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


   @Test
    void testLogin() {
       LoginInfo passedLoginInfo = new LoginInfo("user1", true);
       LoginInfo failedLoginInfo = new LoginInfo("user2", false);

       Account kamran = new Account("Kamran", "123456");
       Account anhur = new Account("Anhur", "losen");

       assertEquals(true, passedLoginInfo.passedLogin(kamran));
       assertEquals(false, failedLoginInfo.passedLogin(kamran));

       assertEquals(true, passedLoginInfo.passedLogin(anhur));
       assertEquals(true, failedLoginInfo.failedLogin(anhur));

   }


}