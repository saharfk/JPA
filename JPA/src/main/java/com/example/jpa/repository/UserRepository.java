package com.example.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.jpa.model.UserRecord;

public interface UserRepository extends CrudRepository<UserRecord, String> {
}