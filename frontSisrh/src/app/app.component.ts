import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ServidorComponent } from "./components/servidor/servidor.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ServidorComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'frontSisrh';
}
