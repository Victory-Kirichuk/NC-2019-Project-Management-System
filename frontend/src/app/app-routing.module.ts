import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AdminPageComponent} from "./Components/admin-page/admin-page.component";
import {TestComponent} from "./Components/test-component/test.component";

const routes: Routes = [
  {path: 'admin-page', component: AdminPageComponent},
  {path: 'test', component: TestComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
