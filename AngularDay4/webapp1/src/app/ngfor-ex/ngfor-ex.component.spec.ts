import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgforExComponent } from './ngfor-ex.component';

describe('NgforExComponent', () => {
  let component: NgforExComponent;
  let fixture: ComponentFixture<NgforExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgforExComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgforExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
