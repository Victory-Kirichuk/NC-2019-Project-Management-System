package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.TaskEntity;
import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.backend.repository.TaskRepository;
import com.netcracker.victory.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;
    @Override
    public List<TaskEntity> findAll() {
        return (List<TaskEntity>) taskRepository.findAll() ;
    }

    @Override
    public TaskEntity findTaskEntityByCode(String code) {
        return taskRepository.findTaskEntityByCode(code);
    }

    @Override
    public TaskEntity findTaskEntityByName(String name) {
        return taskRepository.findTaskEntityByName(name);
    }

    @Override
    public TaskEntity findTaskEntityByAssign(int assign) {
        return taskRepository.findTaskEntityByAssign(assign);
    }

    @Override
    public TaskEntity findTaskEntityByUserByAssign(UserEntity userEntity) {
        return taskRepository.findTaskEntityByUserByAssign(userEntity);
    }

    @Override
    public TaskEntity save(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }
}
