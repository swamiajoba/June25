import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input() message:string='';  // parent message is accepted here

  @Output() newItemEvent = new EventEmitter<string>();  // used to sent a string data to parent

  addNewItem(value:string){
    this.newItemEvent.emit(value);
  }

}
