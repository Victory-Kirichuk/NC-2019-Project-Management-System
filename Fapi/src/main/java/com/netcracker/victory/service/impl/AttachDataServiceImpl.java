package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.AttachModel;
import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.service.AttachDataService;
import com.netcracker.victory.service.ProjectDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.swing.table.AbstractTableModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class AttachDataServiceImpl implements AttachDataService {
    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<AttachModel> getAll() {
        RestTemplate restTemplate=new RestTemplate();
        AttachModel[] attachModelResponse=restTemplate.getForObject(backendServerUrl+"/backend/api/attach/", AttachModel[].class);
        return attachModelResponse==null ? Collections.emptyList()  :Arrays.asList(attachModelResponse);
    }

    @Override
    public List<AttachModel> getAttachesByTaskId(Integer taskId) {
        RestTemplate restTemplate=new RestTemplate();
        AttachModel[] attachModelResponse=restTemplate.getForObject(backendServerUrl+"/backend/api/attach/"+taskId,AttachModel[].class);
        return attachModelResponse==null? Collections.emptyList():Arrays.asList(attachModelResponse);
    }

    @Override
    public AttachModel save(AttachModel attachModel) {
        RestTemplate restTemplate=new RestTemplate();
        return  restTemplate.postForEntity(backendServerUrl + "/backend/api/project/", attachModel, AttachModel.class).getBody();
    }
}
