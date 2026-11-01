package com.rc.expensetracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
@Data
@AllArgsConstructor
public class UserResponse {
    private String id;
    private String username;
    private String email;
}
