package com.example.ecommerceapplicationspring.services;


import com.example.ecommerceapplicationspring.model.User;
import com.example.ecommerceapplicationspring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public Optional<User> findByID(Long id){
        return userRepository.findById(id);
    }

    public Optional<User> findByUsername(String username){
        return userRepository.findByUsername(username);
    }
}


// Service is a Singleton design pattern, because always spring will initialise only one instance of this class and after work with this class
