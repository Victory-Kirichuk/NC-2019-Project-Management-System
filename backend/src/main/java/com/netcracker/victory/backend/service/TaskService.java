package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.TaskEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface TaskService {


    List<TaskEntity> findAll();

 Page<TaskEntity> findAll(Pageable pageable);

    TaskEntity findTaskEntityByCode(String code);

    TaskEntity findTaskEntityByName(String name);
    Page<TaskEntity> findTaskEntityByAssign(int assign, Pageable pageable);

    TaskEntity save(TaskEntity taskEntity);


}

