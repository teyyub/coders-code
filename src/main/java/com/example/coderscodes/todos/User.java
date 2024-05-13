package com.example.coderscodes.todos;

import java.util.Set;

public class User {
    private String username;
    private String password;
    Set<Roles> roles ;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
