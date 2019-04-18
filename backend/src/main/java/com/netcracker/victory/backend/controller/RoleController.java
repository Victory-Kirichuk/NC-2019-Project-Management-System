package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.RoleEntity;
import com.netcracker.victory.backend.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/{roleId}",method = RequestMethod.GET)
    public ResponseEntity<RoleEntity> getStatusById(@PathVariable(name = "roleId")int roleId) {
        RoleEntity roleEntity=roleService.findRoleEntityByRoleId(roleId);
        return  ResponseEntity.ok(roleEntity);

}}
