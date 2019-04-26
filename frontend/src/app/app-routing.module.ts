import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {WelcomePageComponent} from "./modules/welcome-page/welcome-page.component";
import {LoginPageComponent} from "./modules/login-page/login-page.component";
import {EdProjectPageComponent} from "./modules/ed_project-page/ed-project-page.component";


const routes: Routes = [
  {path: 'welcome-page', component: WelcomePageComponent},
  {path:'', component:LoginPageComponent},
  {path:'edit-project-page/', component:EdProjectPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
