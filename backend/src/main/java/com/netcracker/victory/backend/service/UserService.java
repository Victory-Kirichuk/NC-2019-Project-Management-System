package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.UserEntity;

import java.util.List;

public interface UserService {
List<UserEntity> findAll();
UserEntity  findUserEntitiesByEmail(String email);
UserEntity save(UserEntity userEntity);

}
