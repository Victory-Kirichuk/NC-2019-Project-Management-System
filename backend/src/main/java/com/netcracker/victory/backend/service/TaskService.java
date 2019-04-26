package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.TaskEntity;

import com.netcracker.victory.backend.entities.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaskService {
    List<TaskEntity> findAll();
    TaskEntity findTaskEntityByCode (String code);
    TaskEntity findTaskEntityByName (String name);
    TaskEntity findTaskEntityByAssign (int assign);
    TaskEntity findTaskEntityByUserByAssign(UserEntity userEntity);

    TaskEntity save(TaskEntity taskEntity);
}

