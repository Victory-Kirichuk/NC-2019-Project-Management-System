package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.StatusEntity;
import com.netcracker.victory.backend.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
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

}
