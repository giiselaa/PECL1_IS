
package codigo;

/**
 * 
 * @author Elia Encinas, Gisela González
 */
public class Cliente {
    
    private String id;
    private String dni;
    private String nombre;
    private Domicilio domicilio;
    
    
    public Cliente(){
        
    }
    
    public Cliente(String id, String dni, String nombre, Domicilio domicilio) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;   
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

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + '}';
    }
    

}
