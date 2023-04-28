package com.example.demo.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

  User findByUsername(String username);

}

