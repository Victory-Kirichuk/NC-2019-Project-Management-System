package com.netcracker.victory.service;

import com.netcracker.victory.models.ProjectModel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProjectDataService {
    List<ProjectModel> getAll();
    ProjectModel getProjectByProjectCode (String projectCode);
    ProjectModel getProjectByProjectName(String projectName);
    ProjectModel getProjectByProjectId(int projectId);
    ProjectModel saveProject(ProjectModel project);
}
