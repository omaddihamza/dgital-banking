import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Client } from '../model/Client';

@Injectable({
  providedIn: 'root'
})
export class ClientService {

  url = "http://localhost:8080/api/client";
  constructor(private http: HttpClient) { }

  listClinet(page:number, size:number):Observable<Client[]>{
    return this.http.get<Client[]>(this.url+"/list?page="+page+"&size="+size);
  }
}
