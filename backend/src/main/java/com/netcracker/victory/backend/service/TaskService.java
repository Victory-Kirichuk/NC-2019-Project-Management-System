package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.TaskEntity;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    List<TaskEntity> findAll();
    TaskEntity findTaskEntityByCode (String code);
    TaskEntity findTaskEntityByName (String name);
    TaskEntity findTaskEntityByAssign (int assign);


    TaskEntity save(TaskEntity taskEntity);
}

