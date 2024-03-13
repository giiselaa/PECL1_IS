
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
    
    
    public Cliente(){
        
    }
    
    public Cliente(String id, String dni, String nombre) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        
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

    



}
