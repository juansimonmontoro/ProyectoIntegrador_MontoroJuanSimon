package com.portfolio.jsm.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
   
    public HardSoftSkills(String nombreHSS, int porcentajeHSS, String imgHSS) {
        this.nombreHSS = nombreHSS;
        this.porcentajeHSS = porcentajeHSS;
        this.imgHSS = imgHSS;
    }   

}
