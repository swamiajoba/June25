import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SingletonCompComponent } from './singleton-comp.component';

describe('SingletonCompComponent', () => {
  let component: SingletonCompComponent;
  let fixture: ComponentFixture<SingletonCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SingletonCompComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SingletonCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
