package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.Project;
import com.netcracker.victory.service.ProjectService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Value("http://localhost:8083/")
    private String backendServerUrl;
    @Override
    public List<Project> getAll() {
        RestTemplate restTemplate = new RestTemplate();
       Project[] projectResponse =restTemplate.getForObject(backendServerUrl + "/backend/api/project/", Project[].class);
        return projectResponse == null ? Collections.emptyList() : Arrays.asList(projectResponse);
    }

    @Override
    public Project getProjectEntitiesByProjectCode(String projectCode) {
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForObject(backendServerUrl+"/backend/api/project"+projectCode,Project.class);
    }

    @Override
    public Project getProjectEntitiesByProjectName(String projectName) {
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForObject(backendServerUrl+"/backend/api/project"+projectName,Project.class);

    }

    @Override
    public Project save(Project project) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendServerUrl + "/backend/api/project",project,Project.class).getBody();
    }

    @Override
    public void delete(int projectId) {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendServerUrl +"/backend/api/project"+projectId);
    }



}
