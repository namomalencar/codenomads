import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Mylist } from './mylist'

const API = 'http://localhost:9093';

@Injectable({providedIn: 'root'})
export class MylistService{

    private http: HttpClient;

    constructor(http: HttpClient){
        this.http = http;
    }
        
    listAll(){
        return this.http
                   .get<Mylist []>(API + '/mylist');
        
    }
}