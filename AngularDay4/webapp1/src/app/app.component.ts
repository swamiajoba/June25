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

  // for errors
   method1() {
      throw new Error("Error thrown from AppComponent");
    }

    causeUndefinedPropertyError() {
     const user: any = null;
      // Simulate error: Cannot read property 'name' of null
      console.log('User Name:', user.name); 
    }

   causeHttpError() {
    // Simulate service call failure (without HttpClient for simplicity)
    Promise.reject(new Error('500 Internal Server Error'))
      .catch(err => {
        // Let Angular catch it as an uncaught Promise rejection
        throw err;
      });
    }


      // for lifecyle
   showChild = true;
  name = 'Angular';

  toggleChild() {
    this.showChild = !this.showChild;
  }

  changeName() {
    this.name = 'Angular ' + Math.floor(Math.random() * 100);
  }


}
