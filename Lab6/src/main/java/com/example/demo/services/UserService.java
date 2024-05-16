package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.UserEntity;
import java.util.List;

@Service
public class UserService implements UserDAO {
    @Autowired
    IUserService entityRepository;
    @Override
    public UserEntity findByUserName(String name) {
        return entityRepository.findByName(name);
    }

    @Override
    public UserEntity addUser(UserEntity user) {
        return entityRepository.save(user);
    }

    @Override
    public List<UserEntity> findAllUsers() {
        return  entityRepository.findAll();
    }
}
