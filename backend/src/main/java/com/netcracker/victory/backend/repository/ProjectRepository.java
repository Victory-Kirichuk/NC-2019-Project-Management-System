package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.ProjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity,Integer> {
    List<ProjectEntity> findAll();
    ProjectEntity findProjectEntitiesByProjectCode (String projectCode);
    ProjectEntity findProjectEntitiesByProjectName (String projectName);
    ProjectEntity save(ProjectEntity projectEntity);

    ProjectEntity findProjectEntitiesByProjectId(int projectId);
}
