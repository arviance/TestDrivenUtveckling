<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;

class LoginCheckServiceTest {

}
=======
package com.dalircode.testdriven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class LoginCheckServiceTest {


    private LoginCheckService logincheck;
    private PasswordEncrypter passwordencrypter;


    @BeforeEach
    void setUp() {
        passwordencrypter = mock(PasswordEncrypterClass.class);
        List<User> users = Arrays.asList(
                new User("anhar", "pwd"),
                new User("kamran", "pwd"),
                new User("martin", "pwd"),
                new User("lotta", "pwd")
        );
        logincheck = new LoginCheckService(passwordencrypter, users, new LinkedList<>());

    }


    @ParameterizedTest
    @ValueSource(strings = {"anhar,shebib", "kamran,dalir", "martin,kläschen", "lotta,kuparinen"})
    void test_login_success(String param) {
        String[] split = param.split(",");
        String username = split[0];
        String password = split[1];

        when(passwordencrypter.encrypt(anyString())).thenReturn("pwd");

        Optional<Token> tokenOptional = logincheck.login(username, password);

        assertTrue(tokenOptional.isPresent());
    }

    @Test
    void test_login_fail_wrong_password() {

        Optional<Token> tokenOptional = logincheck.login("anhar", "wroong");

        assertFalse(tokenOptional.isPresent());
    }

    @Test
    void test_login_fail_wrong_username() {

        Optional<Token> tokenOptional = logincheck.login("falsename", "wronggy");

        assertFalse(tokenOptional.isPresent());


    }

    @Test
    void test_permission_read_success() {
        Token token = new Token("Banana");

        List<String> permissions = logincheck.getResourcePermissions(token, "SALDO_SERVICE");

        assertTrue(permissions.contains("READ"));
    }

    @Test
    void test_permission_read_fail() {
        Token token = new Token("apple");

        List<String> permissions = logincheck.getResourcePermissions(token, "SALDO_SERVICE");

        assertFalse(permissions.contains("WRITE"));
    }

    @Test
    void test_permission_read_write_success() {
        Token token = new Token("Banana");

        List<String> permissions = logincheck.getResourcePermissions(token, "SALDO_SERVICE");

        assertTrue(permissions.containsAll(Arrays.asList("READ", "WRITE")));
    }


}
>>>>>>> anhar
