import { Component } from '@angular/core';
import { CargoComponent } from "../cargo/cargo.component";
import { FormacaoComponent } from "../formacao/formacao.component";

@Component({
  selector: 'app-servidor',
  standalone: true,
  imports: [CargoComponent, FormacaoComponent],
  templateUrl: './servidor.component.html',
  styleUrl: './servidor.component.css'
})
export class ServidorComponent {

}
