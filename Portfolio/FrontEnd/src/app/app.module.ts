import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { AboutComponent } from './components/about/about.component';
import { BannerComponent } from './components/banner/banner.component';
import { ExperencieComponent } from './components/experencie/experencie.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HardAndSoftSkillsComponent } from './components/hard-and-soft-skills/hard-and-soft-skills.component';
import { ProjectComponent } from './components/project/project.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { interceptorProvider } from './service/interceptor-service';
import { NewExperienciaComponent } from './components/experencie/new-experiencia.component';
import { EditExperienciaComponent } from './components/experencie/edit-experiencia.component';
import { NewProyectoComponent } from './components/project/new-proyecto.component';
import { EditProyectoComponent } from './components/project/edit-proyecto.component';
import { EditHardSoftSkillsComponent } from './components/hard-and-soft-skills/edit-hard-soft-skills.component';
import { NewHardSoftSkillsComponent } from './components/hard-and-soft-skills/new-hard-soft-skills.component';
import { EducationComponent } from './components/education/education.component';
import { EditEducationComponent } from './components/education/edit-education.component';
import { NewEducationComponent } from './components/education/new-education.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    AboutComponent,
    BannerComponent,
    ExperencieComponent,
    HardAndSoftSkillsComponent,
    ProjectComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    EducationComponent,
    EditEducationComponent,
    NewEducationComponent,
    NewExperienciaComponent,
    EditExperienciaComponent,
    NewProyectoComponent,
    EditProyectoComponent,
    EditHardSoftSkillsComponent,
    NewHardSoftSkillsComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserModule,
    FormsModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,

  ],
  providers: [
    interceptorProvider
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
