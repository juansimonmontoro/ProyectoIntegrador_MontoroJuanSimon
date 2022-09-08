package com.portfolio.jsm.Dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class dtoProyecto {

    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;    
    private String imgP;
    private String urlP;    

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String imgP, String urlP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.urlP = urlP;
    }  
    

    

}
