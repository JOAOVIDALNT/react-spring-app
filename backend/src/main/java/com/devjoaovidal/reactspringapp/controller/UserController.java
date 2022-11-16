package com.devjoaovidal.reactspringapp.controller;

import com.devjoaovidal.reactspringapp.model.User;
import com.devjoaovidal.reactspringapp.repository.UserRepository;
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
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping(value ="/users")
    List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
