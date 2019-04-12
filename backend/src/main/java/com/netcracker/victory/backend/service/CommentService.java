package com.netcracker.victory.backend.service;



import com.netcracker.victory.backend.entities.CommentEntity;

import java.util.List;

public interface CommentService {
List<CommentEntity> findAll();
CommentEntity save(CommentEntity commentEntity);

}
