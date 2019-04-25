import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {TaskPriority} from "../modules/welcome-page/model/task-priority";


@Injectable({
  providedIn: 'root'
})
export class TaskPriorityService {

  constructor(private http: HttpClient) { }

  getPriority(): Observable<TaskPriority[]>{
    return this.http.get<TaskPriority[]>("/api/priority");
  }
}
