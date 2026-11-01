package com.rc.expensetracker.controller;

import com.rc.expensetracker.dto.UserRegister;
import com.rc.expensetracker.dto.UserResponse;
import com.rc.expensetracker.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }
    @PostMapping()
    public UserResponse createUser(@RequestBody UserRegister register){
        return userService.registerUser(register);
    }
    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable ObjectId id){
        return userService.getUserById(id);
    }
    @PatchMapping("/{id}")
    public UserResponse updateUser(@PathVariable ObjectId id,@RequestBody UserRegister register){
        return userService.updateUser(id,register);
    }
    public void deleteUser(@PathVariable ObjectId id){
        userService.deleteUser(id);
    }
}
