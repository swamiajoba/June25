import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NonSingletonCompComponent } from './non-singleton-comp.component';

describe('NonSingletonCompComponent', () => {
  let component: NonSingletonCompComponent;
  let fixture: ComponentFixture<NonSingletonCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NonSingletonCompComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NonSingletonCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
