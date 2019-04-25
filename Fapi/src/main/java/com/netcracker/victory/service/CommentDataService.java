package com.netcracker.victory.service;

import com.netcracker.victory.models.CommentModel;

import java.util.List;

public interface CommentDataService {
    List<CommentModel> getAll();
    List<CommentModel> getCommentsByTaskId(Integer taskId);
    CommentModel save(CommentModel commentModel);
}
