package com.portfolio.jsm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class HardSoftSkills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreHSS;       
    public int porcentajeHSS;
    private String imgHSS;

    //Constructores
    public HardSoftSkills() {
    }

    /*public HardSoftSkills(String nombreHSS, String imgHSS) {
        this.nombreHSS = nombreHSS;
        this.imgHSS = imgHSS;
    } */ 

    public HardSoftSkills(String nombreHSS, int porcentajeHSS, String imgHSS) {
        this.nombreHSS = nombreHSS;
        this.porcentajeHSS = porcentajeHSS;
        this.imgHSS = imgHSS;
    }  
  
    //Getters and setters todos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreHSS() {
        return nombreHSS;
    }

    public void setNombreHSS(String nombreHSS) {
        this.nombreHSS = nombreHSS;
    }

    public int getPorcentajeHSS() {
        return porcentajeHSS;
    }

    public void setPorcentajeHSS(int porcentajeHSS) {
        this.porcentajeHSS = porcentajeHSS;
    }

    public String getImgHSS() {
        return imgHSS;
    }

    public void setImgHSS(String imgHSS) {
        this.imgHSS = imgHSS;
    }   
    
}
