package com.javaaccountstatement.poc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaaccountstatement.poc.models.User;
import com.javaaccountstatement.poc.repositories.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public List<User> index() {
        return userRepository.findAll();
    }
}