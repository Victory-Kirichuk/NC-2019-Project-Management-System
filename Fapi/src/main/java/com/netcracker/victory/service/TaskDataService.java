package com.netcracker.victory.service;

import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.TaskModel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TaskDataService {
    List<TaskModel> getAll();
    TaskModel getTaskByCode (String code);
    TaskModel getTaskByName (String name);
    TaskModel getTaskByAssign (int assign);
    TaskModel getTaskByStatus(int statusId);
}
