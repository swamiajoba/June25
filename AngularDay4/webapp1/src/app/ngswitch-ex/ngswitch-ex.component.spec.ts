import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgswitchExComponent } from './ngswitch-ex.component';

describe('NgswitchExComponent', () => {
  let component: NgswitchExComponent;
  let fixture: ComponentFixture<NgswitchExComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgswitchExComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NgswitchExComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
