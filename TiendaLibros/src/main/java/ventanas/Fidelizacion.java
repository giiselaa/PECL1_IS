/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import codigo.ClienteFidelizado;
import codigo.UtilTienda;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import presentacion.Inicio;

/**
 *
 * @author giise
 */
public class Fidelizacion extends javax.swing.JPanel {

    DefaultListModel<String> model = new DefaultListModel<>();
    
    /**
     * Creates new form Fidelizacion
     */
    public Fidelizacion() {
        initComponents();
        initStyles();
        addClientesLista();
    }
    
    public void initStyles(){
        Titulo.putClientProperty( "FlatLaf.style", "font: $h1.font" );
        //ListaAdheridos.putClientProperty( "FlatLaf.style", "font: bold $h1.regular.font");
        BotonAlta.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    
    public void addClientesLista(){

        for (ClienteFidelizado cliente : UtilTienda.getClientesFidelizados()) {
            String texto = cliente.toString();
            if(!model.contains(texto)){
            model.addElement(texto);
            }
        }
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
        Titulo = new javax.swing.JLabel();
        BotonAlta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaAdheridos = new javax.swing.JList<>();
        TituloLista = new javax.swing.JLabel();
        BotonSeleccionar = new javax.swing.JButton();

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setPreferredSize(new java.awt.Dimension(800, 490));

        Titulo.setBackground(new java.awt.Color(255, 255, 255));
        Titulo.setForeground(new java.awt.Color(94, 57, 21));
        Titulo.setText("Programa de fidelización");
        Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BotonAlta.setBackground(new java.awt.Color(150, 116, 83));
        BotonAlta.setForeground(new java.awt.Color(255, 255, 255));
        BotonAlta.setText("Dar de alta fidelización");
        BotonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaActionPerformed(evt);
            }
        });

        ListaAdheridos.setModel(model);
        ListaAdheridos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaAdheridos);

        TituloLista.setText("Lista de adheridos al programa:");

        BotonSeleccionar.setText("Seleccionar");
        BotonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(TituloLista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                        .addComponent(BotonSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(BotonAlta)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(121, 121, 121))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addGap(55, 55, 55)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloLista)
                    .addComponent(BotonSeleccionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(BotonAlta)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaActionPerformed
        DarAltaFidelizacion da= new DarAltaFidelizacion();
        da.setSize(800, 490);
        da.setLocation(0,0);
        
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        inicio.cambiarContenido(da);
    }//GEN-LAST:event_BotonAltaActionPerformed

    private void BotonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSeleccionarActionPerformed
        // cuando seleccione que pueda ver los datos y dar de baja
    }//GEN-LAST:event_BotonSeleccionarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAlta;
    private javax.swing.JButton BotonSeleccionar;
    private javax.swing.JList<String> ListaAdheridos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloLista;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
