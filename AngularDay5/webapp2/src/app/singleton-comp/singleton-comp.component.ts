import { Component } from '@angular/core';
import { CounterServiceSingletonService } from '../service/counter-service-singleton.service';

@Component({
  selector: 'app-singleton-comp',
  templateUrl: './singleton-comp.component.html',
  styleUrls: ['./singleton-comp.component.css']
})
export class SingletonCompComponent {
 constructor(public counter: CounterServiceSingletonService) {}
  increase() {
    this.counter.increment();
  }
}
