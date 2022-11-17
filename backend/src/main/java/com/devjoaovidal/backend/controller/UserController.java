package com.devjoaovidal.backend.controller;

import com.devjoaovidal.backend.model.User;
import com.devjoaovidal.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/user")
    User newUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping(value = "/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
