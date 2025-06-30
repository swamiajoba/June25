import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import Validation from '../utils/validation';
import { Contact } from '../model/contact';

@Component({
  selector: 'app-reactive-form',
  templateUrl: './reactive-form.component.html',
  styleUrls: ['./reactive-form.component.css']
})
export class ReactiveFormComponent implements OnInit{
  registerForm!: FormGroup;
  submitted = false;

  constructor(private formBuilder: FormBuilder) { // injecting FormBuilder object
   }


  ngOnInit(): void {
    this.registerForm=this.formBuilder.group({
      firstName: ['' , Validators.required],   /// object of FormControl
      lastName: ['' , Validators.required],
      email: ['' , [Validators.required, Validators.email]],
      password: ['' , [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', Validators.required],
      gender:['',Validators.required],
      age:[0,[Validators.required, Validators.min(18)]],
      isToc:[false,Validators.requiredTrue]
    },
    {
      validators: [Validation.match('password', 'confirmPassword')],
    }
  );

  }

  get firstName(){
    return this.registerForm.get('firstName');  /// return FormControl object inside registerForm
  }
  get lastName(){
    return this.registerForm.get('lastName');
  }

  get email(){
    return this.registerForm.get('email');
  }

  get password(){
    return this.registerForm.get('password');
  }

  get confirmPassword(){
    return this.registerForm.get('confirmPassword');
  }

  get gender(){
    return this.registerForm.get('gender');
  }

  get age(){
    return this.registerForm.get('age');
  }

  get isToc(){
    return this.registerForm.get('isToc');
  }


  onSubmit(){
    this.submitted = true;
    if(this.registerForm.invalid){
      this.submitted=false;
      return;
    }

    let contact:Contact =new Contact();
      contact.firstname = this.firstName?.value;
      contact.lastname = this.lastName?.value;
      contact.email= this.email?.value;
      contact.gender = this.gender?.value;
      contact.password =this.password?.value;
      contact.confirmPassword = this.confirmPassword?.value;
      contact.age= this.age?.value;
      contact.isToc= this.isToc?.value;

      alert ("Contact object "+JSON.stringify(contact));
  }


}
