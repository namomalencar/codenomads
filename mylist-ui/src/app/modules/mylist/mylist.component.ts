import { Component, OnInit } from '@angular/core';
import { MylistService } from 'src/app/core/services/mylist.service';
import { Mylist } from 'src/app/core/models/mylist';

@Component({
  selector: 'app-mylist',
  templateUrl: './mylist.component.html',
  styleUrls: ['./mylist.component.css']
})
export class MylistComponent implements OnInit {

  mylists: object[] = [];

  constructor(private mylistService: MylistService) { }

  ngOnInit() {
    this.mylistService
      .listAll()
      .subscribe(response => {
        this.mylists = response;
      });
  }

  save(mylist: Mylist) {
    this.mylistService
      .save(mylist)
      .subscribe(response => {
        this.mylists.unshift(response);
      });
  }

  delete(mylist: Mylist){
    this.mylistService
    .delete(mylist)
    .subscribe(response => {
      this.mylists = this.arrayRemove(this.mylists, mylist);
    });
  }

  
  private arrayRemove(arr, value) {
    return arr.filter(function(element){
        return element != value;
    });

}



}
