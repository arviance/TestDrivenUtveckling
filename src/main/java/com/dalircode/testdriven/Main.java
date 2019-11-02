package com.dalircode.testdriven;

public class Main {

    public static void main(String[] args) {

        LoginInfo passedLoginInfo = new LoginInfo("user1", true);
        LoginInfo failedLoginInfo = new LoginInfo("user2", false);

        Account kamran = new Account("Kamran", "123456");
        Account anhur = new Account("Anhur", "losen");

        passedLoginInfo.passedLogin(kamran);
        passedLoginInfo.failedLogin(kamran);
        passedLoginInfo.passedLogin(anhur);
        passedLoginInfo.failedLogin(anhur);

        System.out.println("Login Correct:");
        for (Account account: passedLoginInfo.getUserList()) {
            System.out.println(account.getName());
        }

        System.out.println("Login Wrong: ");
        for (Account account: failedLoginInfo.getUserList()) {
            System.out.println(account.getName());
        }


    }
}
