package com.netcracker.victory.service;

import com.netcracker.victory.models.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    List<Project> getAll();
    Project getProjectByProjectCode (String projectCode);
    Project getProjectByProjectName (String projectName);
    Project save(Project project);
    void delete (int projectId);
}
