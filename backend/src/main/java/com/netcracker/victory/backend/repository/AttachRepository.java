package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.AttachEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttachRepository extends CrudRepository<AttachEntity,Integer> {
    List<AttachEntity> findAll();

}
