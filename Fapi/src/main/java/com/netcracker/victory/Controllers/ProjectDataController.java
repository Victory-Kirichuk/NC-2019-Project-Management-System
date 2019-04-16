package com.netcracker.victory.Controllers;


import com.netcracker.victory.models.ProjectModel;
import com.netcracker.victory.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fapi")
public class ProjectDataController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping
    public ResponseEntity<List<ProjectModel>> getProjects(){
        return ResponseEntity.ok(projectService.getAll());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<ProjectModel> saveProject(@RequestBody ProjectModel projectModel ) {
        if (projectModel != null) {
            return ResponseEntity.ok(projectService.saveProject(projectModel));
        }
        return null;
    }



}
