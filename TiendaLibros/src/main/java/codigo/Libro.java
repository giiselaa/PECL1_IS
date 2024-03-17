
package codigo;

/**
 * 
 * @author Elia Encinas, Gisela González y Achraf (apellido)
 */
public class Libro {
    private long codigoL;
    private String autor;
    private String titulo;
    private int stock;

    public Libro(long codigoL, String autor, String titulo, int stock) {
        this.codigoL = codigoL;
        this.autor = autor;
        this.titulo = titulo;
        this.stock = stock;
    }
    
    public void setCodigoL(long codigoL){
        this.codigoL = codigoL;
    }
    
    public long getCodigoL(){
        return this.codigoL;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void actualizarStock(int stock){
        this.stock = stock;
    }
    
    public int getStock(){
        return this.stock;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", autor: " + autor + ", codigo: " + codigoL + ", stock: " + stock;
    }
    
    
}
