import { Injectable } from '@angular/core';
import { of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

    private isloggedIn: boolean;
    private userName!: string;

    constructor() {
        this.isloggedIn = false;
    }

    login(username: string, password: string) {
        console.log("username "+username +" , password "+password);
        //Assuming users are provided the correct credentials.
        //In real app you will query the database to verify.
        if (username==='Admin' && password==='Admin') {
            this.isloggedIn = true;
            this.userName = username;
          } 
            return of(this.isloggedIn);
        
    }

    isUserLoggedIn(): boolean {
        return this.isloggedIn;
    }

    logoutUser(): void {
        this.isloggedIn = false;
    }
  }
