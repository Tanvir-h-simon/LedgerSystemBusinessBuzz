package com.ledgersystem.services;

import com.ledgersystem.models.User;
import java.util.HashMap;

public class AuthService {
    private static AuthService instance;
    private final HashMap<String, User> users;

    private AuthService() {
        users = new HashMap<>();
    }

    public static AuthService getInstance() {
        if (instance == null) {
            instance = new AuthService();
        }
        return instance;
    }

    public boolean register(String name, String email, String password) {
        if (users.containsKey(email)) {
            return false;
        }
        users.put(email, new User(name, email, password));
        return true;
    }

    public User login(String email, String password) {
        User user = users.get(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}