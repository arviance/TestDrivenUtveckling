package com.dalircode.testdriven;

<<<<<<< HEAD
import lombok.Value;

@Value
=======
import java.util.Objects;

>>>>>>> anhar
public class User {
    String username;
    String password;

<<<<<<< HEAD
    public User(String username, String password) {
=======
    public User(String username,
                String password) {
>>>>>>> anhar
        this.username = username;
        this.password = password;
    }


<<<<<<< HEAD
=======
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
>>>>>>> anhar
}
