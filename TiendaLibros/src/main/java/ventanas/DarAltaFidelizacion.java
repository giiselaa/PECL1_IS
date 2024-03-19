/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ventanas;

import codigo.Cliente;
import codigo.Socio;
import codigo.Subscriptor;
import codigo.UtilTienda;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import presentacion.Inicio;

/**
 *
 * @author Gisela, Elia
 */
public class DarAltaFidelizacion extends javax.swing.JPanel {
    
    /**
     * Creates new form DarAltaFidelizacion
     */
    public DarAltaFidelizacion() {
        initComponents();
        initStyles();
        buttonGroup1.add(BotonSocios);
        buttonGroup1.add(BotonSubscriptores);
    }
    
    public void initStyles(){
        Titulo.putClientProperty( "FlatLaf.style", "font: $h1.font" );
        BotonAlta.putClientProperty( "JButton.buttonType", "roundRect" );
        BotonVolver.putClientProperty( "JButton.buttonType", "roundRect" );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        BotonVolver = new javax.swing.JButton();
        Titulo = new javax.swing.JLabel();
        BotonSubscriptores = new javax.swing.JRadioButton();
        BotonSocios = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numeroTarjeta = new javax.swing.JTextField();
        BotonAlta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        idTextF = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BotonVolver.setBackground(new java.awt.Color(150, 116, 83));
        BotonVolver.setForeground(new java.awt.Color(255, 255, 255));
        BotonVolver.setText("Volver");
        BotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVolverActionPerformed(evt);
            }
        });

        Titulo.setForeground(new java.awt.Color(94, 57, 21));
        Titulo.setText("Dar de alta fidelización");

        BotonSubscriptores.setText("Subscriptor");

        BotonSocios.setText("Socio");

        jLabel1.setText("Tipo de fidelización: ");

        jLabel4.setText("Número de fidelización:");

        BotonAlta.setBackground(new java.awt.Color(150, 116, 83));
        BotonAlta.setForeground(new java.awt.Color(255, 255, 255));
        BotonAlta.setText("Dar de alta");
        BotonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAltaActionPerformed(evt);
            }
        });

        jLabel5.setText("Id:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(Titulo)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(97, 97, 97)
                                .addComponent(BotonSocios)
                                .addGap(103, 103, 103)
                                .addComponent(BotonSubscriptores))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idTextF, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(Titulo)
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSubscriptores)
                    .addComponent(BotonSocios)
                    .addComponent(jLabel1))
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(idTextF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(numeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonVolver)
                    .addComponent(BotonAlta))
                .addGap(87, 87, 87))
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

    private void BotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVolverActionPerformed
        Fidelizacion f1 = new Fidelizacion();
        f1.setSize(800, 490);
        f1.setLocation(0,0);
        
        Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
        inicio.cambiarContenido(f1);
    }//GEN-LAST:event_BotonVolverActionPerformed

    private void BotonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAltaActionPerformed

        Cliente c;
        
        if(UtilTienda.consultaClienteId(idTextF.getText()) != null){
            c = UtilTienda.consultaClienteId(idTextF.getText());
            String nombre = c.getNombre();
            if(!BotonSocios.isSelected() & !BotonSubscriptores.isSelected()){
                JOptionPane.showMessageDialog(this, "Debe seleccionar el tipo de subscripción que desea");
            }else if(idTextF.getText().isEmpty() || numeroTarjeta.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Debe rellenar todos los campos");
            }else{ 
                if(BotonSocios.isSelected()){
                    Socio cliente = new Socio(Integer.parseInt(numeroTarjeta.getText()),0, c.getId(), c.getDni(), c.getNombre(), "Socio");
                    cliente.setId(idTextF.getText());
                    cliente.setNombre(nombre);
                    if(UtilTienda.getClientesFidelizados().contains(cliente)){
                        JOptionPane.showMessageDialog(this, "El cliente indicado ya estaba dado de alta");
                    }else{
                        UtilTienda.altaSocio(cliente);
                        UtilTienda.altaFidelizacion(cliente);
                    }
                }else if(BotonSubscriptores.isSelected()){
                    Subscriptor cliente = new Subscriptor(Integer.parseInt(numeroTarjeta.getText()), 0, c.getId(), c.getDni(), c.getNombre(), "Subscriptor");
                    cliente.setId(idTextF.getText());
                    cliente.setNombre(nombre);
                    if(UtilTienda.getClientesFidelizados().contains(cliente)){
                        JOptionPane.showMessageDialog(this, "El cliente indicado ya estaba dado de alta");
                    }else{
                        UtilTienda.altaSubscriptor(cliente);
                        UtilTienda.altaFidelizacion(cliente);
                    }
                }

                JOptionPane.showMessageDialog(this, "Se ha dado de alta la fidelización");
                
                Principal p1 = new Principal();
                p1.setSize(800, 490);
                p1.setLocation(0,0);

                Inicio inicio = (Inicio) SwingUtilities.getWindowAncestor(this);
                inicio.cambiarContenido(p1);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Debe de dar de alta al cliente antes de poder dar de alta la fidelización");
        } 
    }//GEN-LAST:event_BotonAltaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAlta;
    private javax.swing.JRadioButton BotonSocios;
    private javax.swing.JRadioButton BotonSubscriptores;
    private javax.swing.JButton BotonVolver;
    private javax.swing.JLabel Titulo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField idTextF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
