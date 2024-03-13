/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Elia, Gisela y Achraf
 */
public class ClienteFidelizado extends Cliente{
    
    private int numeroTarjeta;
    private int puntos = 0; //15% de cada compra
    private LocalDate fechaAlta;
    private String id = super.getId();

    public ClienteFidelizado() {
    }
    
    public ClienteFidelizado(int numeroTarjeta, int puntos) {
        this.numeroTarjeta = numeroTarjeta;
        this.puntos = puntos;
        this.fechaAlta = LocalDate.now();
    }
    
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
    
    public LocalDate getFechaAlta(){
        return fechaAlta;
    }
    
    public String formatear(LocalDate fechaAlta){  
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = fechaAlta.format(formato);
        return fecha;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", numero de tarjeta: " + numeroTarjeta + ", puntos: " + puntos + ", fechaAlta: " + formatear(fechaAlta);
    }  
}
