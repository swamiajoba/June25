import { Component, OnInit } from '@angular/core';
import { Account } from '../model/account';
import { ActivatedRoute, Router } from '@angular/router';
import { AccountService } from '../service/account.service';

@Component({
  selector: 'app-account-details',
  templateUrl: './account-details.component.html',
  styleUrls: ['./account-details.component.css']
})
export class AccountDetailsComponent implements OnInit {
  id!: number;
  account!:Account;

  constructor(private route:ActivatedRoute,private router:Router,
    private accountservice:AccountService) { }

  ngOnInit(): void {
    this.account = new Account();

    this.id = this.route.snapshot.params['id'];
    
    this.accountservice.getAccount(this.id)
      .subscribe(data => {
        console.log(data)
        this.account = data;
      }, error => console.log(error));
  }
  
  list(){
    this.router.navigate(['view-accounts']);
  }

}
