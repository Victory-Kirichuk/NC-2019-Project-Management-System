package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.AttachEntity;
import com.netcracker.victory.backend.service.AttachService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/api/attach")
public class AttachController {

@Autowired
  public AttachService attachService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<AttachEntity> getAllAttaches() {
        return attachService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public AttachEntity saveAttach(@RequestBody AttachEntity attachEntity) {return  attachService.save(attachEntity);}


}
