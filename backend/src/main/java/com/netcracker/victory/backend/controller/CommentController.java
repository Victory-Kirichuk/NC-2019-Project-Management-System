package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.CommentEntity;
import com.netcracker.victory.backend.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/backend/api/comments")
public class CommentController {

@Autowired
  public CommentService commentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<CommentEntity> getAllComments() {
        return commentService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public CommentEntity saveAttach(@RequestBody CommentEntity commentEntity) {return  commentService.save(commentEntity);}


}
