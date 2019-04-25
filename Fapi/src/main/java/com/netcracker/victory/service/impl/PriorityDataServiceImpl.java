package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.PriorityModel;
import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.service.PriorityDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class PriorityDataServiceImpl implements PriorityDataService {
    @Value("${backend.server.url}")
    private String backendServerUrl;


    @Override
    public List<PriorityModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        PriorityModel[] priorityModelResponse= restTemplate.getForObject(backendServerUrl+"/backend/api/priority",PriorityModel[].class);
        return  priorityModelResponse ==null? Collections.emptyList():Arrays.asList(priorityModelResponse);}


    @Override
    public PriorityModel getPriorityByPriorityId(int priorityId) {
        return null;
    }
}
