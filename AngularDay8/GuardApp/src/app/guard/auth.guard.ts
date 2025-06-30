import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from '../service/auth.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  constructor(private router: Router, private authService: AuthService) {
  }

  canActivate(): boolean {
    if (!this.authService.isUserLoggedIn()) {
      alert('You are not allowed to view this page. You are redirected to login Page');
      this.router.navigate(["login"]);
      return false;
    }
    return true;
  }
  
}
