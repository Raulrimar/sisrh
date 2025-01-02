import { Component } from '@angular/core';
import { RouterLink, RouterModule } from '@angular/router';
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-cargo',
  standalone: true,
  imports: [RouterModule, RouterLink, RouterOutlet],
  templateUrl: './cargo.component.html',
  styleUrl: './cargo.component.css'
})
export class CargoComponent {

}
