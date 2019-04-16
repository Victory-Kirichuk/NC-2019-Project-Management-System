package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.StatusEntity;
import com.netcracker.victory.backend.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/backend/api/status")
public class StatusController {



    @Autowired
    public StatusService statusService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<StatusEntity> getAllRoles() {
        return statusService.findAll();
    }
    @RequestMapping(value = "/{statusId}", method = RequestMethod.GET)
    public ResponseEntity<StatusEntity> getStatusById(@PathVariable(name = "statusId")Integer statusId) {
    StatusEntity statusEntity=statusService.findStatusById(statusId);
    return  ResponseEntity.ok(statusEntity);
    }

}
