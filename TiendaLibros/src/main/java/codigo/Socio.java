/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

/**
 *
 * @author Elia, Gisela
 */
public class Socio extends ClienteFidelizado{

    public Socio(int numeroTarjeta, int puntos, String id, String dni, String nombre, String tipo, Domicilio domicilio) {
        super(numeroTarjeta, puntos, id, dni, nombre, tipo, domicilio);
    }
    
    public Socio(int numeroTarjeta, int puntos, String id, String dni, String nombre, String tipo) {
        super(numeroTarjeta, puntos, id, dni, nombre, tipo);
    }

}
