import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LiveScoreCompComponent } from './live-score-comp.component';

describe('LiveScoreCompComponent', () => {
  let component: LiveScoreCompComponent;
  let fixture: ComponentFixture<LiveScoreCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LiveScoreCompComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LiveScoreCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
