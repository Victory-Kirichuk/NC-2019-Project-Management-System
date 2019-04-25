import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {UserRole} from "./model/UserRole";
import {Subscription} from "rxjs";
import {UserRoleService} from "../../services/user-role.service";
import {TaskPriority} from "./model/task-priority";
import {TaskPriorityService} from "../../services/task-priority.service";
import {ProjectService} from "../../services/project.service";
import {TaskProjectCode} from "./model/task-projectCode";
import {TaskProjectCodeService} from "../../services/task-projectCode.service";
import {UserName} from "./model/user-name";
import {UserNameService} from "../../services/user-name.service";
import {Project} from "./model/project";

@Component({
  selector: 'app-admin-page',
  templateUrl: './welcome-page.component.html',
  styleUrls: ['./welcome-page.component.css']
})
export class WelcomePageComponent implements OnInit {
  private modalRef: BsModalRef;
  userName:UserName[];
  userRole: UserRole[];
  taskPriority: TaskPriority[];
  taskProjectCode: TaskProjectCode[];
  newProject: Project = new Project();

  private subscriptions: Subscription[] = [];

  constructor(   private taskPriorityService: TaskPriorityService,
                 private userRoleService: UserRoleService,private modalService: BsModalService,
               //  private userService: UserService,
             //    private projectService: ProjectService,
                 private taskProjectCodeService: TaskProjectCodeService,
                 private userNameService: UserNameService) { }

  ngOnInit() {  this.loadUserRole();
  this.loadTaskPriority();
  this.loadTaskProjectCode();
  this.loadUserName();
  }
  private loadUserRole() : void {
    this.subscriptions.push(this.userRoleService.getUserRole().subscribe(role => {
      this.userRole = role as UserRole[];
    }));
  }
  private loadTaskPriority() : void{
    this.subscriptions.push(this.taskPriorityService.getPriority().subscribe(priority=>{
      this.taskPriority = priority as TaskPriority[];
    }));

  }
  private loadUserName() :void {
    this.subscriptions.push(this.userNameService.getUserName().subscribe(userName=>{
    this.userName= userName as UserName[];}))

  }

  private loadTaskProjectCode() :void {
    this.subscriptions.push(this.taskProjectCodeService.getProjectCode().subscribe(projectCode=>{
    this.taskProjectCode= projectCode as TaskProjectCode[];
  }))

  }
  // private saveNewUser(){
  //   this.subscriptions.push(this.userService.saveNewUser(this.editableUser).subscribe(()=>{
  //   }))
  // }
  //
  // private saveNewProject(){
  //   this.subscriptions.push(this.projectService.saveNewProject(this.newProject).subscribe());
  // }

  openModal(template:TemplateRef<any>):void  {this.modalRef = this.modalService.show(template);


  }







}
