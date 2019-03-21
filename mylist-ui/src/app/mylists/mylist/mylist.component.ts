import { Component, Input } from '@angular/core';

@Component({
    selector: 'ap-mylist',
    templateUrl: 'mylist.component.html'

})
export class MylistComponent {
    @Input() mylist: any;
}
