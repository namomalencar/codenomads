import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MylistFormComponent } from './mylist-form.component';

describe('MylistFormComponent', () => {
  let component: MylistFormComponent;
  let fixture: ComponentFixture<MylistFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MylistFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MylistFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
