package com.rc.expensetracker.dto;

import com.rc.expensetracker.model.expenseType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class expenseRequest {
    private expenseType type;
    private String description;
    private double amount;
    private String category;
}
