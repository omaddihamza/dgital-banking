import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-client-details',
  templateUrl: './client-details.component.html',
  styleUrls: ['./client-details.component.scss']
})
export class ClientDetailsComponent implements OnInit {

constructor(private router:Router){

} 

ngOnInit(): void {

}

chooseCompteEpargne() {
  this.router.navigateByUrl('compte-epargne');
  console.log("compte-epargne")
}
chooseCompteCourant() {
  this.router.navigateByUrl('compte-courant');
   console.log("compte-courant")
}


}
