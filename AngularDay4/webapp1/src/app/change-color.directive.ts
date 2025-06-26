import { Directive, ElementRef, HostBinding, HostListener, Renderer2 } from '@angular/core';

@Directive({
  selector: '[appChangeColor]'
})
export class ChangeColorDirective {

  @HostBinding('style.color') color:string='';
   // ElementRef -- > referes to element object wherse this directive 
  //  is applied
  // Renderer2  -- > displayes element on the browser

  constructor(private el: ElementRef, private renderer: Renderer2) {
   renderer.setStyle(el.nativeElement,'backgroundColor','cyan');
    this.color='green';
   }

     @HostListener('mouseover') 
     onMouseOver() {
    this.renderer.setStyle(this.el.nativeElement,'backgroundColor', 'orange');
    this.color='red';
   }

   @HostListener('mouseout') 
   onMouseOut() {
    this.renderer.setStyle(this.el.nativeElement,'backgroundColor', 'yellow');
    this.color='blue';
  }


}


