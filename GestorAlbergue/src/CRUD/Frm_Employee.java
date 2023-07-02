
package CRUD;

import BO.MedicalExam_BO;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Entity.*;

public class Frm_Employee extends javax.swing.JPanel {

    private Connection conexion;
    private MedicalExam_BO me_BO;
    
    public Frm_Employee(Connection conexion) {
        initComponents();
        this.conexion = conexion;
        this.me_BO = new MedicalExam_BO();
        listarMedical_Exam();
    }

    private void listarMedical_Exam(){
        me_BO.listarMedicalExam(TBFormulario);
    }
    
    private void limpiar(){
        textFieldIdArea.setValue(0);
        textFieldConsultado.setText("Paciente");
        textFieldApellido.setText("");
        textFieldMail.setText("");
        textFieldPhone.setText("");
        textAreaResultado.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textFieldApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textFieldMail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        textFieldPhone = new javax.swing.JTextField();
        textFieldConsultado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaResultado = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBFormulario = new javax.swing.JTable();
        botonAgregar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        botonModificar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        botonEliminar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        botonLimpiar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textFieldIdArea = new javax.swing.JSpinner();
        textFieldIdEmployee = new javax.swing.JSpinner();
        textFieldDirección = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(785, 650));
        setPreferredSize(new java.awt.Dimension(785, 650));

        jPanel1.setBackground(new java.awt.Color(229, 107, 111));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario Empleado");

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
        jLabel11.setText("ID Empleado:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Área:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos empleado:");

        textFieldApellido.setBackground(new java.awt.Color(255, 255, 255));
        textFieldApellido.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mail:");

        textFieldMail.setBackground(new java.awt.Color(255, 255, 255));
        textFieldMail.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Teléfono:");

        textFieldPhone.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPhone.setForeground(new java.awt.Color(0, 0, 0));

