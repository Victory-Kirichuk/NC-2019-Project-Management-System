package com.netcracker.victory.Controllers;

import com.netcracker.victory.models.StatusModel;
import com.netcracker.victory.service.StatusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusDataController {
    @Autowired
    private StatusDataService statusDataService;
    @RequestMapping
    public ResponseEntity<List<StatusModel>> getStatuses(){

            return ResponseEntity.ok(statusDataService.getAll());


    }

    @RequestMapping(value = "/{statusId}", method = RequestMethod.GET)
    public ResponseEntity<StatusModel> getStatusByStatusId(@PathVariable(name = "statusId")int statusId)
    {StatusModel statusModel=statusDataService.getStatusByStatusId(statusId);
    return ResponseEntity.ok(statusModel);
    }
}
