import { Component } from '@angular/core';

@Component({
  selector: 'app-ngswitch-ex',
  templateUrl: './ngswitch-ex.component.html',
  styleUrls: ['./ngswitch-ex.component.css']
})
export class NgswitchExComponent {
  public dropDownValue = '';

  setDropDownValue(dropvalue : any){
    this.dropDownValue = dropvalue.target.value;      
}

}
