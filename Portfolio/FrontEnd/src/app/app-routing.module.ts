import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditEducationComponent } from './components/education/edit-education.component';
import { NewEducationComponent } from './components/education/new-education.component';
import { EditExperienciaComponent } from './components/experencie/edit-experiencia.component';
import { NewExperienciaComponent } from './components/experencie/new-experiencia.component';
import { EditHardSoftSkillsComponent } from './components/hard-and-soft-skills/edit-hard-soft-skills.component';
import { NewHardSoftSkillsComponent } from './components/hard-and-soft-skills/new-hard-soft-skills.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { EditProyectoComponent } from './components/project/edit-proyecto.component';
import { NewProyectoComponent } from './components/project/new-proyecto.component';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'login', component: LoginComponent },
  { path: 'nuevaexp', component: NewExperienciaComponent },
  { path: 'editexp/:id', component: EditExperienciaComponent },
  { path: 'nuevaedu', component: NewEducationComponent },
  { path: 'editedu/:id', component: EditEducationComponent },
  { path: 'nuevoproyecto', component: NewProyectoComponent },
  { path: 'editproyecto/:id', component: EditProyectoComponent },
  { path: 'nuevohardsoftskills', component: NewHardSoftSkillsComponent },
  { path: 'edithardsoftskills/:id', component: EditHardSoftSkillsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
