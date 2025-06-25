import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgstyleExComponent } from './ngstyle-ex.component';

describe('NgstyleExComponent', () => {
  let component: NgstyleExComponent;
  let fixture: ComponentFixture<NgstyleExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgstyleExComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgstyleExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
