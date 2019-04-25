import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {UserName} from "../modules/welcome-page/model/user-name";



@Injectable({
  providedIn: 'root'
})
export class UserNameService {

  constructor(private http: HttpClient) { }

  getUserName(): Observable<UserName[]>{
    return this.http.get<UserName[]>('/api/user');
  }
  
}
