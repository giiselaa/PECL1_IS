
package codigo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * 
 * @author Elia Encinas, Gisela González y Achraf (apellido)
 */
public class Pedido {

    private Cliente cliente;//dni cliente
    private LocalDate fecha;
    private ArrayList<Libro> listaLibrosPedidos = new ArrayList(); //codigo

    public Pedido(Cliente cliente, LocalDate fecha, ArrayList<Libro> listaLibrosPedidos) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.listaLibrosPedidos = listaLibrosPedidos;
    }
    
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Libro> getListaLibrosPedidos() {
        return listaLibrosPedidos;
    }

    public void setListaLibrosPedidos(ArrayList<Libro> listaLibrosPedidos) {
        this.listaLibrosPedidos = listaLibrosPedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
