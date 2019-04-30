package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.TaskEntity;
import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;

@RestController
@RequestMapping("/backend/api/task")
public class TaskController {
    @Autowired
    public TaskService taskService;
    @RequestMapping (value = "/code/{code}",method = RequestMethod.GET)
    public ResponseEntity<TaskEntity> getTaskEntityByCode(@PathVariable(name ="code")String code)
    {TaskEntity taskEntity=taskService.findTaskEntityByCode(code);

        return  ResponseEntity.ok(taskEntity);}


    @RequestMapping (value = "/name/{name}",method = RequestMethod.GET)
    public ResponseEntity<TaskEntity> getTaskEntityByName(@PathVariable(name ="name")String name)
    {TaskEntity taskEntity=taskService.findTaskEntityByCode(name);
        return  ResponseEntity.ok(taskEntity);}

//        @RequestMapping(value = "/userByAssign/{userByAssign}",method =RequestMethod.GET )
//        public ResponseEntity<TaskEntity> getTaskEntityByUserByAssign(@PathVariable(name = "userByAssign"))




    @RequestMapping(value = "", method = RequestMethod.GET)
    public Pageable<TaskEntity> getAllTaskEntities() {
        return taskService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public TaskEntity saveUser(@RequestBody TaskEntity taskEntity) {return  taskService.save(taskEntity);}

}
