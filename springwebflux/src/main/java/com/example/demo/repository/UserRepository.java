package com.example.demo.repository;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.data.User;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {
}