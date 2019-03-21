import { NgModule } from '@angular/core';
import { Routes, RouterModule, RouterOutlet } from '@angular/router';

import { MylistListComponent } from './mylists/mylist-list/mylist-list.component';
import { MylistFormComponent } from './mylists/mylist-form/mylist-form.component';

const routes: Routes = [
    {
        path: 'mylists',
        component:MylistListComponent
    },
    {
        path: 'l/add',
        component:MylistFormComponent
    },
    { 
        path: '**',
        redirectTo: 'mylists'
    }
];

@NgModule({
    imports:[
        RouterModule.forRoot(routes)
    ],
    exports:[
        RouterOutlet
    ]
})
export class AppRoutingModule { }