import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

import {Observable} from "rxjs";
import {Project} from "../modules/welcome-page/model/project";

@Injectable({
  providedIn: 'root'
})
export class ProjectService {

  constructor( private http: HttpClient) { }

  saveNewProject(project: Project): Observable<Project>{
    return this.http.post<Project>("/api/project", project);
  }
}
