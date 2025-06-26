import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MyPipeDemoComponent } from './my-pipe-demo.component';

describe('MyPipeDemoComponent', () => {
  let component: MyPipeDemoComponent;
  let fixture: ComponentFixture<MyPipeDemoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MyPipeDemoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MyPipeDemoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
