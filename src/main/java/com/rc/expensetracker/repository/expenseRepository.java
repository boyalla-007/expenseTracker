package com.rc.expensetracker.repository;

import com.rc.expensetracker.model.expense;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.Optional;

public interface expenseRepository extends MongoRepository<expense, ObjectId> {
    Optional<expense>findExpenseByUserId(ObjectId userid);
    Optional<expense>findExpenseByIdAndUserId(ObjectId id,ObjectId userid);
    Optional<expense>findExpenseByUserIdAndcategory(ObjectId userid,String category);
    Optional<expense>findExpenseByUserIdAndDateBetween(ObjectId userid, LocalDateTime from, LocalDateTime to);
}
