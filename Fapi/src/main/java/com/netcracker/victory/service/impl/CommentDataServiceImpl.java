package com.netcracker.victory.service.impl;


import com.netcracker.victory.models.CommentModel;

import com.netcracker.victory.service.CommentDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CommentDataServiceImpl implements CommentDataService {
    @Value("${backend.server.url}")
    private String backendServerUrl;


    @Override
    public List<CommentModel> getAll() {
        RestTemplate restTemplate=new RestTemplate();
        CommentModel[] commentModelResponse=restTemplate.getForObject(backendServerUrl+"/backend/api/comment/", CommentModel[].class);
        return commentModelResponse==null ? Collections.emptyList()  :Arrays.asList(commentModelResponse);
    }

    @Override
    public List<CommentModel> getCommentsByTaskId(Integer taskId) {
        RestTemplate restTemplate=new RestTemplate();

        CommentModel[] commentModelResponse=restTemplate.getForObject(backendServerUrl+"/backend/api/comment/"+taskId, CommentModel[].class);
        return commentModelResponse==null ? Collections.emptyList()  :Arrays.asList(commentModelResponse);
    }

    @Override
    public CommentModel save(CommentModel commentModel) {
        RestTemplate restTemplate=new RestTemplate();
        return  restTemplate.postForEntity(backendServerUrl + "/backend/api/project/",commentModel, CommentModel.class).getBody();
    }


}
