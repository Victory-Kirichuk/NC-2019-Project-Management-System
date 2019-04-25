package com.netcracker.victory.Controllers;


import com.netcracker.victory.models.AttachModel;

import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.service.AttachDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attach")
public class AttachDataController {


    @Autowired
    private AttachDataService attachDataService;

    @RequestMapping()
    public ResponseEntity<List<AttachModel>> getAttaches(){
        return ResponseEntity.ok(attachDataService.getAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<AttachModel> save(@RequestBody AttachModel attachModel ) {
        if (attachModel != null) {
            return ResponseEntity.ok(attachDataService.save(attachModel));
        }
        return null;


    }

    @RequestMapping (value = "/{taskId}",method = RequestMethod.GET)
    public ResponseEntity<List<AttachModel>> getAttachesByTaskId(@PathVariable(name ="taskId")int taskId)
    {
        return  ResponseEntity.ok(attachDataService.getAttachesByTaskId(taskId));}



}
