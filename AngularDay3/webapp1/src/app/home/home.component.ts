import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  aid:number=100;
  customer:string="Ram Verma";
  balance:number=50000.00;

  show() {
    alert("Account is Number = "+this.aid 
                +" ,Customer = "+this.customer 
              + " , Balance = "+this.balance);
  }
}
