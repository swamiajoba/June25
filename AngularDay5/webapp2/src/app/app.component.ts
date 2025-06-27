import { Component } from '@angular/core';
import { CounterServiceSingletonService } from './service/counter-service-singleton.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp2';

  constructor(public counter: CounterServiceSingletonService) {}
  
    increase() {
      this.counter.increment();
    }
}
