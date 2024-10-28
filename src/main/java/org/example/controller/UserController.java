package org.example.controller;

import org.example.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<Integer, User> users = new HashMap<>();

    @PostMapping
    public User createUser(@RequestBody User user) {
        users.put(user.getId(), user);
        return user;
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable int userId) {
        return users.get(userId);
    }
}