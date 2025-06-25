import { Component } from '@angular/core';

@Component({
  selector: 'app-ngif-ex',
  templateUrl: './ngif-ex.component.html',
  styleUrls: ['./ngif-ex.component.css']
})
export class NgifExComponent {
  show:boolean = true;

  toggle(){
    this.show = !this.show;
    return this.show;
  }

}
