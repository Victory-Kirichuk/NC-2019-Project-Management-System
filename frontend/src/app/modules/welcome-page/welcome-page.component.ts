import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";

@Component({
  selector: 'app-admin-page',
  templateUrl: './welcome-page.component.html',
  styleUrls: ['./welcome-page.component.css']
})
export class WelcomePageComponent implements OnInit {
  private modalRef: BsModalRef;


  constructor( private modalService: BsModalService) { }

  ngOnInit() {
  }

  openModal(template:TemplateRef<any>):void  {this.modalRef = this.modalService.show(template);


  }

   closeModal(): void {
    this.modalRef.hide();
  }

  addProject() {

  }
}