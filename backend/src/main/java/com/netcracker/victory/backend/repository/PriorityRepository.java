package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.PriorityEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PriorityRepository extends CrudRepository<PriorityEntity,Integer> {
    List<PriorityEntity> findAll();
}
