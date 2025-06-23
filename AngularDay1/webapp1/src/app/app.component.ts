import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp1';
  aid:number=100;
  customer:string="Ram Verma";
  balance:number=50000.00;
}
