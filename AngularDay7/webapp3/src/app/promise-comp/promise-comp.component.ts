import { Component } from '@angular/core';

@Component({
  selector: 'app-promise-comp',
  templateUrl: './promise-comp.component.html',
  styleUrls: ['./promise-comp.component.css']
})
export class PromiseCompComponent {
   balance:any='';
    msg:string='';

     validateData(){
      return new Promise<string>((resolve , reject)=>{
        if(isNaN(this.balance)){
          reject("It is not a number");   // emits error
        }
        else {
          resolve("Balance  is "+this.balance);  // emits single value
        }
      });
    }

    fun1() {
      this.validateData().then(  // will access emitted data
        (result)=>{
          this.msg=result;
        }
      ).catch(   // will access error
          (error)=>{
            this.msg=error;
          }
      );
    }

}
