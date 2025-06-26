import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgifExComponent } from './ngif-ex.component';

describe('NgifExComponent', () => {
  let component: NgifExComponent;
  let fixture: ComponentFixture<NgifExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgifExComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgifExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
