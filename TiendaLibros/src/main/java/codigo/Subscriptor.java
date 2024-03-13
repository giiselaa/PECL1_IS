/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.util.Date;

/**
 *
 * @author elia, gisela y Achraf
 */
public class Subscriptor extends ClienteFidelizado{
    
    private int estrellas;
    private Date fechaAlta;

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public Subscriptor(int estrellas, int numeroTarjeta, int puntos) {
        super(numeroTarjeta, puntos);
        this.estrellas = estrellas;
        fechaAlta = super.getFechaAlta();
    }
    
    

}
