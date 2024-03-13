
package codigo;

import java.util.Date;

/**
 * 
 * @author Elia Encinas, Gisela González y Achraf (apellido)
 */
public class Cliente {
    
    private String id;
    private String dni;
    private String nombre;
    private Date fechaAlta;
    
    public Cliente(){
        
    }
    
    public Cliente(String id, String dni, String nombre, Date fechaAlta) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.fechaAlta = fechaAlta;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta() {
        Date fechaActual = new Date();
        fechaAlta = fechaActual;
    }



}