        textFieldConsultado.setBackground(new java.awt.Color(255, 255, 255));
        textFieldConsultado.setForeground(new java.awt.Color(0, 0, 0));
        textFieldConsultado.setText("Área");
        textFieldConsultado.setEnabled(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        textAreaResultado.setBackground(new java.awt.Color(255, 255, 255));
        textAreaResultado.setColumns(20);
        textAreaResultado.setRows(5);
        jScrollPane1.setViewportView(textAreaResultado);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Resultados del examen:");

        TBFormulario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TBFormularioMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(TBFormulario);

        botonAgregar.setBackground(new java.awt.Color(181, 101, 118));
        botonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAgregarMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Agregar");

        javax.swing.GroupLayout botonAgregarLayout = new javax.swing.GroupLayout(botonAgregar);
        botonAgregar.setLayout(botonAgregarLayout);
        botonAgregarLayout.setHorizontalGroup(
            botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        botonAgregarLayout.setVerticalGroup(
            botonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        botonModificar.setBackground(new java.awt.Color(181, 101, 118));
        botonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonModificarMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar");

        javax.swing.GroupLayout botonModificarLayout = new javax.swing.GroupLayout(botonModificar);
        botonModificar.setLayout(botonModificarLayout);
        botonModificarLayout.setHorizontalGroup(
            botonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        botonModificarLayout.setVerticalGroup(
            botonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        botonEliminar.setBackground(new java.awt.Color(181, 101, 118));
        botonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonEliminarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Eliminar");

        javax.swing.GroupLayout botonEliminarLayout = new javax.swing.GroupLayout(botonEliminar);
        botonEliminar.setLayout(botonEliminarLayout);
        botonEliminarLayout.setHorizontalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        botonEliminarLayout.setVerticalGroup(
            botonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        botonLimpiar.setBackground(new java.awt.Color(181, 101, 118));
        botonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLimpiarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Limpiar");

        javax.swing.GroupLayout botonLimpiarLayout = new javax.swing.GroupLayout(botonLimpiar);
        botonLimpiar.setLayout(botonLimpiarLayout);
        botonLimpiarLayout.setHorizontalGroup(
            botonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        botonLimpiarLayout.setVerticalGroup(
            botonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        textFieldIdArea.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                textFieldIdAreaStateChanged(evt);
            }
        });

        textFieldDirección.setBackground(new java.awt.Color(255, 255, 255));
        textFieldDirección.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Dirección:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDirección))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldPhone))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldConsultado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(15, 15, 15))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(textFieldIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldConsultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldDirección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(34, 34, 34))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_botonLimpiarMouseClicked

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        if(textFieldIdArea.getValue() == null || 
                textFieldApellido.getText().isEmpty() ||
                textFieldMail.getText().isEmpty() ||
                textFieldPhone.getText().isEmpty() ||
                textAreaResultado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{
            
            MedicalExam medicalExam = new MedicalExam();
            try {
                medicalExam.setIdPatient((int) textFieldIdArea.getValue());
                medicalExam.setTypeExam(textFieldApellido.getText());
                medicalExam.setDateExam(textFieldMail.getText());
                medicalExam.setDateResults(textFieldPhone.getText());
                medicalExam.setResults(textAreaResultado.getText());
                String mensaje = me_BO.agregarMedicalExam(medicalExam);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarMedical_Exam();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        if(textFieldIdArea.getValue() == null || 
                textFieldApellido.getText().isEmpty() ||
                textFieldMail.getText().isEmpty() ||
                textFieldPhone.getText().isEmpty() ||
                textAreaResultado.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{
            
            MedicalExam medicalExam = new MedicalExam();
            try {
                medicalExam.setIdMedical_Exam((int) textFieldIdEmployee.getValue());
                medicalExam.setIdPatient((int)textFieldIdArea.getValue());
                medicalExam.setTypeExam(textFieldApellido.getText());
                medicalExam.setDateExam(textFieldMail.getText());
                medicalExam.setDateResults(textFieldPhone.getText());
                medicalExam.setResults(textAreaResultado.getText());
                String mensaje = me_BO.modificarMedicalExam(medicalExam);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarMedical_Exam();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_botonModificarMouseClicked

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        if(textFieldIdEmployee.getValue() == null){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{

            try {
                int index = (int) textFieldIdEmployee.getValue();
                String mensaje = me_BO.eliminarMedicalExam(index);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarMedical_Exam();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void textFieldIdAreaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_textFieldIdAreaStateChanged
        Connection con = OracleDatabaseConnector.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT DNIPATIENT, NAMESPATIENT || ', ' || SURNAMESPATIENT AS ALL_NAME, DIAGNOSIS " +
                         "FROM ALBERGUE.PATIENT " +
                         "WHERE IDPATIENT = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, (int) textFieldIdArea.getValue());

            rs = pst.executeQuery();

            if (rs.next()) {
                String dni = rs.getString("DNIPATIENT");
                String nombreCompleto = rs.getString("ALL_NAME");
                String diagnostico = rs.getString("DIAGNOSIS");
                
                textFieldConsultado.setText(dni + "; " + nombreCompleto + "; " + diagnostico);
            } else {
                textFieldConsultado.setText("Paciente no existe.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta:\n" + e.getMessage());
        }
    }//GEN-LAST:event_textFieldIdAreaStateChanged

    private void TBFormularioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBFormularioMousePressed
        int rowSelected = TBFormulario.getSelectedRow();
        try {
            int idExam = Integer.parseInt(TBFormulario.getValueAt(rowSelected, 0).toString());
            int idPatient = Integer.parseInt(TBFormulario.getValueAt(rowSelected, 1).toString());
            textFieldIdEmployee.setValue(idExam);
            textFieldIdArea.setValue(idPatient);
            textFieldApellido.setText(TBFormulario.getValueAt(rowSelected, 2).toString());
            textFieldMail.setText(TBFormulario.getValueAt(rowSelected, 3).toString());
            textFieldPhone.setText(TBFormulario.getValueAt(rowSelected, 4).toString());
            textAreaResultado.setText(TBFormulario.getValueAt(rowSelected, 5).toString());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir los valores: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_TBFormularioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TBFormulario;
    private javax.swing.JPanel botonAgregar;
    private javax.swing.JPanel botonEliminar;
    private javax.swing.JPanel botonLimpiar;
    private javax.swing.JPanel botonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAreaResultado;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldConsultado;
    private javax.swing.JTextField textFieldDirección;
    private javax.swing.JSpinner textFieldIdArea;
    private javax.swing.JSpinner textFieldIdEmployee;
    private javax.swing.JTextField textFieldMail;
    private javax.swing.JTextField textFieldPhone;
    // End of variables declaration//GEN-END:variables
}
