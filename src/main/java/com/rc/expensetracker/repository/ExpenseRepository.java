package com.rc.expensetracker.repository;

import com.rc.expensetracker.model.Expense;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, ObjectId> {
    Optional<Expense>findExpenseByUserId(ObjectId userid);
    Optional<Expense>findExpenseByIdAndUserId(ObjectId id, ObjectId userid);
    Optional<Expense>findExpenseByUserIdAndcategory(ObjectId userid, String category);
    Optional<Expense>findExpenseByUserIdAndDateBetween(ObjectId userid, LocalDateTime from, LocalDateTime to);
}
