import {Component, OnInit, TemplateRef} from '@angular/core';
import {BsModalRef, BsModalService} from "ngx-bootstrap";

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  private modalRef: BsModalRef;


  constructor( private modalService: BsModalService) { }

  ngOnInit() {
  }
// noinspection JSAnnotator
  openModal(template:TemplateRef<any>):void  {this.modalRef = this.modalService.show(template);


  }

  closeModal(): void {
    this.modalRef.hide();
  }


}
