/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import codigo.Libro;
import codigo.UtilTienda;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import presentacion.Inicio;

/**
 *
 * @author Elia, Gisela
 */
public class Principal extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    DefaultTableModel dtmLibros = new DefaultTableModel();
    ArrayList<Libro> listaLibros = new ArrayList();
    
    
    public Principal() {
        initComponents();
        initStyles();
        IniciarTabla();
    }
    
    
    public void IniciarTabla(){
        DefaultTableModel d = new DefaultTableModel();
        TablaCatalogo.setModel(d);
        Object[] datos = new Object[4];
        String[] cabecera;
        cabecera = new String[] {"Titulo", "Autor", "Codigo", "Stock"};
        d.setColumnIdentifiers(cabecera);
        listaLibros = UtilTienda.getListaLibros();
 
        for(Libro libro : listaLibros) {
            datos[0] = libro.getTitulo();     
            datos[1] = libro.getAutor();
            datos[2] = libro.getCodigoL();
            datos[3] = libro.getStock();
            d.addRow(datos);
        }
    }
    
    public void initStyles(){
        Titulo.putClientProperty( "FlatLaf.style", "font: $h1.font" );
        BotonGenerarPedido.putClientProperty( "JButton.buttonType", "roundRect" );
        BotonGenerarOrden.putClientProperty( "JButton.buttonType", "roundRect" );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        BotonGenerarPedido = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCatalogo = new javax.swing.JTable();
        BotonGenerarOrden = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(754, 490));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setPreferredSize(new java.awt.Dimension(800, 490));

        BotonGenerarPedido.setBackground(new java.awt.Color(150, 116, 83));
        BotonGenerarPedido.setForeground(new java.awt.Color(255, 255, 255));
        BotonGenerarPedido.setText("Generar pedido");
        BotonGenerarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarPedidoActionPerformed(evt);
            }
        });

        Titulo.setForeground(new java.awt.Color(94, 57, 21));
        Titulo.setText("Catálogo de libros disponibles:");

        TablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título", "Autor", "Código", "Stock"
            }
        ));
        TablaCatalogo.setEnabled(false);
        jScrollPane1.setViewportView(TablaCatalogo);

        BotonGenerarOrden.setBackground(new java.awt.Color(150, 116, 83));
        BotonGenerarOrden.setForeground(new java.awt.Color(255, 255, 255));
        BotonGenerarOrden.setText("Generar orden de impresión");
        BotonGenerarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarOrdenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(Titulo))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(BotonGenerarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonGenerarOrden)
                .addGap(111, 111, 111))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(Titulo)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGenerarPedido)
                    .addComponent(BotonGenerarOrden))
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGenerarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarPedidoActionPerformed
        GenerarPedido gp = new GenerarPedido();
        gp.setSize(800, 490);
        gp.setLocation(0,0);
        
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        inicio.cambiarContenido(gp);
    }//GEN-LAST:event_BotonGenerarPedidoActionPerformed

    private void BotonGenerarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarOrdenActionPerformed
        GenerarOrdenImpresion go= new GenerarOrdenImpresion();
        go.setSize(800, 490);
        go.setLocation(0,0);
        
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        inicio.cambiarContenido(go);
    }//GEN-LAST:event_BotonGenerarOrdenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGenerarOrden;
    private javax.swing.JButton BotonGenerarPedido;
    private javax.swing.JTable TablaCatalogo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
