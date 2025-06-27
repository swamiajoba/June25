import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SingletonCompComponent } from './singleton-comp/singleton-comp.component';
import { NonSingletonCompComponent } from './non-singleton-comp/non-singleton-comp.component';
import { TokenCompComponent } from './token-comp/token-comp.component';
import { API_URL } from './token/injection.token';
import { ManualinjectionComponent } from './manualinjection/manualinjection.component';
import { AnotherNonSingletonCompComponent } from './another-non-singleton-comp/another-non-singleton-comp.component';
import { ListAccountsComponent } from './list-accounts/list-accounts.component';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    SingletonCompComponent,
    NonSingletonCompComponent,
    TokenCompComponent,
    ManualinjectionComponent,
    AnotherNonSingletonCompComponent,
    ListAccountsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [
          { provide: API_URL, useValue: 'https://api.example.com' }    
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
