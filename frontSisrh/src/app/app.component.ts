import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ServidorComponent } from "./components/servidor/servidor.component";
import { FormacaoComponent } from './components/formacao/formacao.component';
import { CargoComponent } from './components/cargo/cargo.component';
import {RouterLink, RouterModule} from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ServidorComponent, FormacaoComponent, CargoComponent, RouterLink, RouterModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontSisrh';
}
