import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TemplateDrivenComponent } from './template-driven/template-driven.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MatchPasswordDirective } from './directive/match-password.directive';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { AsyncvalidationComponent } from './asyncvalidation/asyncvalidation.component';
import { PromiseCompComponent } from './promise-comp/promise-comp.component';
import { ObservableCompComponent } from './observable-comp/observable-comp.component';

@NgModule({
  declarations: [
    AppComponent,
    TemplateDrivenComponent,
    MatchPasswordDirective,
    ReactiveFormComponent,
    AsyncvalidationComponent,
    PromiseCompComponent,
    ObservableCompComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
