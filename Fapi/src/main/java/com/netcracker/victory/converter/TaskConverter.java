package com.netcracker.victory.converter;

import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.TaskModel;

public class TaskConverter {
    public TaskDTO convert(TaskModel taskModel)
    {
        TaskDTO taskDTO=new TaskDTO();
        taskDTO.setCode(taskModel.getCode());
        taskDTO.setPriority(taskModel.getPriorityByPriority().getPriority());
        taskDTO.setStatus(taskModel.getStatusByStatus().getStatus());
        taskDTO.setAssign(taskModel.getUserByAssign().getName()+taskModel.getUserByAssign().getSurname());
        taskDTO.setAssign(taskModel.getUserByAssign().getName()+taskModel.getUserByAssign().getSurname());
        taskDTO.setClosedDate(taskModel.getClosedDate());
        taskDTO.setCreateDate(taskModel.getCreateDate());
        taskDTO.setDueDate(taskModel.getDueDate());
        taskDTO.setReporter(taskModel.getUserByReporter().getName()+taskModel.getUserByReporter().getSurname());
        taskDTO.setDescription(taskModel.getDescription());
        taskDTO.setEstimation(taskModel.getEstimation());
        taskDTO.setName(taskModel.getName());
        taskDTO.setProjectCode(taskModel.getProjectByProject().getProjectCode());
        taskDTO.setResolvedDate(taskModel.getResolvedDate());
        return taskDTO;
    }
}
