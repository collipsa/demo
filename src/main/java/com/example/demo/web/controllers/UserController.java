package com.example.demo.web.controllers;

import com.example.demo.data.User;
import com.example.demo.data.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author churinaav
 * @since 14.09.2018
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/users")
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public List<User> list(){
        return userRepository.findAll();
    }
}
