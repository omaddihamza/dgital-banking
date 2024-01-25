import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ClientComponent } from './client/client.component';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import {MatFormFieldModule} from '@angular/material/form-field';
import {FormsModule} from '@angular/forms';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';
import {MatDividerModule} from '@angular/material/divider';
import {MatSelectModule} from '@angular/material/select';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatNativeDateModule} from '@angular/material/core';
import {MatTableModule} from '@angular/material/table';
import { HttpClientModule } from '@angular/common/http';
import {MatPaginatorIntl, MatPaginatorModule} from '@angular/material/paginator';
import { CompteEpargneComponent } from './comptes/compte-epargne/compte-epargne.component';
import { CompteCourantComponent } from './comptes/compte-courant/compte-courant.component';




@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    ClientComponent,
    CompteEpargneComponent,
    CompteCourantComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    FormsModule, MatFormFieldModule, MatInputModule,
    MatButtonModule, MatIconModule, MatDividerModule,
    MatSelectModule, MatDatepickerModule, MatNativeDateModule,
    MatTableModule, HttpClientModule, MatPaginatorModule
  ],
  providers: [{provide: MatPaginatorIntl}],
  bootstrap: [AppComponent]
})
export class AppModule { }
