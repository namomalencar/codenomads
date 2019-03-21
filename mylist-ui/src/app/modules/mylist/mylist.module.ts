import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MylistRoutingModule } from './mylist-routing.module';
import { MylistFormComponent } from './mylist-form/mylist-form.component';
import { MylistListComponent } from './mylist-list/mylist-list.component';

@NgModule({
  declarations: [MylistFormComponent, MylistListComponent],
  imports: [
    CommonModule,
    MylistRoutingModule
  ]
})
export class MylistModule { }
