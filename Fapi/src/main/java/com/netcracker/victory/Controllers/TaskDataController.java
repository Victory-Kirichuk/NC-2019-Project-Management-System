package com.netcracker.victory.Controllers;

import com.netcracker.victory.converter.TaskConverter;
import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.TaskModel;
import com.netcracker.victory.service.PriorityDataService;
import com.netcracker.victory.service.ProjectDataService;
import com.netcracker.victory.service.StatusDataService;
import com.netcracker.victory.service.TaskDataService;
import com.netcracker.victory.service.impl.StatusDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/task")
public class TaskDataController {

    private TaskDataService taskDataService;
    private TaskConverter taskConverter;
    private StatusDataService statusDataService;
    private ProjectDataService projectDataService;
    private PriorityDataService priorityDataService;
   @Autowired
   public TaskDataController(ProjectDataService projectDataService, TaskDataService taskDataService, StatusDataService statusDataService, PriorityDataService priorityDataService) {
       this.taskDataService=taskDataService;
       this.statusDataService = statusDataService;
       this.priorityDataService = priorityDataService;
       this.projectDataService = projectDataService;
   }

//    @RequestMapping
//    public  ResponseEntity<List<TaskDTO>> getTaskDTOs(){
//
//       return
//    }
}
