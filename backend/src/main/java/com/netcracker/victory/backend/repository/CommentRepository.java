package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.CommentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<CommentEntity,Integer> {
    List<CommentEntity> findAll();
}
