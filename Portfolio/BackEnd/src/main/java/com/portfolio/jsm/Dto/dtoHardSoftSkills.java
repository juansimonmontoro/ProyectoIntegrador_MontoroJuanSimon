package com.portfolio.jsm.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHardSoftSkills {

    @NotBlank
    private String nombreHSS;
    @NotBlank
    private int porcentajeHSS;
    @NotBlank
    private String imgHSS;

    public dtoHardSoftSkills() {
    } 

    /*public dtoHardSoftSkills(String nombreHSS, String imgHSS) {
        this.nombreHSS = nombreHSS;
        this.imgHSS = imgHSS;
    } */   

    public dtoHardSoftSkills(String nombreHSS, int porcentajeHSS, String imgHSS) {
        this.nombreHSS = nombreHSS;
        this.porcentajeHSS = porcentajeHSS;
        this.imgHSS = imgHSS;
    }

    
    
    //Getters & Setters

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
