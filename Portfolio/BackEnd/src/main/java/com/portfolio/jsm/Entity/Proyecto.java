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
public class Proyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public String nombreP;
    public String descripcionP;
    private String imgP;
    private String urlP;

    //Constructores
    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String imgP, String urlP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.imgP = imgP;
        this.urlP = urlP;
    }

}
