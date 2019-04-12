package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.PriorityEntity;
import com.netcracker.victory.backend.entities.RoleEntity;
import com.netcracker.victory.backend.repository.PriorityRepository;
import com.netcracker.victory.backend.repository.RoleRepository;
import com.netcracker.victory.backend.service.PriorityService;
import com.netcracker.victory.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriorityServiceImpl implements PriorityService {
    @Autowired
    private PriorityRepository priorityRepository;

    @Override
    public List<PriorityEntity> findAll() {
        return (List<PriorityEntity>) priorityRepository.findAll();
    }
}
