/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Elia, Gisela, Achraf
 */
public class UtilTienda {
    
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<ClienteFidelizado> clientesFidelizados = new ArrayList();
    private static ArrayList<ClienteFidelizado> subscriptores = new ArrayList();
    private static ArrayList<ClienteFidelizado> socios = new ArrayList();
    private static ArrayList<Libro> listaLibros = new ArrayList();
    private static Cliente objuser;
    private Map<Libro, Map<Socio, ArrayList<Resenna>>> resennasPorLibro = new HashMap<>();
    
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public static ArrayList<ClienteFidelizado> getClientesFidelizados() {
        for(ClienteFidelizado socio: socios){
            clientesFidelizados.add(socio);
        }
        for(ClienteFidelizado subs: subscriptores){
            clientesFidelizados.add(subs);
        }
        return clientesFidelizados;
    }
    
    /** Da de alta un Cliente
     * @param cliente Cliente a dar de alta
     * @return true si se da de alta y false si no */
    public static boolean altaCliente(Cliente cliente) {
        
        if (consultaClienteId(cliente.getId())==null) {
            clientes.add(cliente);
            return true;
        } else {
            return false;
        }
    }
    
    /** Da de baja una Cliente
     * @param cliente Cliente a dar de baja
     * @return true si se da de baja y false si no  */
    public static boolean bajaCliente(Cliente cliente) {
        if (clientes.contains(cliente)) {
            clientes.remove(cliente);
            return true;
        } else {
            return false;
        }
    }
    
    /** Consulta los datos de un Cliente por su Id
     * @param id Id del cliente a buscar en la lista
     * @return  El cliente de la lista con el id buscado*/
    public static Cliente consultaClienteId(String id) {
        //Comparador para ordenar los Clientes por su id
        Comparator IdproComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Cliente c1 = (Cliente) o1;
                Cliente c2 = (Cliente) o2;
                return c1.getId().compareTo(c2.getId());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, IdproComp);
        //creamos un Cliente con el id a buscar
        Cliente u = new Cliente();
        u.setId(id);
        int pos = Collections.binarySearch(clientes, u, IdproComp);
        if (pos >= 0) {
            objuser = clientes.get(pos);
        } else {
            objuser = null;
        }
        
        return objuser;
    }
    
    /** Da de alta una fidelizacion
     * @param cliente Cliente a dar de alta
     * @return true si se da de alta y false si no */
    public static boolean altaSocio(Socio cliente) {
        if (consultaFidelizacion(cliente.getNumeroTarjeta())==null && consultaClienteId(cliente.getId()) == null) {
            socios.add(cliente);
            return true;
        } else {
            return false;
        }
    }
    
    /** Da de baja una fidelizacion
     * @param cliente Cliente a dar de baja
     * @return true si se da de baja y false si no  */
    public static boolean bajaSocio(Socio cliente) {
        if (socios.contains(cliente)) {
            socios.remove(cliente);
            return true;
        } else {
            return false;
        }
    }
    
    /** Da de alta una fidelizacion
     * @param cliente Cliente a dar de alta
     * @return true si se da de alta y false si no */
    public static boolean altaSubscriptor(Subscriptor cliente) {
        if (consultaFidelizacion(cliente.getNumeroTarjeta())==null) {
            subscriptores.add(cliente);
            return true;
        } else {
            return false;
        }
    }
    
    /** Da de baja una fidelizacion
     * @param cliente Cliente a dar de baja
     * @return true si se da de baja y false si no  */
    public static boolean bajaSubscriptor(Subscriptor cliente) {
        if (subscriptores.contains(cliente)) {
            subscriptores.remove(cliente);
            return true;
        } else {
            return false;
        }
    }

    /** Consulta los datos de un Cliente por su Id
     * @param numeroTarjeta numero de la tarjeta de fidelizacion del cliente a buscar en la lista
     * @return  El cliente de la lista con el numero buscado*/
    public static Cliente consultaFidelizacion(int numeroTarjeta) {
        //Comparador para ordenar los Clientes por su numero de tarjeta de fidelizacion
        Comparator<ClienteFidelizado> NumproComp = new Comparator<ClienteFidelizado>() {
            @Override
            public int compare(ClienteFidelizado c1, ClienteFidelizado c2) {
                return Integer.compare(c1.getNumeroTarjeta(), c2.getNumeroTarjeta());
            }
        };

        // Ordenamos el array
        Collections.sort(clientesFidelizados, NumproComp);

        // Creamos un Cliente con el numeroTarjeta a buscar
        ClienteFidelizado u = new ClienteFidelizado();
        u.setNumeroTarjeta(numeroTarjeta);

        // Realizamos la búsqueda binaria
        int pos = Collections.binarySearch(clientesFidelizados, u, NumproComp);

        // Verificamos si se encontró el cliente
        if (pos >= 0) {
            objuser = clientesFidelizados.get(pos);
        } else {
            objuser = null;
        }

        return objuser;
    }
    
    /** 
     * Añade opinion de un socio sobre un libro
     * @param libro
     * @param socio
     * @param opinion
     * @param valoracion
     */
    public void Opinar(Libro libro, Socio socio, String opinion, int valoracion){
        
        //comprobar si hay resennas sobre el libro indicado
        if(!resennasPorLibro.containsKey(libro)){
            resennasPorLibro.put(libro, new HashMap<>());
        }
        
        Map<Socio, ArrayList<Resenna>> resennasPorSocio = resennasPorLibro.get(libro);
        
        //comprobar si el socio ha opinado anteriormente
        if(!resennasPorSocio.containsKey(socio)){
            resennasPorSocio.put(socio, new ArrayList<>());
        }
        
        //crear nueva resenna 
        Resenna nuevaResenna = new Resenna(opinion, valoracion);
        resennasPorSocio.get(socio).add(nuevaResenna);
    }
    
    public static ArrayList<Libro> iniciarListaLibros(){
        Libro libro1 = new Libro(12345678, "Pepe", "frankenstein", 12);
        Libro libro2= new Libro(23456789, "Cervantes", "El Quijote", 13);
        Libro libro3 = new Libro(87654321, "Jose", "Dune", 18);
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        return listaLibros;
    }
    
    public static ArrayList<Libro> getListaLibros(){
        if (listaLibros.isEmpty()){
            iniciarListaLibros();
        }
        return listaLibros;
    }
    
}

