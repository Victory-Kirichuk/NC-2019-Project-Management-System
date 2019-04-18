package com.netcracker.victory.service.impl;

import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.models.RoleModel;
import com.netcracker.victory.service.ProjectDataService;
import com.netcracker.victory.service.RoleDataService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class RoleDataServiceImpl implements RoleDataService {
    @Value("${backend.server.url}")
    private String backendServerUrl;

    @Override
    public List<RoleModel> getAll() {
        RestTemplate restTemplate = new RestTemplate();
        RoleModel[] roleModelResponse= restTemplate.getForObject(backendServerUrl+"/backend/api/role",RoleModel[].class);
    return  roleModelResponse ==null? Collections.emptyList():Arrays.asList(roleModelResponse);}

    @Override
    public RoleModel getRoleByRoleId(int roleId) {
        RestTemplate restTemplate=new RestTemplate();
  return restTemplate.getForObject(backendServerUrl+"/backend/api/role/"+roleId,RoleModel.class) ; }
}



