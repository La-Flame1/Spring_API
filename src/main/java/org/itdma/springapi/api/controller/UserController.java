package org.itdma.springapi.api.controller;


import org.itdma.springapi.entity.User;
import org.itdma.springapi.dto.UserRequestDto;
import org.itdma.springapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody UserRequestDto dto) {
        return userService.createUser(dto);
    }

    @GetMapping("/allUsers")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    /// Dynamically
    @GetMapping("/{userId}")
    public User getUserById(@PathVariable int userId){
        return userService.getUserById(userId);
    }

    @PutMapping("/{userId}")
    public User updateUser(@RequestBody UserRequestDto dto, @PathVariable int userId){
        return userService.updateUser(dto, userId);
    }

    @DeleteMapping("/{userId}")
    public String deleteUserById(@PathVariable int userId){
        return userService.deleteUserById(userId);
    }

}
