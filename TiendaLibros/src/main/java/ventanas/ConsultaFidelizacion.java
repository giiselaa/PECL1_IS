/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import codigo.ClienteFidelizado;
import codigo.Socio;
import codigo.Subscriptor;
import codigo.UtilTienda;

/**
 *
 * @author Gisela
 */
public class ConsultaFidelizacion extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaFidelizacion
     * @param cliente
     */
    public ConsultaFidelizacion(ClienteFidelizado cliente) {
        initComponents();
        initCliente(cliente);
        initStyles();
    }
    
    public void initCliente(ClienteFidelizado cliente){
        Nombre.setText(cliente.getNombre());
        Dni.setText(cliente.getDni());
        IdCliente.setText(cliente.getId());
        NumeroTarjeta.setText(Integer.toString(cliente.getNumeroTarjeta()));
        Puntos.setText(Integer.toString(cliente.getPuntos()));
        Tipo.setText(cliente.getTipo());
        Fecha.setText(cliente.getFechaAlta().toString());
    }
    
    public void initStyles(){
        Nombre.putClientProperty( "FlatLaf.style", "font: $h1.font" );
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
        Nombre = new javax.swing.JLabel();
        DarBaja = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IdCliente = new javax.swing.JLabel();
        NumeroTarjeta = new javax.swing.JLabel();
        Puntos = new javax.swing.JLabel();
        Dni = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Nombre.setForeground(new java.awt.Color(94, 57, 21));
        Nombre.setText("Nombre Cliente");

        DarBaja.setBackground(new java.awt.Color(150, 116, 83));
        DarBaja.setForeground(new java.awt.Color(255, 255, 255));
        DarBaja.setText("Dar de baja");
        DarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarBajaActionPerformed(evt);
            }
        });

        jLabel1.setText("Id:");

        IdCliente.setText("Id del cliente");

        NumeroTarjeta.setText("Numero del cliente");

        Puntos.setText("Puntos");

        Dni.setText("Dni del cliente");

        Tipo.setText("Tipo de fidelización");

        jLabel2.setText("Número de la tarjeta:");

        jLabel3.setText("Puntos:");

        jLabel4.setText("DNI:");

        jLabel5.setText("Fidelización:");

        jLabel6.setText("Fecha de fidelización:");

        Fecha.setText("Fecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(DarBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Puntos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NumeroTarjeta, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(36, 36, 36)
                        .addComponent(Tipo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(Dni))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(Nombre)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IdCliente)
                    .addComponent(Dni)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroTarjeta)
                    .addComponent(jLabel2)
                    .addComponent(Tipo)
                    .addComponent(jLabel5))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Puntos)
                    .addComponent(jLabel6)
                    .addComponent(Fecha))
                .addGap(104, 104, 104)
                .addComponent(DarBaja)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarBajaActionPerformed
        ClienteFidelizado cliente = UtilTienda.consultaFidelizacion(Integer.parseInt(NumeroTarjeta.getText()));
        UtilTienda.bajaFidelizacion(cliente);
        if("Socio".equals(cliente.getTipo())){
            Socio socio = new Socio(Integer.parseInt(NumeroTarjeta.getText()),Integer.parseInt(Puntos.getText()), IdCliente.getText(),Dni.getText(), Nombre.getText(), Tipo.getText());
            UtilTienda.bajaSocio(socio);
        }else if("Subscriptor".equals(cliente.getTipo())){
            Subscriptor subscriptor = new Subscriptor(Integer.parseInt(NumeroTarjeta.getText()),Integer.parseInt(Puntos.getText()), IdCliente.getText(),Dni.getText(), Nombre.getText(), Tipo.getText());
            UtilTienda.bajaSubscriptor(subscriptor);
        }
        
        this.dispose();
    }//GEN-LAST:event_DarBajaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DarBaja;
    private javax.swing.JLabel Dni;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel IdCliente;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NumeroTarjeta;
    private javax.swing.JLabel Puntos;
    private javax.swing.JLabel Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
