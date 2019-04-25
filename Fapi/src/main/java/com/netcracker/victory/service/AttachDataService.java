package com.netcracker.victory.service;

import com.netcracker.victory.models.AttachModel;

import java.util.List;

public interface AttachDataService {
    List<AttachModel> getAll();
    List<AttachModel> getAttachesByTaskId(Integer taskId);
    AttachModel save(AttachModel attachModel);
}
