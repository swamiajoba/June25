import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, throwError } from 'rxjs';
import { Account } from '../model/account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {

  private baseUrl = 'http://localhost:8082/';  
  
  constructor(private http:HttpClient) { }  
  
  getAccountsList(): Observable<Account[]> {  
    return this.http.get<Account[]>(`${this.baseUrl}`+'accounts')
          .pipe(catchError(this.handleError));  
  }  
  
  createAccount(account: Account): Observable<Account> {  
    return this.http.post<Account>(`${this.baseUrl}`+'accounts', account)
          .pipe(catchError(this.handleError));
  }  
  
  deleteAccount(id: number): Observable<any> {  
    return this.http.delete(`${this.baseUrl}accounts/${id}`, { responseType: 'text' })
          .pipe(catchError(this.handleError));
  }  
  
  getAccount(id: number): Observable<Account> {  
    return this.http.get<Account>(`${this.baseUrl}accounts/${id}`)
          .pipe(catchError(this.handleError)); 
  }  
  
  updateAccount(id: number, value: Account): Observable<Account> {  
    return this.http.put<Account>(`${this.baseUrl}accounts/${id}`, value)
          .pipe(catchError(this.handleError)); 
  }

  private handleError(error: HttpErrorResponse){
    let errorMsg:string='';
    if(error.error instanceof ErrorEvent){
        console.error('Client Side Error: ' , error.error.message);
        errorMsg=error.error.message;
     }else{
      console.error('Server Side Error: ', error);
      errorMsg=error.error;
     }
    return throwError(errorMsg);
  }


}
