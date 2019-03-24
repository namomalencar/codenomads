import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MylistRoutingModule } from './mylist-routing.module';
import { MylistFormComponent } from './mylist-form/mylist-form.component';
import { MylistListComponent } from './mylist-list/mylist-list.component';
import { MylistComponent } from './mylist.component';
import { ReactiveFormsModule } from '@angular/forms';

@NgModule({
  declarations: [MylistFormComponent, MylistListComponent, MylistComponent],
  imports: [
    CommonModule,
    ReactiveFormsModule,
    MylistRoutingModule
  ]
})
export class MylistModule { }
