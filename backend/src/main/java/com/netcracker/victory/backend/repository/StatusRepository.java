package com.netcracker.victory.backend.repository;


import com.netcracker.victory.backend.entities.StatusEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StatusRepository extends CrudRepository<StatusEntity,Integer> {
    List<StatusEntity> findAll();
}
