import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {UserRole} from "../modules/welcome-page/model/UserRole";


@Injectable({
  providedIn: 'root'
})
export class UserRoleService {

  constructor(private http: HttpClient) { }

  getUserRole(): Observable<UserRole[]>{
    return this.http.get<UserRole[]>('/api/role');
  }
  
}
