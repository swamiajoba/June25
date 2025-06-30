import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PromiseCompComponent } from './promise-comp.component';

describe('PromiseCompComponent', () => {
  let component: PromiseCompComponent;
  let fixture: ComponentFixture<PromiseCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PromiseCompComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PromiseCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
