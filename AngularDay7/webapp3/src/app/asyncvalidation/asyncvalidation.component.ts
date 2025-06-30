import { Component, OnInit } from '@angular/core';
import { AbstractControl, AsyncValidatorFn, FormControl, FormGroup, ValidationErrors, Validators } from '@angular/forms';
import { fetchEmails } from '../utils/fetchEmails';
import { map } from 'rxjs';

@Component({
  selector: 'app-asyncvalidation',
  templateUrl: './asyncvalidation.component.html',
  styleUrls: ['./asyncvalidation.component.css']
})
export class AsyncvalidationComponent implements OnInit {
 form!:FormGroup;

    ngOnInit(): void {
      this.form = new FormGroup({
        email: new FormControl('', {
          validators: [Validators.required, Validators.email],
          asyncValidators: [this.emailValidator()],
          updateOn: 'submit' // 'blur' | 'change'
        })
      });
      
    }

    get email(){
      return this.form.get('email');
    }

    emailValidator(): AsyncValidatorFn {
      return (control: AbstractControl) => {
        return fetchEmails()
          .pipe(
            map(x =>
              // actual validation logic here
              x.includes(control.value)
              ? { 'valueError': 'Email already exists' } as ValidationErrors
              : null)
          )
      }
    }
    
    onSubmit(ev: Event) {
      ev.preventDefault();
      // handle submit...
    }

}
