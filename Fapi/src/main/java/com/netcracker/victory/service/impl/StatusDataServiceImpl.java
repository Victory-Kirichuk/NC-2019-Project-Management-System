package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.models.StatusModel;
import com.netcracker.victory.service.ProjectDataService;
import com.netcracker.victory.service.StatusDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class StatusDataServiceImpl implements StatusDataService {
    @Value("${backend.server.url}")
    private String backendServerUrl;


    @Override
    public List<StatusModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();

        StatusModel[] statusModelResponse = restTemplate.getForObject(backendServerUrl + "/backend/api/status/", StatusModel[].class);
        return statusModelResponse == null ? Collections.emptyList() : Arrays.asList(statusModelResponse);

    }

    @Override
    public StatusModel getStatusByStatusId(int statusId) {
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject(backendServerUrl+"/backend/api/status/"+statusId,StatusModel.class);
    }


}
