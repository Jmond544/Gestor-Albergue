
package CRUD;

import BO.Necessity_BO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Entity.*;

public class Frm_Necessity extends javax.swing.JPanel {

    private Connection conexion;
    private Necessity_BO ne_BO;
    
    public Frm_Necessity(Connection conexion) {
        initComponents();
        this.conexion = conexion;
        this.ne_BO = new Necessity_BO();
        listarNecessity();
    }

    private void listarNecessity(){
        ne_BO.listarNecessity(TBNecessity);
    }
    
    private void limpiar(){
        textFieldIdArea.setValue(0);
        textFieldConsultadoArea.setText("Areae");
        textFieldIdMonetaryDonation.setValue(0);
        textFieldConsultadoMonetaryDonation.setText("Donacion Monetaria");
        jTextFieldDateRequest.setText("");
        jTextFieldEstimatedCost.setText("");
        textAreaDescription.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldDateRequest = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBNecessity = new javax.swing.JTable();
        jTextFieldEstimatedCost = new javax.swing.JTextField();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        textFieldConsultadoMonetaryDonation = new javax.swing.JTextField();
        textFieldIdNecessity = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textFieldIdArea = new javax.swing.JSpinner();
        jButtonAgregar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        textFieldConsultadoArea = new javax.swing.JTextField();
        jButtonLimpiar = new javax.swing.JButton();
        textFieldIdMonetaryDonation = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(785, 650));

        jTextFieldDateRequest.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateRequestActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(191, 219, 247));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Necesidades");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Área:");

        TBNecessity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TBNecessity);

        jTextFieldEstimatedCost.setBackground(new java.awt.Color(255, 255, 255));

        jButtonEliminar.setBackground(new java.awt.Color(127, 222, 255));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        textAreaDescription.setBackground(new java.awt.Color(255, 255, 255));
        textAreaDescription.setColumns(20);
        textAreaDescription.setRows(5);
        jScrollPane1.setViewportView(textAreaDescription);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Costo Estimado:");

        textFieldConsultadoMonetaryDonation.setBackground(new java.awt.Color(255, 255, 255));
        textFieldConsultadoMonetaryDonation.setText("Donacion Monetaria");
        textFieldConsultadoMonetaryDonation.setEnabled(false);
        textFieldConsultadoMonetaryDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldConsultadoMonetaryDonationActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Solicitud:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID Donación Monetaria:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID Necesidad:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Descripción:");

        jButtonAgregar.setBackground(new java.awt.Color(127, 222, 255));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonModificar.setBackground(new java.awt.Color(127, 222, 255));
        jButtonModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        textFieldConsultadoArea.setBackground(new java.awt.Color(255, 255, 255));
        textFieldConsultadoArea.setForeground(new java.awt.Color(0, 0, 0));
        textFieldConsultadoArea.setText("Area");
        textFieldConsultadoArea.setEnabled(false);
        textFieldConsultadoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldConsultadoAreaActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(127, 222, 255));
        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldIdNecessity, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldIdMonetaryDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textFieldConsultadoArea, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextFieldEstimatedCost)
                                .addComponent(jTextFieldDateRequest)
                                .addComponent(textFieldConsultadoMonetaryDonation))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAgregar)
                                .addGap(80, 80, 80)
                                .addComponent(jButtonModificar))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonEliminar)
                                        .addGap(69, 69, 69)
                                        .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textFieldIdNecessity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldConsultadoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldIdMonetaryDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldConsultadoMonetaryDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDateRequest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstimatedCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAgregar)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar)
                    .addComponent(jButtonLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateRequestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateRequestActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if(textFieldIdNecessity.getValue() == null){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{

            try {
                int index = (int) textFieldIdNecessity.getValue();
                String mensaje = ne_BO.eliminarNecessity(index);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarNecessity();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void textFieldConsultadoMonetaryDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldConsultadoMonetaryDonationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldConsultadoMonetaryDonationActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        if(textFieldIdArea.getValue() == null ||
            textFieldIdMonetaryDonation.getValue() == null ||
            jTextFieldDateRequest.getText().isEmpty() ||
            jTextFieldEstimatedCost.getText().isEmpty() ||
            textAreaDescription.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{

            Necessity necessity = new Necessity();
            try {
                necessity.setIdArea((int) textFieldIdArea.getValue());
                necessity.setIdMonetaryDonation((int) textFieldIdMonetaryDonation.getValue());
                necessity.setDateRequest(jTextFieldDateRequest.getText());
                necessity.setEstimatedCost(Float.parseFloat(jTextFieldEstimatedCost.getText()));
                necessity.setDescription(textAreaDescription.getText());
                String mensaje = ne_BO.agregarNecessity(necessity);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarNecessity();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if(textFieldIdArea.getValue() == null || 
            textFieldIdMonetaryDonation.getValue() == null ||
            jTextFieldDateRequest.getText().isEmpty() ||
            jTextFieldEstimatedCost.getText().isEmpty() ||
            textAreaDescription.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{

            Necessity necessity = new Necessity();
            try {
                necessity.setIdNecessity((int) textFieldIdNecessity.getValue());
                necessity.setIdArea((int)textFieldIdArea.getValue());
                necessity.setIdMonetaryDonation((int)textFieldIdMonetaryDonation.getValue());
                necessity.setDateRequest(jTextFieldDateRequest.getText());
                necessity.setEstimatedCost(Float.parseFloat(jTextFieldEstimatedCost.getText()));
                necessity.setDescription(textAreaDescription.getText());
                String mensaje = ne_BO.modificarNecessity(necessity);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarNecessity();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void textFieldConsultadoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldConsultadoAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldConsultadoAreaActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBNecessity;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDateRequest;
    private javax.swing.JTextField jTextFieldEstimatedCost;
    private javax.swing.JTextArea textAreaDescription;
    private javax.swing.JTextField textFieldConsultadoArea;
    private javax.swing.JTextField textFieldConsultadoMonetaryDonation;
    private javax.swing.JSpinner textFieldIdArea;
    private javax.swing.JSpinner textFieldIdMonetaryDonation;
    private javax.swing.JSpinner textFieldIdNecessity;
    // End of variables declaration//GEN-END:variables
}
