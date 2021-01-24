package com.epam.yoke.event.model;

import lombok.Data;

import java.util.List;

@Data
public class User {

    private String username;
    private String password;
    private List<String> roles;
}
