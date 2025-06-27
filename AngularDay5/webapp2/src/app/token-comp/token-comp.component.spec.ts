import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TokenCompComponent } from './token-comp.component';

describe('TokenCompComponent', () => {
  let component: TokenCompComponent;
  let fixture: ComponentFixture<TokenCompComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TokenCompComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TokenCompComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
