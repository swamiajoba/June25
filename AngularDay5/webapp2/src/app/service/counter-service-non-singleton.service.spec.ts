import { TestBed } from '@angular/core/testing';

import { CounterServiceNonSingletonService } from './counter-service-non-singleton.service';

describe('CounterServiceNonSingletonService', () => {
  let service: CounterServiceNonSingletonService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CounterServiceNonSingletonService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
