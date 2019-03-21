import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MylistListComponent } from './mylist-list.component';

describe('MyListListComponent', () => {
  let component: MylistListComponent;
  let fixture: ComponentFixture<MylistListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MylistListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MylistListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
