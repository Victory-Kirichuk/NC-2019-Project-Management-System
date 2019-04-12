package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.PriorityEntity;
import com.netcracker.victory.backend.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/backend/api/priority")
public class PriorityController {



    @Autowired
    public PriorityService priorityService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<PriorityEntity> getAllPriority() {
        return priorityService.findAll();
    }

}
