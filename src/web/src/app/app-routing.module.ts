import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CompteCourantComponent } from './comptes/compte-courant/compte-courant.component';
import { CompteEpargneComponent } from './comptes/compte-epargne/compte-epargne.component';
import { ClientComponent } from './clients/client/client.component';

const routes: Routes = [
  {path:'client', component:ClientComponent},
  {path:'compte-courant', component:CompteCourantComponent},
  {path:'compte-epargne', component:CompteEpargneComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
