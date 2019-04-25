package com.netcracker.victory.service;

import com.netcracker.victory.models.PriorityModel;
import com.netcracker.victory.models.ProjectModel;

import java.util.List;

public interface PriorityDataService {
    List<PriorityModel> getAll();
    PriorityModel getPriorityByPriorityId(int priorityId);
}
