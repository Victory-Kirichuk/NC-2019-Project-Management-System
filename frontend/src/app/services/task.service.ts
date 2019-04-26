import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import { Task} from '../modules/welcome-page/model/task';
import {Project} from "../modules/welcome-page/model/project";

@Injectable({
  providedIn: 'root'
})
export class TaskService {

  constructor(private http: HttpClient) { }

  getAllTasks(): Observable<Task[]>{
    return this.http.get<Task[]>("/api/task");
  }
  saveNewTask(task: Task): Observable<Task>{
    return this.http.post<Task>("/api/task", task);
  }
}
