import { Component } from '@angular/core';
import { CounterServiceNonSingletonService } from '../service/counter-service-non-singleton.service';

@Component({
  selector: 'app-another-non-singleton-comp',
  templateUrl: './another-non-singleton-comp.component.html',
  styleUrls: ['./another-non-singleton-comp.component.css'],
  providers:[CounterServiceNonSingletonService]  // non singleton ie generates separate object and register
})
export class AnotherNonSingletonCompComponent {
constructor(public counter: CounterServiceNonSingletonService) {}
  increase() {
    this.counter.increment();
  }
}
