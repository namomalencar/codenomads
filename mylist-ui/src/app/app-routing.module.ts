import { NgModule } from '@angular/core';
import { Routes, RouterModule, RouterOutlet } from '@angular/router';

const routes: Routes = [
    {
        path: 'mylists', 
        loadChildren: './modules/mylist/mylist.module#MylistModule'
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