package com.portfolio.jsm.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class dtoHardSoftSkills {

    @NotBlank
    private String nombreHSS;
    @NotBlank
    private int porcentajeHSS;
    @NotBlank
    private String imgHSS;
    
    //constructtores
    public dtoHardSoftSkills() {
    }

    public dtoHardSoftSkills(String nombreHSS, int porcentajeHSS, String imgHSS) {
        this.nombreHSS = nombreHSS;
        this.porcentajeHSS = porcentajeHSS;
        this.imgHSS = imgHSS;
    }   

}
