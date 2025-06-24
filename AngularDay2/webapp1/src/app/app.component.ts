import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp1';

  parentmessage:string="Message from parent AppComponent";

  newItem:string='';  // accepts data coming from child

  assignData(data:string){
    this.newItem=data;
  }

}
