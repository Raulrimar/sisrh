import { Component } from '@angular/core';
import { RouterLink, RouterModule, RouterOutlet } from '@angular/router';



@Component({
  selector: 'app-servidor',
  standalone: true,
  imports: [RouterModule, RouterLink, RouterOutlet],
  templateUrl: './servidor.component.html',
  styleUrl: './servidor.component.css'
})
export class ServidorComponent {

}
