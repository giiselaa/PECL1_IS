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
    private String id;
    private String tipo;
    private String nombre;
    private Domicilio domicilio;
            
    public ClienteFidelizado() {
    }
    
    public ClienteFidelizado(int numeroTarjeta, int puntos, String id, String dni, String nombre, String tipo, Domicilio domicilio) {
        super(id, dni, nombre, domicilio);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaAlta = LocalDate.now();
        this.puntos = puntos;
        this.tipo = tipo;
    }
    
        public ClienteFidelizado(int numeroTarjeta, int puntos, String id, String dni, String nombre, String tipo) {
        super(id, dni, nombre);
        this.numeroTarjeta = numeroTarjeta;
        this.fechaAlta = LocalDate.now();
        this.puntos = puntos;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String formatear(LocalDate fechaAlta){  
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha = fechaAlta.format(formato);
        return fecha;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + ", id: " +id +", número de tarjeta: " + numeroTarjeta + ", puntos: " + puntos + ", fechaAlta: " + formatear(fechaAlta);
    }  
}
