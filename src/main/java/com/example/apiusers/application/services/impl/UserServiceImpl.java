package com.example.apiusers.application.services.impl;

import com.example.apiusers.application.services.UserService;
import com.example.apiusers.domain.User;
import com.example.apiusers.infrastructure.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        log.info("Saving user: {}", user.toString());
        return this.userRepository.save(user);
    }
}
