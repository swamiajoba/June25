import { TestBed } from '@angular/core/testing';

import { CounterServiceSingletonService } from './counter-service-singleton.service';

describe('CounterServiceSingletonService', () => {
  let service: CounterServiceSingletonService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CounterServiceSingletonService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
