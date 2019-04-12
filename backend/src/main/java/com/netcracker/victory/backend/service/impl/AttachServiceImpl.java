package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.AttachEntity;

import com.netcracker.victory.backend.repository.AttachRepository;
import com.netcracker.victory.backend.service.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceImpl implements AttachService {

    @Autowired
    private AttachRepository attachRepository;

    @Override
    public List<AttachEntity> findAll() {
        return (List<AttachEntity>) attachRepository.findAll();
    }

    @Override
    public AttachEntity save(AttachEntity attachEntity) {
        return attachRepository.save(attachEntity);
    }
}

