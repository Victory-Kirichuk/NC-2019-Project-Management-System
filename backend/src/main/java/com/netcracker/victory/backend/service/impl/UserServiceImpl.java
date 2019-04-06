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
        return null;
    }

    @Override
    public UserEntity findUserEntitiesByEmail(String email) {
        return null;
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return null;
    }

    @Override
    public void delete(int user_id) {

    }
}

