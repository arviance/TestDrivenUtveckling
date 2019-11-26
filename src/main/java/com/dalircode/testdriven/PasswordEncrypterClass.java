package com.dalircode.testdriven;

<<<<<<< HEAD
public class PasswordEncrypterClass {
=======
public class PasswordEncrypterClass implements PasswordEncrypter {

    @Override
    public String encrypt(String password) {
        return "" + password.hashCode() * 55;
    }
>>>>>>> anhar
}
