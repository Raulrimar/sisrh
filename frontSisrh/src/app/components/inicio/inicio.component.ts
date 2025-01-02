import { Component } from '@angular/core';
import { FormacaoComponent } from "../formacao/formacao.component";
import { ServidorComponent } from '../servidor/servidor.component';
import {RouterLink, RouterModule} from '@angular/router';
import { CargoComponent } from '../cargo/cargo.component';



@Component({
  selector: 'app-inicio',
  standalone: true,
  imports: [FormacaoComponent, ServidorComponent, CargoComponent, RouterModule, RouterLink],
  templateUrl: './inicio.component.html',
  styleUrl: './inicio.component.css'
})
export class InicioComponent {

}
