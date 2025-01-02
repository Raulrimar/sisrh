import { Component } from '@angular/core';
import { FormacaoComponent } from "../formacao/formacao.component";

@Component({
  selector: 'app-inicio',
  standalone: true,
  imports: [FormacaoComponent],
  templateUrl: './inicio.component.html',
  styleUrl: './inicio.component.css'
})
export class InicioComponent {

}
