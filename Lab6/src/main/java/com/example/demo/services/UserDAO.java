package com.example.demo.services;
import com.example.demo.model.UserEntity;
import java.util.List;

public interface UserDAO {
    UserEntity findByUserName(String userName);
    UserEntity addUser(UserEntity user);
    List<UserEntity> findAllUsers();
}
