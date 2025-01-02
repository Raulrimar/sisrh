import { Component } from '@angular/core';
import { CargoComponent } from "../cargo/cargo.component";

@Component({
  selector: 'app-formacao',
  standalone: true,
  imports: [CargoComponent],
  templateUrl: './formacao.component.html',
  styleUrl: './formacao.component.css'
})
export class FormacaoComponent {

}
