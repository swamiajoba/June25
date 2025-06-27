import { Component, OnInit } from '@angular/core';
import { Contact } from '../model/contact';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-template-driven',
  templateUrl: './template-driven.component.html',
  styleUrls: ['./template-driven.component.css']
})
export class TemplateDrivenComponent implements OnInit{

  contact!:Contact;

  ngOnInit(): void {
    this.contact= {
          firstname:'',
          lastname:'',
          gender:'',
          isToc:false,
          email:'',
          password:'',
          confirmPassword:'',
          age:0
    }
  }

  onSubmit(contactForm:NgForm):void {
    alert(JSON.stringify (contactForm.value) );
    alert("Contact object "+JSON.stringify(this.contact));

  }


}
