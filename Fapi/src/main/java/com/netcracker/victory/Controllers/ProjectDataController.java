package com.netcracker.victory.Controllers;


import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.service.ProjectDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectDataController {


    @Autowired
    private ProjectDataService projectDataService;

    @RequestMapping()
    public ResponseEntity<List<ProjectModel>> getProjects(){
        return ResponseEntity.ok(projectDataService.getAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ProjectModel> saveProject(@RequestBody ProjectModel projectModel ) {
        if (projectModel != null) {
            return ResponseEntity.ok(projectDataService.saveProject(projectModel));
        }
        return null;
    }

    @RequestMapping (value = "/code/{projectCode}",method = RequestMethod.GET)
    public ResponseEntity<ProjectModel> getProjectByProjectCode(@PathVariable(name ="projectCode")String projectCode)
    {ProjectModel projectEntity=projectDataService.getProjectByProjectCode(projectCode);
        return  ResponseEntity.ok(projectEntity);}



}
