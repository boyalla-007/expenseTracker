package com.rc.expensetracker.dto;

import com.rc.expensetracker.model.expenseType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class expenseResponse {
    private ObjectId id;
    private ObjectId userid;
    private double amount;
    private expenseType type;
    private String description;
    private LocalDateTime date;
    private String category;
}

