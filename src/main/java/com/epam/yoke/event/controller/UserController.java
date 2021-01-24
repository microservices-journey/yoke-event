package com.epam.yoke.event.controller;


import com.epam.yoke.event.entity.UserPrincipal;
import com.epam.yoke.event.model.User;
import com.epam.yoke.event.repository.RoleRepository;
import com.epam.yoke.event.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

@RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
public class UserController {

    @Autowired
    private CustomUserDetailsService userDetailsService;
    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/user")
    public void createUser(User user) {
//        userDetailsService.saveUser(UserPrincipal.builder()
//                                                 .username(user.getUsername())
//                                                 .password(user.getPassword())
//                                                 .roles(new HashSet<>()).build());
    }
}
