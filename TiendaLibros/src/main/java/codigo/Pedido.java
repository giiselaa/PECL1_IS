
package codigo;

import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Elia Encinas, Gisela González y Achraf (apellido)
 */
public class Pedido {
    private long codigoP;
    // codigo libros
    private Cliente cliente;
    //dni cliente
    private Date fecha;
    private int numEjemplares;
    
    private ArrayList<Libro> listaLibrosPedidos = new ArrayList(); 
    
    
}
