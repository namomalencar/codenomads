import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Mylist } from '../models/mylist';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class MylistService {
  

  constructor(
    private http: HttpClient
  ) { }
      
  listAll(){
      return this.http
                 .get<Mylist []>(environment.urlApi + '/mylist');
      
  }
}
