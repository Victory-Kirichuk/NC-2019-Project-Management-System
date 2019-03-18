import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend';

  constructor(private http: HttpClient) {

  }

  public clickFunction(): void {
    this.http.get("/api/").subscribe(value => {
      console.log(value);
    })
  }
}
