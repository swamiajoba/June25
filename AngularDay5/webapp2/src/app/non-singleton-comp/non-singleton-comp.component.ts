import { Component } from '@angular/core';
import { CounterServiceNonSingletonService } from '../service/counter-service-non-singleton.service';

@Component({
  selector: 'app-non-singleton-comp',
  templateUrl: './non-singleton-comp.component.html',
  styleUrls: ['./non-singleton-comp.component.css'],
  providers:[CounterServiceNonSingletonService]  // registering service with component
})
export class NonSingletonCompComponent {
  constructor(public counter: CounterServiceNonSingletonService) {}
  increase() {
    this.counter.increment();
  }
}
