package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.TaskEntity;

import com.netcracker.victory.backend.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface TaskService {
    Page<TaskEntity> findAll(Pageable pageable);

    TaskEntity findTaskEntityByCode (String code);
    TaskEntity findTaskEntityByName (String name);
    TaskEntity findTaskEntityByAssign (int assign);
    TaskEntity findTaskEntityByUserByAssign(UserEntity userEntity);

    TaskEntity save(TaskEntity taskEntity);
}

