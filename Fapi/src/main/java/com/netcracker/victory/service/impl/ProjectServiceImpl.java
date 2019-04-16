package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.service.ProjectService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    @Value("${backend.server.url}")
    private String backendServerUrl;
    @Override
    public List<ProjectModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        ProjectModel[] projectModelResponse = restTemplate.getForObject(backendServerUrl + "/backend/api/project/", ProjectModel[].class);
        return projectModelResponse == null ? Collections.emptyList() : Arrays.asList(projectModelResponse);
    }

    @Override
    public ProjectModel getProjectById(int projectId) {
        RestTemplate restTemplate = new RestTemplate();

        return  restTemplate.getForObject(backendServerUrl + "/backend/api/project/"+projectId, ProjectModel.class);
    }

    @Override
    public ProjectModel getProjectByCode(String projectCode) {
        RestTemplate restTemplate = new RestTemplate();

        return  restTemplate.getForObject(backendServerUrl + "/backend/api/project/"+projectCode, ProjectModel.class);

    }

    @Override
    public ProjectModel getProjectByName(String projectName) {
        RestTemplate restTemplate = new RestTemplate();

        return  restTemplate.getForObject(backendServerUrl + "/backend/api/project/"+projectName, ProjectModel.class);

    }

    @Override
    public ProjectModel saveProject(ProjectModel project) {
        RestTemplate restTemplate = new RestTemplate();

        return  restTemplate.postForEntity(backendServerUrl + "/backend/api/project/", project, ProjectModel.class).getBody();
    }
}
