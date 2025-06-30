import { Component } from '@angular/core';
import { AuthService } from '../service/auth.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  invalidCredentialMsg!: boolean;
  username!: string;
  password!: string;
  // retUrl:string="login";

  constructor(private authService: AuthService, private router: Router) {
  }

  ngOnInit() {

  }

  onFormSubmit(loginForm:NgForm) {
      this.authService.login(loginForm.value.username, loginForm.value.password).subscribe(data => {
          this.invalidCredentialMsg = data;
          if (this.invalidCredentialMsg === true) {
              console.log(this.invalidCredentialMsg);
              this.router.navigate(['mydata']);
          } else {
              this.router.navigate(['error']);
          }
      });
  }
}
