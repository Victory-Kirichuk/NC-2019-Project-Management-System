package com.netcracker.victory.backend.service.impl;


import com.netcracker.victory.backend.entities.CommentEntity;

import com.netcracker.victory.backend.repository.CommentRepository;

import com.netcracker.victory.backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;



    @Override
    public List<CommentEntity> findAll() {
        return (List<CommentEntity>) commentRepository.findAll();
    }

    @Override
    public CommentEntity save(CommentEntity commentEntity) {
        return null;
    }
}

