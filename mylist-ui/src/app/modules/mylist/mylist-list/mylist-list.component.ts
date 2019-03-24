import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Mylist } from 'src/app/core/models/mylist';

@Component({
  selector: 'app-mylist-list',
  templateUrl: './mylist-list.component.html',
  styleUrls: ['./mylist-list.component.css']
})
export class MylistListComponent implements OnInit {

  @Input() mylists: object[] = [];
  
  @Output() toDelete = new EventEmitter<Mylist>();

  constructor() { }

  ngOnInit(): void {  }

  delete(mylist: Mylist){
    this.toDelete.emit(mylist);
  }
}
