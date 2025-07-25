import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Account } from '../model/account';
@Injectable({
  providedIn: 'root'
})
export class AccountService {
   private baseUrl = 'http://localhost:8082/';  
  
  constructor(private http:HttpClient) { }  
  
  getAccountsList(): Observable<Account[]> {  
    return this.http.get<Account[]>(`${this.baseUrl}`+'accounts');  
  }  

}
