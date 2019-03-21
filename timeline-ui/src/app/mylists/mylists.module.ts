import { NgModule } from '@angular/core';
import { MylistComponent } from './mylist/mylist.component';
import { MylistFormComponent } from './mylist-form/mylist-form.component';
import { MylistListComponent } from './mylist-list/mylist-list.component';
@NgModule({
    declarations: [MylistComponent, MylistFormComponent, MylistListComponent],
    exports: [MylistComponent, MylistFormComponent, MylistListComponent]
})
export class MylistsModule{

}