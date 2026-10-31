package com.rc.expensetracker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
@Data
@AllArgsConstructor
public class userResponse {
    private ObjectId id;
    private String username;
    private String email;
}
