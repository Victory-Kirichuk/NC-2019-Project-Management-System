package com.netcracker.victory.Controllers;

import com.netcracker.victory.converter.TaskConverter;
import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.TaskModel;
import com.netcracker.victory.service.PriorityDataService;
import com.netcracker.victory.service.ProjectDataService;
import com.netcracker.victory.service.StatusDataService;
import com.netcracker.victory.service.TaskDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
    public TaskDataController(ProjectDataService projectDataService, TaskDataService taskDataService, StatusDataService statusDataService, PriorityDataService priorityDataService, TaskConverter taskConverter) {
        this.taskDataService = taskDataService;
        this.statusDataService = statusDataService;
        this.priorityDataService = priorityDataService;
        this.projectDataService = projectDataService;
      this.taskConverter= taskConverter;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public ResponseEntity<List<TaskDTO>> getTaskDTOs() {
        List<TaskModel> taskModels = taskDataService.getAll();
        List<TaskDTO> taskDTOS = taskModels.stream().map(TaskConverter::convert).collect(Collectors.toList());
        return ResponseEntity.ok(taskDTOS);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TaskModel> saveProject(@RequestBody TaskModel taskModel ) {

            return ResponseEntity.ok(taskDataService.save(taskModel));

    }

//    @RequestMapping(method = RequestMethod.POST)
//    public ResponseEntity<AttachModel> save(@RequestBody AttachModel attachModel ) {
//        if (attachModel != null) {
//            return ResponseEntity.ok(attachDataService.save(attachModel));
//        }
//        return null;
//
//
//    }
}
