package com.dalircode.testdriven;

public class PasswordEncrypterClass implements PasswordEncrypter{

    @Override public String encrypt(String password) {
        return ""+password.hashCode()*55;
    }
}
