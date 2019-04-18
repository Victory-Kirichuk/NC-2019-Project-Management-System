package com.netcracker.victory.service;

import com.netcracker.victory.models.RoleModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleDataService {
    List<RoleModel> getAll();
    RoleModel getRoleByRoleId(int roleId);

}
