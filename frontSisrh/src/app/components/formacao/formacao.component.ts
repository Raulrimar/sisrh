import { Component } from '@angular/core';
import { CargoComponent } from "../cargo/cargo.component";
import { RouterLink, RouterModule, RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-formacao',
  standalone: true,
  imports: [CargoComponent,RouterLink, RouterOutlet, RouterModule],
  templateUrl: './formacao.component.html',
  styleUrl: './formacao.component.css'
})
export class FormacaoComponent {

}
