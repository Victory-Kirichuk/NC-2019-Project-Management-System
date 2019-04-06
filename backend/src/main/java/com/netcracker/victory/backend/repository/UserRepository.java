package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.UserEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UserRepository extends Repository<UserEntity,Integer> {
List<UserEntity> findAll();
UserEntity findUserEntitiesByEmail (String email);
UserEntity findUserEntitiesByUserId (Integer user_id);

}