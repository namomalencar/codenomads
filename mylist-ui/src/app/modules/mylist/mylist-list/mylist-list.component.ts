import { Component, OnInit } from '@angular/core';
import { MylistService } from 'src/app/core/services/mylist.service';

@Component({
  selector: 'app-mylist-list',
  templateUrl: './mylist-list.component.html',
  styleUrls: ['./mylist-list.component.css']
})
export class MylistListComponent implements OnInit {

  mylists: object[] = [];

  constructor(
    private mylistService: MylistService
  ) { }

  ngOnInit(): void {
    this.mylistService
      .listAll()
      .subscribe(response => { 
        this.mylists = response;
    });
  }
}
