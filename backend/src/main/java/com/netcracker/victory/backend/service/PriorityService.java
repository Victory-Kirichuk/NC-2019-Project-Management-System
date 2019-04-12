package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.PriorityEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PriorityService {
    List<PriorityEntity> findAll();
}
