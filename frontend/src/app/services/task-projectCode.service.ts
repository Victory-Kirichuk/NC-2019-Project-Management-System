import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {TaskProjectCode} from "../modules/welcome-page/model/task-projectCode";



@Injectable({
  providedIn: 'root'
})
export class TaskProjectCodeService {

  constructor(private http: HttpClient) { }

  getProjectCode(): Observable<TaskProjectCode[]>{
    return this.http.get<TaskProjectCode[]>("/api/project");
  }
}
