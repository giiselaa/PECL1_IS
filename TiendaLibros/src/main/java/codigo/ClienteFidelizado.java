/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.util.Date;

/**
 *
 * @author elia, Gisela y Achraf
 */
public class ClienteFidelizado extends Cliente{
    
    private int numeroTarjeta;
    private int puntos;
    private Date fechaAlta;

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }    

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public ClienteFidelizado(int numeroTarjeta, int puntos) {
        this.numeroTarjeta = numeroTarjeta;
        this.puntos = puntos;
        fechaAlta = super.getFechaAlta();
    }

}
