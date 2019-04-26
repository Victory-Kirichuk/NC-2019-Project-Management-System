package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.TaskEntity;
import com.netcracker.victory.backend.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends CrudRepository<TaskEntity, Integer> {
    List<TaskEntity> findAll();

    TaskEntity findTaskEntityByCode(String code);

    TaskEntity findTaskEntityByName(String name);

    TaskEntity findTaskEntityByAssign(int assign);
    TaskEntity findTaskEntityByUserByAssign(UserEntity userEntity);
    TaskEntity save(TaskEntity taskEntity);



}
