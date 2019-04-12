package com.netcracker.victory.backend.service.impl;

import com.netcracker.victory.backend.entities.ProjectEntity;
import com.netcracker.victory.backend.repository.ProjectRepository;
import com.netcracker.victory.backend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<ProjectEntity> findAll() {
        return (List<ProjectEntity>) projectRepository.findAll() ;
    }

    @Override
    public ProjectEntity findProjectEntitiesByProjectCode(String projectCode) {
        return projectRepository.findProjectEntitiesByProjectCode(projectCode);
    }

    @Override
    public ProjectEntity findProjectEntitiesByProjectName(String projectName) {
        return projectRepository.findProjectEntitiesByProjectName(projectName);
    }

    @Override
    public ProjectEntity save(ProjectEntity projectEntity) {
        return projectRepository.save(projectEntity);
    }
}
