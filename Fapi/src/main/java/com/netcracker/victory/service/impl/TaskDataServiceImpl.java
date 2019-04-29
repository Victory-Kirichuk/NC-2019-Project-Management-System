package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.TaskModel;
import com.netcracker.victory.service.TaskDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Service
public class TaskDataServiceImpl implements TaskDataService {
    @Value("${backend.server.url}")
    private String backendServerUrl;
    @Override
    public List<TaskModel> getAll() {
        RestTemplate restTemplate=new RestTemplate();
        TaskModel[] taskModelResponse=restTemplate.getForObject(backendServerUrl+"/backend/api/task/",TaskModel[].class);
        return taskModelResponse==null ? Collections.emptyList(): Arrays.asList(taskModelResponse);
    }

    @Override
    public TaskModel getTaskByCode(String code) {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/backend/api/task/code/"+code,TaskModel.class);

    }

    @Override
    public TaskModel getTaskByName(String name) {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/backend/api/task/name/"+name,TaskModel.class);
    }

    @Override
    public TaskModel getTaskByAssign(int assign) {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/backend/api/task/assign/"+assign,TaskModel.class);
    }

    @Override
    public TaskModel getTaskByStatus(int statusId) {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/backend/api/status"+statusId,TaskModel.class);
    }

    @Override
    public TaskModel save(TaskModel taskModel) {
        RestTemplate restTemplate=new RestTemplate();
        taskModel.setStatusId(3); // todo
        taskModel.setReporter(taskModel.getAssign()); // todo
        return restTemplate.postForEntity(backendServerUrl+"/backend/api/task",taskModel, TaskModel.class).getBody();
    }

//    @Override3


}
