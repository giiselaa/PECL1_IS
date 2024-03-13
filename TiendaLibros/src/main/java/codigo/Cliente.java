
package codigo;

import java.util.Date;

/**
 * 
 * @author Elia Encinas, Gisela González y Achraf (apellido)
 */
public class Cliente {
    
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
       private Date fechaAlta;

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta() {
        Date fechaActual = new Date();
        fechaAlta = fechaActual;
    }



}
