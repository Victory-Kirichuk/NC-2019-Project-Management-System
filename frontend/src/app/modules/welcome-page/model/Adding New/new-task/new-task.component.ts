import {Component, OnInit, TemplateRef} from '@angular/core';
import {TaskPriority} from "../../task-priority";
import {UserName} from "../../user-name";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {TaskProjectCode} from "../../task-projectCode";

import {Subscription} from "rxjs";
import {TaskPriorityService} from "../../../../../services/task-priority.service";
import {UserRoleService} from "../../../../../services/user-role.service";
import {TaskProjectCodeService} from "../../../../../services/task-projectCode.service";
import {UserNameService} from "../../../../../services/user-name.service";
import {Project} from "../../project";
import {TaskService} from "../../../../../services/task.service";
import {Task} from "../../task";

@Component({
  selector: 'app-new-task',
  templateUrl: './new-task.component.html',
  styleUrls: ['./new-task.component.css']
})
export class NewTaskComponent implements OnInit {
  private modalRef: BsModalRef;
  userName: UserName[];

  taskPriority: TaskPriority[];
  taskProjectCode: TaskProjectCode[];
  newTask:Task=new Task();

  private subscriptions: Subscription[] = [];

  constructor(private taskPriorityService: TaskPriorityService,
              private userRoleService: UserRoleService, private modalService: BsModalService,
              //  private userService: UserService,
              //    private projectService: ProjectService,
              private taskProjectCodeService: TaskProjectCodeService,
              private userNameService: UserNameService,
              private taskService:TaskService) {
  }

  ngOnInit() {
    this.loadTaskPriority();
    this.loadTaskProjectCode();
    this.loadUserName();

  }

 private saveNewTask(){
    this.subscriptions.push(this.taskService.saveNewTask(this.newTask).subscribe(()=>{
      this.newTask=new Task();
    }))
 }

  private loadTaskPriority(): void {
    this.subscriptions.push(this.taskPriorityService.getPriority().subscribe(priority => {
      this.taskPriority = priority as TaskPriority[];
    }));

  }

  private loadTaskProjectCode(): void {
    this.subscriptions.push(this.taskProjectCodeService.getProjectCode().subscribe(projectCode => {
      this.taskProjectCode = projectCode as TaskProjectCode[];
    }))
  }

  private loadUserName(): void {
    this.subscriptions.push(this.userNameService.getUserName().subscribe(userName => {
      this.userName = userName as UserName[];
    }))

  }

  openModal(template: TemplateRef<any>): void {
    this.modalRef = this.modalService.show(template);
  }

  closeModal(): void {
    this.modalRef.hide();
  }
}
