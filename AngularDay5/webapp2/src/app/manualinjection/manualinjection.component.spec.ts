import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManualinjectionComponent } from './manualinjection.component';

describe('ManualinjectionComponent', () => {
  let component: ManualinjectionComponent;
  let fixture: ComponentFixture<ManualinjectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManualinjectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ManualinjectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
