package com.dalircode.testdriven;

import java.util.ArrayList;
import java.util.List;

public class LoginInfo {

    private String user;
    private boolean pass;
    private List<Account> userList = new ArrayList<>();

    public LoginInfo(String user, boolean pass) {
        this.user = user;
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public boolean getPass() {
        return pass;
    }

    public List<Account> getUserList() {
        return userList;
    }

    public boolean successfulLogin(Account account) {
        if (pass) {
            return userList.add(account);
        } else

            return false;
    }

    public boolean failedLogin(Account account) {
        if (pass) {
            return false;
        } else
            return userList.add(account);
    }
}
