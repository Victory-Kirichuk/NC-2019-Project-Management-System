package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.RoleEntity;
import com.netcracker.victory.backend.entities.StatusEntity;
import com.netcracker.victory.backend.repository.RoleRepository;
import com.netcracker.victory.backend.repository.StatusRepository;
import com.netcracker.victory.backend.service.RoleService;
import com.netcracker.victory.backend.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepository statusRepository;


    @Override
    public List<StatusEntity> findAll() {
        return (List<StatusEntity>) statusRepository.findAll() ;
    }

    @Override
    public StatusEntity findStatusById(int statusId) {
        return statusRepository.findStatusByStatusId(statusId) ;
    }
}
