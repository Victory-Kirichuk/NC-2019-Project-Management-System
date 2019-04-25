package com.netcracker.victory.Controllers;


import com.netcracker.victory.models.PriorityModel;

import com.netcracker.victory.service.PriorityDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/priority")
public class PriorityDataController {


    @Autowired
    private PriorityDataService priorityDataService;

    @RequestMapping()
    public ResponseEntity<List<PriorityModel>> getProjects(){
        return ResponseEntity.ok(priorityDataService.getAll());
    }







}
