
package CRUD;

import BO.MaterialDonation_BO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import Entity.*;

public class Frm_MaterialDonation extends javax.swing.JPanel {

    private Connection conexion;
    private MaterialDonation_BO md_BO;
    
    public Frm_MaterialDonation(Connection conexion) {
        initComponents();
        this.conexion = conexion;
        this.md_BO = new MaterialDonation_BO();
        listarMaterialDonation();
    }

    private void listarMaterialDonation(){
        md_BO.listarMaterialDonation(TBMaterialDonacion);
    }
    
    private void limpiar(){
        textFieldIdDonor.setValue(0);
        textFieldConsultadoDonor.setText("Donante");
        textFieldIdArea.setValue(0);
        textFieldConsultadoArea.setText("Area");
        jTextFieldDateDonation.setText("");
        jTextFieldType.setText("");
        jTextFieldAmount.setText("");
        textAreaComentario.setText("");
        textFieldStatus.setSelectedIndex(0);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textFieldConsultadoDonor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaComentario = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBMaterialDonacion = new javax.swing.JTable();
        textFieldIdDonor = new javax.swing.JSpinner();
        textFieldIdMaterialDonation = new javax.swing.JSpinner();
        textFieldConsultadoArea = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldDateDonation = new javax.swing.JTextField();
        jTextFieldType = new javax.swing.JTextField();
        jTextFieldAmount = new javax.swing.JTextField();
        textFieldStatus = new javax.swing.JComboBox<>();
        jButtonModificar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        textFieldIdArea = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(785, 650));
        setPreferredSize(new java.awt.Dimension(785, 650));

        jPanel1.setBackground(new java.awt.Color(110, 222, 138));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario del Material Donado");

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
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("ID Material de Doanción:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Donante:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID Área:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha de Donación:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tipo de Donación:");

        textFieldConsultadoDonor.setBackground(new java.awt.Color(255, 255, 255));
        textFieldConsultadoDonor.setForeground(new java.awt.Color(0, 0, 0));
        textFieldConsultadoDonor.setText("Donante");
        textFieldConsultadoDonor.setEnabled(false);
        textFieldConsultadoDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldConsultadoDonorActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        textAreaComentario.setBackground(new java.awt.Color(255, 255, 255));
        textAreaComentario.setColumns(20);
        textAreaComentario.setRows(5);
        jScrollPane1.setViewportView(textAreaComentario);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Comentarios:");

        TBMaterialDonacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TBMaterialDonacion);

        textFieldConsultadoArea.setBackground(new java.awt.Color(255, 255, 255));
        textFieldConsultadoArea.setText("Area");
        textFieldConsultadoArea.setEnabled(false);
        textFieldConsultadoArea.setSelectionEnd(7);
        textFieldConsultadoArea.setSelectionStart(7);
        textFieldConsultadoArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldConsultadoAreaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Monto de Donación:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Estado de Donación:");

        jTextFieldDateDonation.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDateDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateDonationActionPerformed(evt);
            }
        });

        jTextFieldType.setBackground(new java.awt.Color(255, 255, 255));

        jTextFieldAmount.setBackground(new java.awt.Color(255, 255, 255));

        textFieldStatus.setBackground(new java.awt.Color(255, 255, 255));
        textFieldStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textFieldStatus.setForeground(new java.awt.Color(0, 0, 0));
        textFieldStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pendiente", "Aprobado", "Rechazado" }));

        jButtonModificar.setBackground(new java.awt.Color(105, 181, 120));
        jButtonModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonAgregar.setBackground(new java.awt.Color(105, 181, 120));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jButtonEliminar.setBackground(new java.awt.Color(105, 181, 120));
        jButtonEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonLimpiar.setBackground(new java.awt.Color(105, 181, 120));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldIdDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(textFieldIdMaterialDonation))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(textFieldConsultadoDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldType, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextFieldDateDonation, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textFieldConsultadoArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE))
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonAgregar)
                                    .addComponent(jButtonEliminar))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1)
                                        .addContainerGap())
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jButtonModificar)
                                                .addComponent(textFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButtonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 122, Short.MAX_VALUE))))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textFieldIdMaterialDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(textFieldIdDonor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldConsultadoDonor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldConsultadoArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDateDonation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonModificar)
                        .addComponent(jButtonAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonEliminar)
                        .addComponent(jButtonLimpiar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldConsultadoDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldConsultadoDonorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldConsultadoDonorActionPerformed

    private void textFieldConsultadoAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldConsultadoAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldConsultadoAreaActionPerformed

    private void jTextFieldDateDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateDonationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateDonationActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        if(textFieldIdDonor.getValue() == null || 
                textFieldIdArea.getValue() == null ||
                jTextFieldDateDonation.getText().isEmpty() ||
                jTextFieldType.getText().isEmpty() ||
                jTextFieldAmount.getText().isEmpty() ||
                textAreaComentario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{
            
            MaterialDonation materialDonation = new MaterialDonation();
            try {
                materialDonation.setIdDonationMaterial((int) textFieldIdMaterialDonation.getValue());
                materialDonation.setIdDonor((int)textFieldIdDonor.getValue());
                materialDonation.setIdArea((int)textFieldIdArea.getValue());
                materialDonation.setDateDonation(jTextFieldDateDonation.getText());
                materialDonation.setType(jTextFieldType.getText());
                materialDonation.setAmount(Float.parseFloat(jTextFieldAmount.getText()));
                materialDonation.setComments(textAreaComentario.getText());
                materialDonation.setStatus((String) textFieldStatus.getSelectedItem());//lo mira
                String mensaje = md_BO.modificarMaterialDonation(materialDonation);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarMaterialDonation();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        if(textFieldIdMaterialDonation.getValue() == null){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{

            try {
                int index = (int) textFieldIdMaterialDonation.getValue();
                String mensaje = md_BO.eliminarMaterialDonation(index);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarMaterialDonation();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
         if(textFieldIdDonor.getValue() == null || 
                textFieldIdArea.getValue() == null ||
                jTextFieldDateDonation.getText().isEmpty() ||
                jTextFieldType.getText().isEmpty() ||
                jTextFieldAmount.getText().isEmpty() ||
                textAreaComentario.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{
            
            MaterialDonation materialDonation = new MaterialDonation();
            try {
                materialDonation.setIdDonor((int) textFieldIdDonor.getValue());
                materialDonation.setIdArea((int) textFieldIdArea.getValue());
                materialDonation.setDateDonation(jTextFieldDateDonation.getText());
                materialDonation.setType(jTextFieldType.getText());
                materialDonation.setAmount(Float.parseFloat(jTextFieldAmount.getText()));
                materialDonation.setComments(textAreaComentario.getText());
                materialDonation.setStatus((String) textFieldStatus.getSelectedItem());//lo mira
                String mensaje = md_BO.agregarMaterialDonation(materialDonation);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarMaterialDonation();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_jButtonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBMaterialDonacion;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldDateDonation;
    private javax.swing.JTextField jTextFieldType;
    private javax.swing.JTextArea textAreaComentario;
    private javax.swing.JTextField textFieldConsultadoArea;
    private javax.swing.JTextField textFieldConsultadoDonor;
    private javax.swing.JSpinner textFieldIdArea;
    private javax.swing.JSpinner textFieldIdDonor;
    private javax.swing.JSpinner textFieldIdMaterialDonation;
    private javax.swing.JComboBox<String> textFieldStatus;
    // End of variables declaration//GEN-END:variables
}
