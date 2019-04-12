package com.netcracker.victory.backend.controller;

import com.netcracker.victory.backend.entities.ProjectEntity;
import com.netcracker.victory.backend.entities.UserEntity;
import com.netcracker.victory.backend.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/backend/api/project")
public class ProjectController {
    @Autowired
    public ProjectService projectService;



    @RequestMapping (value = "/name/{projectName}",method = RequestMethod.GET)
    public ResponseEntity<ProjectEntity> getProjectByProjectName(@PathVariable(name ="projectName")String projectName)
    {ProjectEntity projectEntity=projectService.findProjectEntitiesByProjectName(projectName);
        return  ResponseEntity.ok(projectEntity);}

    @RequestMapping (value = "/code/{projectCode}",method = RequestMethod.GET)
    public ResponseEntity<ProjectEntity> getProjectByProjectCode(@PathVariable(name ="projectCode")String projectCode)
    {ProjectEntity projectEntity=projectService.findProjectEntitiesByProjectCode(projectCode);
        return  ResponseEntity.ok(projectEntity);}


    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ProjectEntity> getAllProjectEntities() {
        return projectService.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public ProjectEntity saveUser(@RequestBody ProjectEntity projectEntity) {return  projectService.save(projectEntity);}

}
