package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.ProjectEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectEntity,Integer> {
}
