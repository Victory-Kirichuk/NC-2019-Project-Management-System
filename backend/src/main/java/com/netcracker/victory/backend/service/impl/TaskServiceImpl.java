package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.TaskEntity;
import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.backend.repository.TaskRepository;
import com.netcracker.victory.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;


    @Override
    public TaskEntity findTaskEntityByCode(String code) {
        return taskRepository.findTaskEntityByCode(code);
    }

    @Override
    public TaskEntity findTaskEntityByName(String name) {
        return taskRepository.findTaskEntityByName(name);
    }

    @Override
    public Page<TaskEntity> findTaskEntityByAssign(int assign, org.springframework.data.domain.Pageable pageable) {
        return null;
    }


    @Override
    public TaskEntity save(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }

    @Override
    public List<TaskEntity> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Page<TaskEntity> findAll(org.springframework.data.domain.Pageable pageable) {
        //taskRepository.findAll(pageable).getContent();
        return taskRepository.findAll(pageable) ;
    }
}
