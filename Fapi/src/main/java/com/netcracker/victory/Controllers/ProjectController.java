package com.netcracker.victory.Controllers;

import com.netcracker.victory.models.Project;
import com.netcracker.victory.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("PrController")
@RequestMapping("/backend/api/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @RequestMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        return ResponseEntity.ok(projectService.getAll());
    }
}
