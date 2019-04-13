package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.TaskEntity;
import com.netcracker.victory.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/backend/api/task")
public class TaskController {
    @Autowired
    public TaskService taskService;
    @RequestMapping (value = "/code/{Code}",method = RequestMethod.GET)
    public ResponseEntity<TaskEntity> getTaskEntityByCode(@PathVariable(name ="Code")String Code)
    {TaskEntity taskEntity=taskService.findTaskEntityByCode(Code);

        return  ResponseEntity.ok(taskEntity);}

    @RequestMapping (value = "/name/{name}",method = RequestMethod.GET)
    public ResponseEntity<TaskEntity> getTaskEntityByName(@PathVariable(name ="name")String name)
    {TaskEntity taskEntity=taskService.findTaskEntityByCode(name);
        return  ResponseEntity.ok(taskEntity);}



    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<TaskEntity> getAllTaskEntities() {
        return taskService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public TaskEntity saveUser(@RequestBody TaskEntity taskEntity) {return  taskService.save(taskEntity);}

}
