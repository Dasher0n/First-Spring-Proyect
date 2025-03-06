package com.example.spring_boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring_boot.model.User;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public UserService() {
        // Agregar algunos usuarios de ejemplo
        users.add(new User("Miguel", 25));
        users.add(new User("Ana", 30));
    }

    public List<User> getUsers() {
        return users;
    }

    public User addUser(User user) {
        users.add(user);
        return user;
    }
}
