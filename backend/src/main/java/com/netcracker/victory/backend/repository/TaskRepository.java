package com.netcracker.victory.backend.repository;

import com.netcracker.victory.backend.entities.TaskEntity;
import com.netcracker.victory.backend.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface TaskRepository extends PagingAndSortingRepository<TaskEntity, Integer> {
  //  Page<TaskEntity> findAll(Pageable pageable);

    List<TaskEntity> findAll();

    TaskEntity findTaskEntityByCode(String code);

    TaskEntity findTaskEntityByName(String name);

    //Page<TaskEntity> findTaskEntityByAssign(int assign, Pageable pageableAs);

    TaskEntity save(TaskEntity taskEntity);


}
