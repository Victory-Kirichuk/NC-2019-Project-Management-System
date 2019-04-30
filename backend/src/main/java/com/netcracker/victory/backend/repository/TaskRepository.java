package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.TaskEntity;
import com.netcracker.victory.backend.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Integer> {
    Page<TaskEntity> findAll(Pageable pageable);

    TaskEntity findTaskEntityByCode(String code);

    TaskEntity findTaskEntityByName(String name);

    Page<TaskEntity> findTaskEntityByAssign(int assign, Pageable pageable);
    Page<TaskEntity> findTaskEntityByUserByAssign(UserEntity userEntity, Pageable pageable);
    TaskEntity save(TaskEntity taskEntity);



}
