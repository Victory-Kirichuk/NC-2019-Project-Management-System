package com.netcracker.victory.backend.service;

import com.netcracker.victory.backend.entities.ProjectEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    List<ProjectEntity> findAll();
    ProjectEntity findProjectEntitiesByProjectCode (String projectCode);
    ProjectEntity findProjectEntitiesByProjectName (String projectName);
    ProjectEntity findProjectEntitiesByProjectId (int projectId);
    ProjectEntity save(ProjectEntity projectEntity);
}
