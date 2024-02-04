import { Component, OnInit, ViewChild } from '@angular/core';
import { NgForm } from '@angular/forms';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { Client } from '../../model/Client';
import { ClientService } from '../../Services/client.service';

@Component({
  selector: 'app-client',
  templateUrl: './client.component.html',
  styleUrls: ['./client.component.scss'],
})
export class ClientComponent implements OnInit {

  displayedColumns: string[] = ['Id', 'Nom et Prénom', 'Telephone'];
  clientsData = new MatTableDataSource<Client>();
  page:number=0;
  size:number=6;
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private serviceClient:ClientService){}

  ngOnInit(): void {
    this.clientsData.paginator = this.paginator;
    this.loadData();
  }

  loadData() {
    this.serviceClient.listClinet(this.page,this.size).subscribe((response:any)=>{
      this.clientsData.data=response.content;
      console.log(this.clientsData.data)
    })
  }

  OnClick(f:NgForm){
     console.log(f.value)
  }

  onPageChange(event:any){
    const page = event.pageIndex;
    const size = event.pageSize;
    this.serviceClient.listClinet(page,size).subscribe((response:any)=>{
      this.clientsData.data=response.content;
      console.log(this.clientsData.data)
    })
  }



}
