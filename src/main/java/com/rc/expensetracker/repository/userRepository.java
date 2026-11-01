package com.rc.expensetracker.repository;

import com.rc.expensetracker.model.user;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.ObjectInput;
import java.util.Optional;

public interface userRepository extends MongoRepository<user, ObjectId> {
    Optional<user> findUserByUserId(ObjectId userId);
}
