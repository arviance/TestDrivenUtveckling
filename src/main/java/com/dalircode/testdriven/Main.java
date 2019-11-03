package com.dalircode.testdriven;

public class Main {

    public static void main(String[] args) {

        LoginInfo test1 = new LoginInfo("Kamran", true);
        LoginInfo test2 = new LoginInfo("Anhur", false);

        Account kamran = new Account("Kamran", "123456");
        Account anhur = new Account("Anhur", "losen");

        test1.successfulLogin(kamran);
        test1.failedLogin(kamran);
        test1.successfulLogin(anhur);
        test1.failedLogin(anhur);

        System.out.println("Login Correct:");
        for (Account account: test1.getUserList()) {
            System.out.println(account.getName());
        }

        System.out.println("Login Wrong: ");
        for (Account account: test2.getUserList()) {
            System.out.println(account.getName());
        }


    }
}
