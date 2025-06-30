import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { MydataComponent } from './mydata/mydata.component';
import { ErrorComponent } from './error/error.component';
import { AuthGuard } from './guard/auth.guard';

const routes: Routes = [
  { path: '', redirectTo: 'login', pathMatch: 'full' },  
  { path: 'login', component: LoginComponent },  
  { path: 'mydata', component: MydataComponent, canActivate : [AuthGuard]   }, 
  { path: 'error', component: ErrorComponent  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
