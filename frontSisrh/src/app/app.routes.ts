import { Routes } from '@angular/router';
import { InicioComponent } from './components/inicio/inicio.component';
import { ServidorComponent } from './components/servidor/servidor.component';
import { FormacaoComponent } from './components/formacao/formacao.component';
import { CargoComponent } from './components/cargo/cargo.component';

export const routes: Routes = [
  {
    path: '',
    component: InicioComponent
  },
  {
    path: 'servidor',
    component: ServidorComponent
  },
  {
    path:'formacao',
    component: FormacaoComponent
  },
  {
    path:'cargo',
    component: CargoComponent
  }
];
