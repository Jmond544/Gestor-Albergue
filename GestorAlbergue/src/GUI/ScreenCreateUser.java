
package GUI;

import BO.EmployeeBO;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Entity.*;
import java.sql.Statement;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

public class ScreenCreateUser extends javax.swing.JPanel {

    private Connection conexion;
    private EmployeeBO em_BO;
    private String role;
    
    public ScreenCreateUser(Connection conexion) {
        initComponents();
        this.conexion = conexion;
        this.em_BO = new EmployeeBO();
        listarEmployees();
    }

    private void listarEmployees(){
        em_BO.listarEmployee(TBFormulario);
    }
    
    private void limpiar(){
        textFieldIdEmployee.setValue(0);
        textFieldIdArea.setValue(0);
        textFieldApellido.setText("");
        textFieldUserName.setText("");
        jPassword.setText("");
        textFieldMail.setText("");
        textFieldPhone.setText("");
        textFieldDirección.setText("");
        textFieldStartDate.setText("");
        textFieldEndDate.setText("");
        textFieldPositionEmployee.setText("");
        textAreaBenefits.setText("");
        textFieldSalary.setText("");
        textFieldConsultado.setText("Area");
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
        textAreaBenefits = new javax.swing.JTextArea();
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
        jLabel13 = new javax.swing.JLabel();
        textFieldStartDate = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        textFieldEndDate = new javax.swing.JTextField();
        textFieldPositionEmployee = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        textFieldUserName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        textFieldSalary = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(785, 650));
        setPreferredSize(new java.awt.Dimension(785, 650));

        jPanel1.setBackground(new java.awt.Color(229, 107, 111));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario Empleado - Nuevo usuario");

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
        jLabel4.setText("UserName:");

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

        textAreaBenefits.setBackground(new java.awt.Color(255, 255, 255));
        textAreaBenefits.setColumns(20);
        textAreaBenefits.setRows(5);
        jScrollPane1.setViewportView(textAreaBenefits);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Beneficios");

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Fecha inicio contrato:");

        textFieldStartDate.setBackground(new java.awt.Color(255, 255, 255));
        textFieldStartDate.setForeground(new java.awt.Color(0, 0, 0));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Fecha fin contrato:");

        textFieldEndDate.setBackground(new java.awt.Color(255, 255, 255));
        textFieldEndDate.setForeground(new java.awt.Color(0, 0, 0));

        textFieldPositionEmployee.setBackground(new java.awt.Color(255, 255, 255));
        textFieldPositionEmployee.setForeground(new java.awt.Color(0, 0, 0));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Posición empleado:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Mail:");

        textFieldUserName.setBackground(new java.awt.Color(255, 255, 255));
        textFieldUserName.setForeground(new java.awt.Color(0, 0, 0));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Password:");

        jPassword.setBackground(new java.awt.Color(255, 255, 255));
        jPassword.setText("jPasswordField1");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Salario:");

