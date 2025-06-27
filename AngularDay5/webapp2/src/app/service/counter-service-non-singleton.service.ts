import { Injectable } from '@angular/core';

@Injectable()
export class CounterServiceNonSingletonService {
count = 0;
  increment() {
    this.count+=2;
  }
}
