import { Component } from '@angular/core';
import { interval, map, Observable } from 'rxjs';

@Component({
  selector: 'app-pipedemo',
  templateUrl: './pipedemo.component.html',
  styleUrls: ['./pipedemo.component.css']
})
export class PipedemoComponent {
 eid:number=100;
  ename:string="Ram Verma";
  salary:number=25000.50;

  months:string[] = ["January" ,"February","March","April","May","June","July","August"];

  doj:Date=new Date();
  boj:Date=new Date(1988,9,5);

  addressjson = {
                  area:'EON',
                  city:'Pune',
                  pincode:400055
               };

    
    time$: Observable<string>;
    constructor() {
    // Emits the current time every second
    this.time$ = interval(1000)
                .pipe(
                    map(
                      () => new Date().toLocaleTimeString()
                    )
                );
   }

}
