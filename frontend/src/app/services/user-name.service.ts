import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {User} from "../modules/welcome-page/model/user";
import {Task} from "../modules/welcome-page/model/task";



@Injectable({
  providedIn: 'root'
})
export class UserNameService {

  constructor(private http: HttpClient) { }

  getUserName(): Observable<User[]>{
    return this.http.get<User[]>('/api/user');
  }
 saveNewUser(user:User):Observable<User>{
    return this.http.post<User>("api/user",user);
 }





}
