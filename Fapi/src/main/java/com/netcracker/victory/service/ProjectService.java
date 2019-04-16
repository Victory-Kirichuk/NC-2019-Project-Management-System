package com.netcracker.victory.service;

import com.netcracker.victory.models.ProjectModel;

import java.util.List;

public interface ProjectService {
    List<ProjectModel> getAll();
    ProjectModel getProjectById(int projectId);
    ProjectModel getProjectByCode (String projectCode);
    ProjectModel getProjectByName(String projectName);
    ProjectModel saveProject(ProjectModel project);
}
