package com.rc.expensetracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "expense")
public class Expense {
    private ObjectId id;
    private ObjectId userId;
    private double amount;
    private String category;
    private String description;
    private LocalDateTime date;
    private ExpenseType type;
}
