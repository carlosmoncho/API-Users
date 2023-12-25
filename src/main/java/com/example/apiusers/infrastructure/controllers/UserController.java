package com.example.apiusers.infrastructure.controllers;

import com.example.apiusers.application.services.UserService;
import com.example.apiusers.domain.User;
import com.example.apiusers.infrastructure.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        var userCreated = this.userService.saveUser(user);

        return new ResponseEntity<>(user, HttpStatusCode.valueOf(201));
    }
}
