import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddAccountComponent } from './add-account/add-account.component';
import { AccountDetailsComponent } from './account-details/account-details.component';
import { UpdateAccountComponent } from './update-account/update-account.component';
import { ListAccountsComponent } from './list-accounts/list-accounts.component';

const routes: Routes = [
  { path: '', redirectTo: 'view-accounts', pathMatch: 'full' },  
  { path: 'add-account', component: AddAccountComponent },  
  { path: 'view-accounts', component: ListAccountsComponent  }, 
  { path: 'account-details/:id',component:AccountDetailsComponent} ,
  { path: 'update-account/:id',component:UpdateAccountComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
