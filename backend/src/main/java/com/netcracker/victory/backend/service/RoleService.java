package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.RoleEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RoleService {
    List<RoleEntity> findAll();
}
