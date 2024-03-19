/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import codigo.Libro;
import codigo.Pedido;
import codigo.UtilTienda;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gisela
 */
public class ConsultaLibro extends javax.swing.JPanel {

    ArrayList<Pedido> listaPedidos = UtilTienda.getListaPedidos();
    ArrayList<Libro> listaLibrosVendidos = new ArrayList<>();
    private DefaultTableModel d;
    private Object[] datos;
    private int ejempTotales = 0;
    
    public ConsultaLibro() {
        initComponents();
        initStyles();
        IniciarTabla();
    }
    
    public void initStyles(){
        Titulo.putClientProperty( "FlatLaf.style", "font: $h1.font" );
    }
    
    public void IniciarTabla(){
        d = new DefaultTableModel();
        Tabla.setModel(d);
        String[] cabecera = {"Cliente", "Ejemplares vendidos", "Fecha"};
        d.setColumnIdentifiers(cabecera);
        datos = new Object[3];
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TituloL = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        PrimerEjemplar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TotalEjemplares = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Titulo.setForeground(new java.awt.Color(94, 57, 21));
        Titulo.setText("Histórico de un libro");

        jLabel2.setText("Introduzca el titulo del libro: ");

        BotonBuscar.setText("Buscar");
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cliente", "Ejemplares vendidos", "Fecha"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setText("Primer ejemplar:");

        PrimerEjemplar.setText("                  ");

        jLabel4.setText("Total:");

        TotalEjemplares.setText("         ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PrimerEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TotalEjemplares, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TituloL, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(BotonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(Titulo)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(Titulo)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TituloL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(PrimerEjemplar)
                    .addComponent(jLabel4)
                    .addComponent(TotalEjemplares))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        boolean encontrado = false;
        for(Pedido pedido : listaPedidos){
            listaLibrosVendidos = pedido.getListaLibrosPedidos();
            for(Libro libro : listaLibrosVendidos){
                String titulo = libro.getTitulo();
                if(titulo.equals(TituloL.getText())){
                    ejempTotales += libro.getStock();                    
                    datos[0] = pedido.getCliente().getNombre();
                    datos[1] = libro.getStock();
                    datos[2] = pedido.getFecha();
                    d.addRow(datos);
                    encontrado = true;
                }   
            }   
        }
        PrimerEjemplar.setText(String.valueOf(Tabla.getValueAt(0, 2)));
        TotalEjemplares.setText(String.valueOf(ejempTotales));
        if(!encontrado){
            JOptionPane.showMessageDialog(this, "No se encontraron pedidos asociados al libro indicado");
        }
    }//GEN-LAST:event_BotonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JLabel PrimerEjemplar;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TituloL;
    private javax.swing.JLabel TotalEjemplares;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
