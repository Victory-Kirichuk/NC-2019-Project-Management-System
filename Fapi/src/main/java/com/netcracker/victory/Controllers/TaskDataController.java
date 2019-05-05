package com.netcracker.victory.Controllers;

import com.netcracker.victory.converter.TaskConverter;
import com.netcracker.victory.models.DTO.TaskDTO;
import com.netcracker.victory.models.DTO.PageDTO;
import com.netcracker.victory.models.TaskModel;
import com.netcracker.victory.service.PriorityDataService;
import com.netcracker.victory.service.ProjectDataService;
import com.netcracker.victory.service.StatusDataService;
import com.netcracker.victory.service.TaskDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    private String currentPage;


    @Autowired
    public TaskDataController(ProjectDataService projectDataService, TaskDataService taskDataService, StatusDataService statusDataService, PriorityDataService priorityDataService, TaskConverter taskConverter) {
        this.taskDataService = taskDataService;
        this.statusDataService = statusDataService;
        this.priorityDataService = priorityDataService;
        this.projectDataService = projectDataService;
        this.taskConverter = taskConverter;
    }

    @RequestMapping(value = "/page/{currentPage}", method = RequestMethod.GET)
    public ResponseEntity<Page<TaskDTO>> getTaskDTOs(@PathVariable(name = "currentPage")int currentPage) {
        Page<TaskModel> taskModels = taskDataService.getAll(currentPage);
        List<TaskDTO> taskDTOS = taskModels.getContent().stream().map(TaskConverter::convert).collect(Collectors.toList());
        Page<TaskDTO> taskDTOPage = new PageImpl<>(taskDTOS);
        PageDTO restPageDTO = new PageDTO();
        restPageDTO.setListPage(taskDTOS);
        restPageDTO.setTotalElements((int) taskModels.getTotalElements());
        restPageDTO.setTotalPages(taskModels.getTotalPages());
        restPageDTO.setNumberOfElements(taskModels.getNumberOfElements());
        restPageDTO.setCurrentPage(taskModels.getNumber());


        return ResponseEntity.ok(taskDTOPage);

    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<TaskModel> saveProject(@RequestBody TaskModel taskModel) {
        //       ResponseEntity<TaskModel> responseEntity = ResponseEntity.ok(taskDataService.save(taskModel));
//        TaskModel taskModel1 = responseEntity.getBody();
//        taskModel1.setCreateDate()
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
