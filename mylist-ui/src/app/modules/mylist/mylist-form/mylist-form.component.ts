import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { FormGroup, FormControl, Validators} from '@angular/forms';


@Component({
  selector: 'app-mylist-form',
  templateUrl: './mylist-form.component.html',
  styleUrls: ['./mylist-form.component.css']
})
export class MylistFormComponent implements OnInit {

  form: FormGroup;
  @Output() save = new EventEmitter<any>();
  msgSuccess: boolean = false;
  msgError: boolean = false;

  constructor() { }

  ngOnInit() {
    this.form = new FormGroup({
      nameList: new FormControl(null, Validators.required)
    });
  }

  onSubmit() {
    if(this.form.valid) {
      this.save.emit(this.form.value);
      this.form.reset();
      this.showMessage('success');
    } else {
      this.showMessage('error');
    }
  }

  showMessage(statusMsg: string) {
    if(statusMsg == 'success') this.msgSuccess = true;
    if(statusMsg == 'error') this.msgError = true;
    setTimeout(time => {
      this.msgSuccess = false;
      this.msgError = false;
    }, 2000)
  }


}
