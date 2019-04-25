package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.backend.repository.UserRepository;
import com.netcracker.victory.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<UserEntity> findAll() {
        return (List<UserEntity>) userRepository.findAll();
    }

    @Override
    public UserEntity findUserEntitiesByEmail(String email) {
         return userRepository.findUserEntitiesByEmail(email);
    }

    @Override
    public UserEntity findUserEntitiesByUserId(int userId) {
        return userRepository.findUserEntitiesByUserId(userId);
    }

    @Override
    public UserEntity findUserEntitiesByEmailAndPassword(String email, String password) {
        return userRepository.findUserEntitiesByEmailAndPassword(email,password);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

}

