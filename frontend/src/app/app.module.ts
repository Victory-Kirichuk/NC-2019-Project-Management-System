import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from "@angular/common/http";
import {RouterModule} from "@angular/router";
import { LoginPageComponent } from './modules/login-page/login-page.component';
import { WelcomePageComponent } from './modules/welcome-page/welcome-page.component';

import {BsDropdownModule, ModalModule, TooltipModule} from "ngx-bootstrap";
import { NavComponent } from './modules/Layout/components/nav/nav.component';
import { EdProjectPageComponent } from './modules/ed_project-page/ed-project-page.component';
import {FormsModule} from "@angular/forms";
import { NewProjectComponent } from './modules/welcome-page/model/Adding New/new-project/new-project.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    WelcomePageComponent,
    NavComponent,
    EdProjectPageComponent,
    NewProjectComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ModalModule.forRoot(),
    TooltipModule.forRoot(),
    BsDropdownModule.forRoot(),
    RouterModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
