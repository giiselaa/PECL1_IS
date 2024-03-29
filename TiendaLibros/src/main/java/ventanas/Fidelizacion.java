/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import codigo.ClienteFidelizado;
import codigo.UtilTienda;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import presentacion.Inicio;

/**
 *
 * @author Elia, Gisela
 */
public class Fidelizacion extends javax.swing.JPanel {

    DefaultListModel<String> model = new DefaultListModel<>();
    ArrayList<ClienteFidelizado> clientesFidelizados = UtilTienda.getClientesFidelizados();
    ClienteFidelizado clienteSeleccionado;
    
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
       
        for (ClienteFidelizado cliente : clientesFidelizados) {
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
        BotonConsultar = new javax.swing.JButton();

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
        ListaAdheridos.setToolTipText("");
        jScrollPane1.setViewportView(ListaAdheridos);

        TituloLista.setText("Lista de adheridos al programa:");

        BotonConsultar.setText("Consultar");
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonAlta)
                    .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(fondoLayout.createSequentialGroup()
                            .addComponent(TituloLista)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(Titulo)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TituloLista)
                    .addComponent(BotonConsultar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(BotonAlta)
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaActionPerformed
        DarAltaFidelizacion da= new DarAltaFidelizacion();
        da.setSize(800, 490);
        da.setLocation(0,0);
        
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        inicio.cambiarContenido(da);
    }//GEN-LAST:event_BotonAltaActionPerformed

    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
        int seleccionado = ListaAdheridos.getSelectedIndex();
    if (seleccionado != -1 && seleccionado < clientesFidelizados.size()) {
        clienteSeleccionado = clientesFidelizados.get(seleccionado);

        ConsultaFidelizacion cf = new ConsultaFidelizacion(clienteSeleccionado);
        cf.setLocationRelativeTo(null);
        cf.setVisible(true);
    } else {
        // Si no hay ningún elemento seleccionado, muestra un mensaje de error
        JOptionPane.showMessageDialog(this, "Por favor, seleccione un cliente de la lista.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BotonConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAlta;
    private javax.swing.JButton BotonConsultar;
    private javax.swing.JList<String> ListaAdheridos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloLista;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
