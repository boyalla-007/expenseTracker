package com.rc.expensetracker.dto;

import com.rc.expensetracker.model.ExpenseType;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ExpenseRequest {
    private ExpenseType type;
    private String description;
    private double amount;
    private String category;
}
