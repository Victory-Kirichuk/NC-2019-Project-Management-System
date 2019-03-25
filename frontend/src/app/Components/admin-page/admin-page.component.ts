import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";

@Component({
  selector: 'app-admin-page',
  templateUrl: './admin-page.component.html',
  styleUrls: ['./admin-page.component.css']
})
export class AdminPageComponent implements OnInit {
  private modalRef: BsModalRef;


  constructor( private modalService: BsModalService) { }

  ngOnInit() {
  }

  public openModal(template:TemplateRef<any>):void  {this.modalRef = this.modalService.show(template);


  }

  public closeModal(): void {
    this.modalRef.hide();
  }
}
