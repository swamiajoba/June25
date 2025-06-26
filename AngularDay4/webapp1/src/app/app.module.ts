import { ErrorHandler, NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FormsModule } from '@angular/forms';
import { ChildComponent } from './child/child.component';
import { CustomcardComponent } from './customcard/customcard.component';
import { NgifExComponent } from './ngif-ex/ngif-ex.component';
import { NgforExComponent } from './ngfor-ex/ngfor-ex.component';
import { NgswitchExComponent } from './ngswitch-ex/ngswitch-ex.component';
import { NgstyleExComponent } from './ngstyle-ex/ngstyle-ex.component';
import { NgclassExComponent } from './ngclass-ex/ngclass-ex.component';
import { MydirectiveComponent } from './mydirective/mydirective.component';
import { ChangeColorDirective } from './change-color.directive';
import { GlobalErrorHandler } from './global/global-error-handler';
import { LifecycleDemoComponent } from './lifecycle-demo/lifecycle-demo.component';
import { PureFilterPipe } from './pure-filter.pipe';
import { ImpureFilterPipe } from './impure-filter.pipe';
import { MyPipeDemoComponent } from './my-pipe-demo/my-pipe-demo.component';
import { LiveScorePipe } from './live-score.pipe';
import { LiveScoreCompComponent } from './live-score-comp/live-score-comp.component';
import { PipedemoComponent } from './pipedemo/pipedemo.component';
import { ExponentialStrengthPipe } from './exponential-strength.pipe';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ChildComponent,
    CustomcardComponent,
    NgifExComponent,
    NgforExComponent,
    NgswitchExComponent,
    NgstyleExComponent,
    NgclassExComponent,
    MydirectiveComponent,
    ChangeColorDirective,
    LifecycleDemoComponent,
    PureFilterPipe,
    ImpureFilterPipe,
    MyPipeDemoComponent,
    LiveScorePipe,
    LiveScoreCompComponent,
    PipedemoComponent,
    ExponentialStrengthPipe

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [{provide:ErrorHandler , useClass:GlobalErrorHandler}],
  bootstrap: [AppComponent]
})
export class AppModule { }
