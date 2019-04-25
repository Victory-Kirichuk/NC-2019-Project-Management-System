package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository  extends CrudRepository<UserEntity,Integer>{
List<UserEntity> findAll();
UserEntity findUserEntitiesByEmail (String email);
UserEntity findUserEntitiesByUserId (Integer user_id);

    UserEntity save(UserEntity userEntity);


    UserEntity findUserEntitiesByEmailAndPassword(String email, String password);
}