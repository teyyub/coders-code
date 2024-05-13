package com.example.coderscodes.todos.services;

import com.example.coderscodes.todos.User;
import com.example.coderscodes.todos.repositories.UserRepository;

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean authenticateUser(String username, String password) {
        User user = userRepository.getUserByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    public void registerUser(String username, String password) {
        User newUser = new User(username, password);
        userRepository.addUser(newUser);
    }

    // Other methods for user management
}

