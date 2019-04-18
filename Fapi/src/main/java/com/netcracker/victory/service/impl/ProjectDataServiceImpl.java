package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.service.ProjectDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Service
public class ProjectDataServiceImpl implements ProjectDataService {
    @Value("${backend.server.url}")
    private String backendServerUrl;
    @Override
    public List<ProjectModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        ProjectModel[] projectModelResponse = restTemplate.getForObject(backendServerUrl + "/backend/api/project/", ProjectModel[].class);
        return projectModelResponse == null ? Collections.emptyList() : Arrays.asList(projectModelResponse);
    }

    @Override
    public ProjectModel getProjectByProjectCode(String projectCode) {
        RestTemplate restTemplate = new RestTemplate();
        return  restTemplate.getForObject(backendServerUrl + "/backend/api/project/code/"+projectCode, ProjectModel.class);

    }



    @Override
    public ProjectModel getProjectByName(String projectName) {
        RestTemplate restTemplate = new RestTemplate();

        return  restTemplate.getForObject(backendServerUrl + "/backend/api/project/name/"+projectName, ProjectModel.class);

    }

    @Override
    public ProjectModel saveProject(ProjectModel project) {
        RestTemplate restTemplate = new RestTemplate();

        return  restTemplate.postForEntity(backendServerUrl + "/backend/api/project/", project, ProjectModel.class).getBody();
    }
}
