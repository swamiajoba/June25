import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AsyncvalidationComponent } from './asyncvalidation.component';

describe('AsyncvalidationComponent', () => {
  let component: AsyncvalidationComponent;
  let fixture: ComponentFixture<AsyncvalidationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AsyncvalidationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AsyncvalidationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
