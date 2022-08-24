import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion';
import { EducacionService } from 'src/app/service/educacion.service';


@Component({
  selector: 'app-edit-eduction',
  templateUrl: './edit-education.component.html',
  styleUrls: ['./edit-education.component.css']
})

export class EditEducationComponent implements OnInit {
  editedu: Educacion = null;

  constructor(
    private sEducacion: EducacionService,
    private activatedRouter: ActivatedRoute,
    private router: Router) { }

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params['id'];
    this.sEducacion.detail(id).subscribe(
      data =>{
        this.editedu = data;
      }, err =>{
        alert("Error al modificar Educacion");
        this.router.navigate(['']);
      }
    )
  }

  onUpdate(): void{
    const id = this.activatedRouter.snapshot.params['id'];
    this.sEducacion.update(id, this.editedu).subscribe(
      data => {
        this.router.navigate(['']);
      }, err =>{
         alert("Error al modificar Educacion");
         this.router.navigate(['']);
      }
    )
  }

}
