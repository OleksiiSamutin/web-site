package com.oopwebsite.repository;

import com.oopwebsite.entity.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findByLogin(String login);
    Optional<User> findById(int id);
    boolean existsByLogin(String login);
}