        textFieldSalary.setBackground(new java.awt.Color(255, 255, 255));
        textFieldSalary.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldConsultado, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(textFieldIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(7, 7, 7)
                                .addComponent(textFieldUserName))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPhone))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPassword))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDirección, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldStartDate)
                                .addGap(2, 2, 2))
                            .addComponent(jScrollPane1))
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldEndDate))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(17, 17, 17))))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPositionEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(textFieldIdEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(textFieldStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textFieldIdArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldConsultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(textFieldEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldPositionEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel18)
                        .addComponent(textFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(textFieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel16))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldDirección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLimpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_botonLimpiarMouseClicked

    private void botonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAgregarMouseClicked
        String password = new String( jPassword.getPassword() );
        if(textFieldIdArea.getValue() == null || 
                textFieldApellido.getText().isEmpty() ||
                textFieldUserName.getText().isEmpty() ||
                password.isEmpty() ||
                textFieldMail.getText().isEmpty() ||
                textFieldPhone.getText().isEmpty() ||
                textFieldDirección.getText().isEmpty() ||
                textFieldStartDate.getText().isEmpty() ||
                textFieldEndDate.getText().isEmpty() ||
                textFieldPositionEmployee.getText().isEmpty() ||
                textFieldSalary.getText().isEmpty() ||
                textAreaBenefits.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Employee employee = new Employee();
            try {
                employee.setIdArea((int) textFieldIdArea.getValue());
                employee.setSurnamesEmployee(textFieldApellido.getText());
                employee.setUserName(textFieldUserName.getText());
                employee.setPassword(password);
                employee.setMailContact(textFieldMail.getText());
                employee.setCellPhoneNumber(textFieldPhone.getText());
                employee.setAddress(textFieldDirección.getText());
                employee.setDateStartContract(dateFormat.parse(textFieldStartDate.getText()));
                employee.setDateEndContract(dateFormat.parse(textFieldEndDate.getText()));
                employee.setPositionEmployee(textFieldPositionEmployee.getText());
                employee.setSalary(new BigDecimal(textFieldSalary.getText()));
                employee.setBenefits(textAreaBenefits.getText());
                String mensaje = em_BO.agregarEmployee(employee);
                JOptionPane.showMessageDialog(null, mensaje);
                listarEmployees();
                
                // Creacion de usuario
                
                Statement statement = conexion.createStatement();

                // Ejecutar el script
                statement.executeUpdate("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");
                statement.executeUpdate("CREATE USER " + employee.getUserName() + " IDENTIFIED BY " + password);
                statement.executeUpdate("GRANT "+ this.role +" TO " + employee.getUserName());

                
                JOptionPane.showMessageDialog(null, "Se creó al usuario: "+employee.getUserName());
                
                limpiar();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al ejecutar el script: \n" + e.getMessage());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_botonAgregarMouseClicked

    private void botonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonModificarMouseClicked
        String password = new String( jPassword.getPassword() );
        if(textFieldIdArea.getValue() == null || 
                textFieldApellido.getText().isEmpty() ||
                textFieldUserName.getText().isEmpty() ||
                password.isEmpty() ||
                textFieldMail.getText().isEmpty() ||
                textFieldPhone.getText().isEmpty() ||
                textFieldDirección.getText().isEmpty() ||
                textFieldStartDate.getText().isEmpty() ||
                textFieldEndDate.getText().isEmpty() ||
                textFieldPositionEmployee.getText().isEmpty() ||
                textFieldSalary.getText().isEmpty() ||
                textAreaBenefits.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Rellene todos los campos.");
        }else{
            
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Employee employee = new Employee();
            try {
                employee.setIdEmployee((int) textFieldIdEmployee.getValue());
                employee.setIdArea((int) textFieldIdArea.getValue());
                employee.setSurnamesEmployee(textFieldApellido.getText());
                employee.setUserName(textFieldUserName.getText());
                employee.setPassword(password);
                employee.setMailContact(textFieldMail.getText());
                employee.setCellPhoneNumber(textFieldPhone.getText());
                employee.setAddress(textFieldDirección.getText());
                employee.setDateStartContract(dateFormat.parse(textFieldStartDate.getText()));
                employee.setDateEndContract(dateFormat.parse(textFieldEndDate.getText()));
                employee.setPositionEmployee(textFieldPositionEmployee.getText());
                employee.setSalary(new BigDecimal(textFieldSalary.getText()));
                employee.setBenefits(textAreaBenefits.getText());
                String mensaje = em_BO.modificarEmployee(employee);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarEmployees();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_botonModificarMouseClicked

    private void botonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonEliminarMouseClicked
        if(textFieldIdEmployee.getValue() == null){
            JOptionPane.showMessageDialog(null, "Rellene el ID del empleado.");
        }else{

            try {
                int index = (int) textFieldIdEmployee.getValue();
                String mensaje = em_BO.eliminarEmployee(index);
                JOptionPane.showMessageDialog(null, mensaje);
                listarEmployees();
                
                // Creacion de usuario
                
                Statement statement = conexion.createStatement();

                // Ejecutar el script
                statement.executeUpdate("ALTER SESSION SET \"_ORACLE_SCRIPT\" = true");
                statement.executeUpdate("DROP USER " + textFieldUserName.getText());

                JOptionPane.showMessageDialog(null, "Se eliminó al usuario: "+textFieldUserName.getText());
                
                limpiar();
            }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al ejecutar el script: \n" + e.getMessage());
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_botonEliminarMouseClicked

    private void textFieldIdAreaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_textFieldIdAreaStateChanged
        Connection con = OracleDatabaseConnector.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT NAMEAREA " +
                         "FROM ALBERGUE.AREA " +
                         "WHERE IDAREA = ?";
            pst = con.prepareStatement(sql);
            pst.setInt(1, (int) textFieldIdArea.getValue());

            rs = pst.executeQuery();

            if (rs.next()) {
                String nameArea = rs.getString("NAMEAREA");
                this.role = nameArea;
                textFieldConsultado.setText(nameArea);
            } else {
                textFieldConsultado.setText("Área no válida.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ejecutar la consulta:\n" + e.getMessage());
        }
    }//GEN-LAST:event_textFieldIdAreaStateChanged

    private void TBFormularioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBFormularioMousePressed
        int rowSelected = TBFormulario.getSelectedRow();
        try {
            int idEmpl = Integer.parseInt(TBFormulario.getValueAt(rowSelected, 0).toString());
            int idArea = Integer.parseInt(TBFormulario.getValueAt(rowSelected, 1).toString());
            
            textFieldIdEmployee.setValue(idEmpl);
            textFieldIdArea.setValue(idArea);
            textFieldApellido.setText(TBFormulario.getValueAt(rowSelected, 2).toString());
            textFieldUserName.setText(TBFormulario.getValueAt(rowSelected, 3).toString());
            jPassword.setText(TBFormulario.getValueAt(rowSelected, 4).toString());
            textFieldMail.setText(TBFormulario.getValueAt(rowSelected, 5).toString());
            textFieldPhone.setText(TBFormulario.getValueAt(rowSelected, 6).toString());
            textFieldDirección.setText(TBFormulario.getValueAt(rowSelected, 7).toString());
            textFieldStartDate.setText(TBFormulario.getValueAt(rowSelected, 8).toString());
            textFieldEndDate.setText(TBFormulario.getValueAt(rowSelected, 9).toString());
            textFieldPositionEmployee.setText(TBFormulario.getValueAt(rowSelected, 10).toString());
            textFieldSalary.setText(TBFormulario.getValueAt(rowSelected, 11).toString());
            textAreaBenefits.setText(TBFormulario.getValueAt(rowSelected, 12).toString());
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
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAreaBenefits;
    private javax.swing.JTextField textFieldApellido;
    private javax.swing.JTextField textFieldConsultado;
    private javax.swing.JTextField textFieldDirección;
    private javax.swing.JTextField textFieldEndDate;
    private javax.swing.JSpinner textFieldIdArea;
    private javax.swing.JSpinner textFieldIdEmployee;
    private javax.swing.JTextField textFieldMail;
    private javax.swing.JTextField textFieldPhone;
    private javax.swing.JTextField textFieldPositionEmployee;
    private javax.swing.JTextField textFieldSalary;
    private javax.swing.JTextField textFieldStartDate;
    private javax.swing.JTextField textFieldUserName;
    // End of variables declaration//GEN-END:variables
}
