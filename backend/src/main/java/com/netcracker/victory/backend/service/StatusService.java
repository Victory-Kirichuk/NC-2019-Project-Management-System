package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.StatusEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatusService {
    List<StatusEntity> findAll();
}
