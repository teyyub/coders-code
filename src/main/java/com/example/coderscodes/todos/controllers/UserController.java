package com.example.coderscodes.todos.controllers;

import com.example.coderscodes.todos.services.UserService;

import java.util.Scanner;

public class UserController {
    private UserService userService;
    private Scanner scanner;

    public UserController(UserService userService) {
        this.userService = userService;
        this.scanner = new Scanner(System.in);
    }

    public void registerUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        userService.registerUser(username, password);
        System.out.println("User registered successfully!");
    }

    public boolean authenticateUser() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        return userService.authenticateUser(username, password);
    }

    // Other controller methods for user interactions
}

