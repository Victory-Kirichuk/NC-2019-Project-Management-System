package com.netcracker.victory.converter;

import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.TaskModel;
import com.netcracker.victory.service.PriorityDataService;
import com.netcracker.victory.service.ProjectDataService;
import com.netcracker.victory.service.StatusDataService;
import com.netcracker.victory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
 public  class TaskConverter {
    public static TaskDTO convert(TaskModel taskModel)
    {
        TaskDTO taskDTO=new TaskDTO();
        taskDTO.setTaskId(taskModel.getTaskId());
        taskDTO.setCode(taskModel.getCode());
        taskDTO.setPriority(taskModel.getPriorityByPriorityId().getPriority());
        taskDTO.setStatus(taskModel.getStatusByStatusId().getStatus());
        taskDTO.setAssign(taskModel.getUserByAssign().getSurname()+" "+taskModel.getUserByAssign().getName());

        taskDTO.setClosedDate(taskModel.getClosedDate());
        taskDTO.setCreateDate(taskModel.getCreateDate());
        taskDTO.setUpdateDate(taskModel.getUpdateDate());
        taskDTO.setDueDate(taskModel.getDueDate());
        taskDTO.setResolvedDate(taskModel.getResolvedDate());

        taskDTO.setReporter(taskModel.getUserByReporter().getSurname()+" "+taskModel.getUserByReporter().getName());
        taskDTO.setDescription(taskModel.getDescription());
        taskDTO.setEstimation(taskModel.getEstimation());
        taskDTO.setName(taskModel.getName());
        taskDTO.setProjectCode(taskModel.getProjectByProjectId().getProjectCode());

        return taskDTO;
    }

    private StatusDataService statusDataService;
    private PriorityDataService priorityDataService;
    private UserService userService;
    private ProjectDataService projectDataService;



    public static TaskModel convertToModel(TaskDTO taskDTO)
    {
        TaskModel taskModel=new TaskModel();
        taskModel.setTaskId(taskDTO.getTaskId());
        taskModel.setCode(taskDTO.getCode());
        taskModel.setName(taskDTO.getName());
        taskModel.setDescription(taskDTO.getDescription());
        taskModel.setEstimation(taskDTO.getEstimation());

//        taskModel.setPriorityId();
        taskModel.setClosedDate(taskDTO.getClosedDate());
        taskModel.setCreateDate(taskDTO.getCreateDate());
        taskModel.setDueDate(taskDTO.getDueDate());
        taskModel.setResolvedDate(taskDTO.getResolvedDate());
        taskModel.setUpdateDate(taskDTO.getUpdateDate());


        return taskModel;
    }



}
