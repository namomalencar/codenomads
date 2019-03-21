import { Component, OnInit } from '@angular/core';
import { MylistService } from '../mylist/mylist.service';

@Component({
  selector: 'app-mylist-list',
  templateUrl: './mylist-list.component.html',
  styleUrls: ['./mylist-list.component.css']
})
export class MylistListComponent implements OnInit {

  mylists: object[] = [];
  private mylistService: MylistService;

  constructor(mylistService: MylistService) {
    this.mylistService = mylistService;
  }

  ngOnInit(): void {
    this.mylistService
      .listAll()
      .subscribe(response => { 
        this.mylists = response;
      });
      
  }

}
