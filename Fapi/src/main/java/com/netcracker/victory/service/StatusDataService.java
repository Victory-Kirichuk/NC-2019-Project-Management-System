package com.netcracker.victory.service;

import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.models.StatusModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StatusDataService {
    List<StatusModel> getAll();
    StatusModel getStatusByStatusId(int statusId);


}
