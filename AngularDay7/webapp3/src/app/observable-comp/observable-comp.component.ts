import { Component } from '@angular/core';
import { filter, map, Observable, of, Subject } from 'rxjs';


function sequenceSubscriber(observer:any) {  
  // synchronously deliver 1, 2, and 3, then complete 
  observer.next(1);  
  observer.next(2);  
  observer.next(3);  
  
  observer.complete();   
  // unsubscribe function doesn't need to do anything in this  
  // because values are delivered synchronously  
  return {unsubscribe() {}};

}




@Component({
  selector: 'app-observable-comp',
  templateUrl: './observable-comp.component.html',
  styleUrls: ['./observable-comp.component.css']
})
export class ObservableCompComponent {

  myObsData:Observable<string[]>=of(["Ram","Sham" , "Krishna","Ganesh"]);




   myobservable():void{
     // Create a new Observable that will deliver the above sequence
    const sequence = new Observable(sequenceSubscriber);

     // execute the Observable and print the result of each notification
    sequence.subscribe({ 
     next(num) { 
      console.log("emiting "+num); 
    },  
     error(error){
      console.log("error is "+error)
    },
    complete() { 
      console.log('Finished sequence'); 
    }
  }); 
    // Logs:// 1// 2// 3// Finished sequence 
  }


   myobservable1():void{
    // generate obsevable object and emits values mention in of function
    const obs1= of("manjiri","kavita","manasi");  
    obs1.subscribe(
      (  data:string )=>console.log("emiting => "+data)  // calling next method
    );
  }

   mymapfun():void {
    const nums = of(1, 2, 3,4,5,6);

   const processedobservable =nums.pipe(
      map((val: number) => { 
        console.log("processing value "+val); return val * val; 
      }),
      filter( x=>{
         console.log("filtering = > "+x); return x>4; 
        } )
      );

    processedobservable.subscribe(
        data=>console.log("next"+data),
        err=>console.log("error"+err),
        ()=>console.log("subscription is completed")
        );
  
    }

 subjectfun():void{
      const subject = new Subject<number>();
      
      subject.subscribe({
      next: (v) => console.log(`observerA: ${v}`)
      });
    
      subject.subscribe({
        next: (v) => console.log(`observerB: ${v}`)
      });
    
      subject.next(1);  // subject is emmiting 1
      subject.next(2);  // subject is emmiting 2
    
      }




}
