import { Component, Injector, OnInit } from '@angular/core';
import { CounterServiceSingletonService } from '../service/counter-service-singleton.service';

@Component({
  selector: 'app-manualinjection',
  templateUrl: './manualinjection.component.html',
  styleUrls: ['./manualinjection.component.css']
})
export class ManualinjectionComponent implements OnInit{
  counter:any;
  constructor(private injector: Injector) {}

ngOnInit() {
   this.counter = this.injector.get(CounterServiceSingletonService);

}
  increase() {
    this.counter.increment();
  }

}
