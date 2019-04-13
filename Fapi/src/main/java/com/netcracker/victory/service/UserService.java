package com.netcracker.victory.service;


import com.netcracker.victory.backend.entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService  {
    List<UserEntity> findAll();
    UserEntity  findUserEntitiesByEmail(String email);
    UserEntity save(UserEntity userEntity);


}
