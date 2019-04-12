package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.RoleEntity;
import com.netcracker.victory.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/backend/api/role")
public class RoleController {



    @Autowired
    public RoleService roleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<RoleEntity> getAllRoles() {
        return roleService.findAll();
    }

}
