package org.itdma.springapi.api.controller;


import org.itdma.springapi.api.model.User;
import org.itdma.springapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    ///For short injection of service
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam int userId) {
        Optional user = userService.getUser(userId);
        if (user.isPresent()) {
            return (User) user.get();
        }
        return null;
    }
/*
    public User getNamedUser(@RequestParam String name) {
        if (name != null) {
            return userService.getNamedUser(name);
        }
        return null;
    }

    public User getNamedUserSurname(@RequestParam String surname) {
        if (surname == null) {
            return userService.getNamedUserSurname(surname);
        }
        return null;
    }

    public User getNamedUserUsername(@RequestParam String username) {
        return userService.getNamedUserSurname(username);
    }

    public User getNamedUserEmail(@RequestParam String email) {
        if (email == null) {
            return userService.getNamedUserSurname(email);
        }
        return null;
    }

    public User getNamedUserPassword(@RequestParam String password) {
        if (password == null) {
            return userService.getNamedUserSurname(password);
        }
        return null;
    }

    public User getNamedUserRole(@RequestParam String role) {
        if (role == null) {
            return userService.getNamedUserSurname(role);
        }
        return null;
    }

    public User getNamedUserCreatedOn(@RequestParam String createdOn) {
        if (createdOn == null) {
            return userService.getNamedUserSurname(createdOn);
        }
        return null;
    }

    public User getNamedUserIsactive(@RequestParam Boolean isactive) {
        if (isactive == null) {
            return userService.getNamedUserIsactive(isactive);
        }
        return null;
    }

 */
}
