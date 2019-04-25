import { Component, OnInit } from '@angular/core';
import {Project} from "../../project";
import {BsModalRef} from "ngx-bootstrap";
import {UserName} from "../../user-name";
import {UserRole} from "../../UserRole";
import {TaskPriority} from "../../task-priority";
import {TaskProjectCode} from "../../task-projectCode";
import {Subscription} from "rxjs";
import {ProjectService} from "../../../../../services/project.service";

@Component({
  selector: 'app-new-page',
  templateUrl: './new-project.component.html',
  styleUrls: ['./new-project.component.css']
})
export class NewProjectComponent implements OnInit {

  private modalRef: BsModalRef;

  newProject: Project = new Project();
  private subscriptions: Subscription[] = [];
  constructor(private projectService: ProjectService) { }
  private saveNewProject(){
    this.subscriptions.push(this.projectService.saveNewProject(this.newProject).subscribe(()=>{
      this.newProject = new Project();
    }))
  }
  ngOnInit() {
  }
  closeModal(): void {
    this.modalRef.hide();
  }
}
