import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnotherNonSingletonCompComponent } from './another-non-singleton-comp.component';

describe('AnotherNonSingletonCompComponent', () => {
  let component: AnotherNonSingletonCompComponent;
  let fixture: ComponentFixture<AnotherNonSingletonCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AnotherNonSingletonCompComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AnotherNonSingletonCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
