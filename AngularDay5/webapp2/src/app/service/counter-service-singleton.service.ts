import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'  /// registeres the service to root component
})
export class CounterServiceSingletonService {
count = 0;
  increment() {
    this.count++;
  }
}
