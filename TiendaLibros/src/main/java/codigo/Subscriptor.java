/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author elia, gisela y Achraf
 */
public class Subscriptor extends ClienteFidelizado{
    
    private int estrellas;
    private LocalDate fechaAlta;
    

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public Subscriptor( int numeroTarjeta, int puntos, String id, String dni, String nombre, String tipo) {
        super(numeroTarjeta, puntos, id, dni, nombre, tipo);
        this.estrellas = 0;
        this.fechaAlta = LocalDate.now();
    }

    
    

}
