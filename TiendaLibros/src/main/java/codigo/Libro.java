
package codigo;

/**
 * 
 * @author Elia Encinas, Gisela González y Achraf (apellido)
 */
public class Libro {
    private long codigoL;
    private int ejemplares;
    private String titulo;
    private int stock;

    public Libro(long codigoL, int ejemplares, String titulo, int stock) {
        this.codigoL = codigoL;
        this.ejemplares = ejemplares;
        this.titulo = titulo;
        this.stock = stock;
    }
    
    public void actualizarStock(int stock){
        this.stock = stock;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    
}
