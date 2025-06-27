import { Component, OnInit } from '@angular/core';
import { Account } from '../model/account';
import { AccountService } from '../service/account.service';

@Component({
  selector: 'app-list-accounts',
  templateUrl: './list-accounts.component.html',
  styleUrls: ['./list-accounts.component.css']
})
export class ListAccountsComponent implements OnInit{

  accountsList!:Account[];

  constructor(private accountService:AccountService) {   }

  ngOnInit(): void {
    this.accountService.getAccountsList().subscribe(
      (data:any)=>{
        this.accountsList=data;
      },
      (error:any)=>{
        console.log(error);
      }
    );
  }
}
