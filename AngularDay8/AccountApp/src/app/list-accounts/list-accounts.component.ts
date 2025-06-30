import { Component, OnInit } from '@angular/core';
import { AccountService } from '../service/account.service';
import { Router } from '@angular/router';
import { Account } from '../model/account';

@Component({
  selector: 'app-list-accounts',
  templateUrl: './list-accounts.component.html',
  styleUrls: ['./list-accounts.component.css']

})
export class ListAccountsComponent implements OnInit{

  accounts: Account[]=[];

  constructor(private accountservice:AccountService,private router:Router ) { 
  }
   
  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.accountservice.getAccountsList().subscribe(
      data=>{
        this.accounts=data;
      },
      error=>console.log(error)
    );
  }

  deleteAccount(id: number) {
    this.accountservice.deleteAccount(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
    }

    accountDetails(id:number):void{
          this.router.navigate(['account-details', id]);
    
    }

    goForUpdate(id: number):void{
      this.router.navigate(['update-account', id]);
    }

}
