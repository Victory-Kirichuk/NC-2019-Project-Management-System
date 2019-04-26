import {Component, OnInit, TemplateRef} from '@angular/core';
import {Project} from "../../project";
import {BsModalRef, BsModalService} from "ngx-bootstrap";
import {Subscription} from "rxjs";
import {ProjectService} from "../../../../../services/project.service";

@Component({
  selector: 'app-new-project',
  templateUrl: './new-project.component.html',
  styleUrls: ['./new-project.component.css']
})
export class NewProjectComponent implements OnInit {

  private modalRef: BsModalRef;

  newProject: Project = new Project();
  private subscriptions: Subscription[] = [];
  constructor(private projectService: ProjectService,private modalService: BsModalService,) { }
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
  openModal(template:TemplateRef<any>):void  {this.modalRef = this.modalService.show(template);


  }
}
