import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AdminPageComponent} from "./modules/admin-page/admin-page.component";
import {LoginPageComponent} from "./modules/login-page/login-page.component";


const routes: Routes = [
  {path: 'admin-page', component: AdminPageComponent},
  {path:'login-page', component:LoginPageComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
