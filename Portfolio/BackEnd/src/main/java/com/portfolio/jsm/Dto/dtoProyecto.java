package com.portfolio.jsm.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    
    @NotBlank
    private String nombreP;
    @NotBlank
    private String imgP;

    public dtoProyecto(String nombreP, String imgP) {
        this.nombreP = nombreP;
        this.imgP = imgP;
    }   

    public dtoProyecto() {
    }
    
    //Getters & Setters
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getImgP() {
        return imgP;
    }

    public void setImgP(String imgP) {
        this.imgP = imgP;
    }
    

    

    
    
}
