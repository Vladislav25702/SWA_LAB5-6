package com.example.demo.services;
import com.example.demo.model.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserService extends JpaRepository<UserEntity,Long> {
    UserEntity findByName(String username);
}
