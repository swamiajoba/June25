import { AfterContentChecked, AfterContentInit, AfterViewChecked, AfterViewInit, Component, ContentChild, DoCheck, ElementRef, Input, OnChanges, OnDestroy, OnInit, SimpleChanges, ViewChild } from '@angular/core';

@Component({
  selector: 'app-lifecycle-demo',
  templateUrl: './lifecycle-demo.component.html',
  styleUrls: ['./lifecycle-demo.component.css']
})
export class LifecycleDemoComponent implements
  OnChanges, OnInit, DoCheck,
  AfterContentInit, AfterContentChecked,
  AfterViewInit, AfterViewChecked,
  OnDestroy {

   @Input() name: string = '';   // name will be accepted from parent

  constructor(){
    console.log("Constuctor ");
  }

   ngOnChanges(changes: SimpleChanges): void {
    console.log("ngOnChanges ", changes);
  }

   ngDoCheck(): void {
   console.log("ngDoCheck");
  }
  ngOnInit(): void {
   console.log("ngOnInit");
  }
 
  ngOnDestroy(): void {
    console.log("ngOnDestroy ");
  }
  ngAfterViewChecked(): void {
   console.log("ngAfterViewChecked");
    console.log('Template Text:', this.para.nativeElement.textContent);
  }

   @ViewChild('templateElement') para!: ElementRef;  // refears templateElement paragraph tag object

  ngAfterViewInit(): void {
    console.log("ngAfterViewInit");
     console.log('Template Text:', this.para.nativeElement.textContent);
  }

  ngAfterContentChecked(): void {
    console.log("ngAfterContentChecked");
  }

   @ContentChild('innerText') inner!: ElementRef;

  ngAfterContentInit(): void {
    console.log("ngAfterContentInit");
    console.log('ContentChild Text:', this.inner.nativeElement.textContent);

  }
 

}
