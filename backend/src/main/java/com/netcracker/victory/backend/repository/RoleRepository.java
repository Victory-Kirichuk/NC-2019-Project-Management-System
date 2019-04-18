package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.RoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends CrudRepository<RoleEntity,Integer> {
    List<RoleEntity> findAll();
    RoleEntity findRoleEntityByRoleId(int roleId);
}
