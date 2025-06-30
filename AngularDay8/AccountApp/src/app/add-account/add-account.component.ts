import { Component, OnInit } from '@angular/core';
import { AccountService } from '../service/account.service';
import { Account } from '../model/account';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-add-account',
  templateUrl: './add-account.component.html',
  styleUrls: ['./add-account.component.css']
})
export class AddAccountComponent implements OnInit{

  constructor(private accountservice : AccountService) { }

  account =new Account();
  submitted = false;  
  accountsaveform!:FormGroup
  
  ngOnInit() {  
    this.submitted=false;  
    this.accountsaveform=new FormGroup({
      aid:new FormControl('',[Validators.required , Validators.minLength(3) ])  ,
      customer:new FormControl('' , [Validators.required , Validators.minLength(3) ] ),  
      balance:new FormControl('',[Validators.required]),  
      email:new FormControl('',[Validators.required,Validators.email])  
    });  
  }  

  

 
  

  get Aid(){  
    return this.accountsaveform.get('aid');  
  }  
  
  get Customer(){  
    return this.accountsaveform.get('customer');  
  }  

  
  get Balance(){  
    return this.accountsaveform.get('balance');  
  }  
  
  get Email(){  
    return this.accountsaveform.get('email');  
  }  
  
  saveAccount(saveAccount:any){  
    this.account=new Account();   
    this.account.aid=this.Aid?.value;    
    this.account.customer=this.Customer?.value;  
    this.account.balance=this.Balance?.value;  
    this.account.email=this.Email?.value;  
    this.submitted = true;  
    this.save();  
  }  
  
    
  
  save() {  
    this.accountservice.createAccount(this.account)  
      .subscribe(
        data => console.log(data), 
      error => console.log(error)
    );  
    this.account = new Account();  
  }  
  addAccountForm(){  
    this.submitted=false;  
    this.accountsaveform.reset();  
  }  

}
