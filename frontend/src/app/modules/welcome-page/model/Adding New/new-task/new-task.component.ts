import { Component, OnInit } from '@angular/core';
import {NgbActiveModal} from "@ng-bootstrap/ng-bootstrap";
import {Project} from "../../../models/project";
import {TaskStatus} from "../../../models/task-status";
import {Task} from "../../../models/task";
import {User} from "../../../models/user";
import {Subscription} from "rxjs";
import {TaskPriority} from "../../../models/task-priority";
import {TaskStatusService} from "../../../../services/task-status.service";
import {TaskPriorityService} from "../../../../services/task-priority.service";
import {ProjectService} from "../../../../services/project.service";
import {UserService} from "../../../../services/user.service";
import {TaskService} from "../../../../services/task.service";

@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {

  allProjects : Project[];
  allPriority: TaskPriority[];
  allUsers : User[];
  newTask: Task = new Task();
  private subscriptions: Subscription[] = [];


  constructor(private activeModal: NgbActiveModal,
              private priorityService: TaskPriorityService,
              private projectService: ProjectService,
              private userService: UserService,
              private taskService: TaskService) { }

  ngOnInit() {
    this.loadProjects();
    this.loadTaskPriority();
    this.loadUsers();
  }

  private loadTaskPriority() : void{
    this.subscriptions.push(this.priorityService.getPriority().subscribe(priority=>{
      this.allPriority = priority as TaskPriority[];
    }));
  }

  private loadProjects() : void{
    this.subscriptions.push(this.projectService.getAllProject().subscribe( project=>{
      this.allProjects = project as Project[];
    }))
  }

  private loadUsers() : void{
    this.subscriptions.push(this.userService.getAllUsers().subscribe( user=>{
      this.allUsers = user as User[];
    }))
  }

  private saveNewTask(){
    this.subscriptions.push(this.taskService.saveNewTask(this.newTask).subscribe(()=>{
      this.newTask = new Task();
    }))
  }


}
