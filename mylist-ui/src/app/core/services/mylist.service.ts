import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Mylist } from '../models/mylist';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MylistService {

  constructor(private http: HttpClient) { }
      
  listAll(){
      return this.http
                 .get<Mylist []>(this.prefix);
      
  }

  save(mylist: Mylist): Observable<any> {
    return this.http.post(this.prefix, mylist);
  }

  delete(mylist: Mylist): Observable<any> {
    const httpOptions = {
      headers: new HttpHeaders({ 'Content-Type': 'application/json' }), 
      body: mylist.id
    };
    return this.http.delete(this.prefix, httpOptions);
  }

  get prefix() {
    return environment.urlApi + '/mylist'
  }
}
