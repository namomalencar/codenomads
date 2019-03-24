import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MylistListComponent } from './mylist-list/mylist-list.component';
import { MylistFormComponent } from './mylist-form/mylist-form.component';
import { MylistComponent } from './mylist.component';

const routes: Routes = [
  {
    path: '',
    redirectTo: '/mylists/show',
    pathMatch: 'full'
  }, 
  {
    path: 'show',
    component: MylistComponent,
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class MylistRoutingModule { }
