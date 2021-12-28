/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacolecciones;

/**
 *
 * @author Taller de INF
 */
public enum Entradas {
    BALCON ("BALCON --> RD$1000"),
    PIATEA ("PIATEA --> RD$1500"),
    VIP ("VIP --> RD$2500"), 
    FRONT_STAGE_PLATINUM ("FRONT STAGE PLATINUMRD -->$3000");
    
    String boleta;

    private Entradas(String boleta) {
        this.boleta = boleta;
    }

    public String getBoleta() {
        return boleta;
    }

    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }
    
    
    

  
    
}
