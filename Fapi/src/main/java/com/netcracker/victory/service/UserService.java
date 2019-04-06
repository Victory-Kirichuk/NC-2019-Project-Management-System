package com.netcracker.victory.service;


import com.netcracker.victory.backend.entities.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> findAll();
    UserEntity  findUserEntitiesByEmail(String email);
    UserEntity save(UserEntity userEntity);
    void delete (int user_id);
}
