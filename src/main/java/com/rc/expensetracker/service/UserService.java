package com.rc.expensetracker.service;

import com.rc.expensetracker.dto.UserRegister;
import com.rc.expensetracker.dto.UserResponse;
import com.rc.expensetracker.model.User;
import com.rc.expensetracker.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public UserResponse registerUser(UserRegister register){
        User user = new User();
        user.setUsername((register.getUsername()));
        user.setPassword(register.getPassword());
        user.setEmail(register.getEmail());

        User savedUser = userRepository.save(user);
        return new UserResponse(
                savedUser.getUserId().toString(),
                savedUser.getUsername(),
                savedUser.getEmail()
        );
    }
    public UserResponse getUserById(ObjectId id){
        User user = userRepository.findUserByUserId(id)
                .orElseThrow(()->new RuntimeException("User NOT FOUND!!"));
        return new UserResponse(user.getUsername(),
                                user.getEmail(),
                                user.getUserId().toString());
    }

    public UserResponse updateUser(ObjectId userId,UserRegister register){
        User user = userRepository.findUserByUserId(userId)
                .orElseThrow(()->new RuntimeException("User not found!"));
        user.setUsername(register.getUsername());
        user.setPassword(register.getPassword());
        user.setEmail(register.getEmail());
        userRepository.save(user);
        return new UserResponse(user.getUserId().toString(),user.getUsername(),user.getEmail());
    }
    public void deleteUser(ObjectId userId){
        User user = userRepository.findUserByUserId(userId)
                .orElseThrow(()->new RuntimeException("User not found!"));
        userRepository.delete(user);
    }

}
