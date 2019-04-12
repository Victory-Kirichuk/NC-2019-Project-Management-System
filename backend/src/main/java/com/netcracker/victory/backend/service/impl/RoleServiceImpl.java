package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.RoleEntity;
import com.netcracker.victory.backend.repository.RoleRepository;
import com.netcracker.victory.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;


    @Override
    public List<RoleEntity> findAll() {
        return (List<RoleEntity>) roleRepository.findAll() ;
    }
}
