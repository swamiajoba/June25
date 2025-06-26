import { Component } from '@angular/core';

@Component({
  selector: 'app-my-pipe-demo',
  templateUrl: './my-pipe-demo.component.html',
  styleUrls: ['./my-pipe-demo.component.css']
})
export class MyPipeDemoComponent {
  search = '';

  items = Array.from( { length: 1000 }, (_, i) => `Item ${i + 1}` );

  // For view refresh triggers
  forceChange = 0;

  triggerChange() {
    this.forceChange = Math.random();
  }
}
