
package GUI;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScreenGeneral extends javax.swing.JPanel {

    private Connection conexion;
    
    public ScreenGeneral(Connection conexion) {
        this.conexion = conexion;
        initComponents();
        actualizarDatos();
    }
    
    public void actualizarDatos(){
        try{
            String query1 = "SELECT ALBERGUE.obtener_cantidad_pacientes() AS cantidad_pacientes FROM DUAL";
            String query2 = "SELECT ALBERGUE.obtener_cantidad_examenes() AS cantidad_examenes FROM DUAL";
            String query3 = "SELECT ALBERGUE.obtener_cantidad_voluntarios() AS cantidad_voluntarios FROM DUAL";
            String query4 = "SELECT ALBERGUE.obtener_cantidad_proveedores() AS cantidad_proveedores FROM DUAL";
            String query5 = "SELECT ALBERGUE.obtener_cantidad_donaciones_monetarias() AS cantidad_donaciones_monetarias FROM DUAL";
            String query6 = "SELECT ALBERGUE.obtener_monto_donaciones_monetarias() AS monto_donaciones_monetarias FROM DUAL";
            String query7 = "SELECT ALBERGUE.obtener_cantidad_donaciones_materiales() AS cantidad_donaciones_materiales FROM DUAL";
            
            try (Statement statement = conexion.createStatement()) {
                ResultSet resultSet1 = statement.executeQuery(query1);
                if (resultSet1.next()) {
                    int cantidadPacientes = resultSet1.getInt("cantidad_pacientes");
                    textCantPac.setText(String.valueOf(cantidadPacientes) );
                }
                
                ResultSet resultSet2 = statement.executeQuery(query2);
                if (resultSet2.next()) {
                    int cantidadExamenes = resultSet2.getInt("cantidad_examenes");
                    textCantExam.setText(String.valueOf(cantidadExamenes));
                }
                
                ResultSet resultSet3 = statement.executeQuery(query3);
                if (resultSet3.next()) {
                    int cantidadVoluntarios = resultSet3.getInt("cantidad_voluntarios");
                    textCantVolunt.setText(String.valueOf(cantidadVoluntarios));
                }
                
                ResultSet resultSet4 = statement.executeQuery(query4);
                if (resultSet4.next()) {
                    int cantidadProveedores = resultSet4.getInt("cantidad_proveedores");
                    textCantProvee.setText(String.valueOf(cantidadProveedores));
                }
                
                ResultSet resultSet5 = statement.executeQuery(query5);
                if (resultSet5.next()) {
                    int cantidadDonacionesMonetarias = resultSet5.getInt("cantidad_donaciones_monetarias");
                    textCantDonMonetary.setText(String.valueOf(cantidadDonacionesMonetarias));
                }
                
                ResultSet resultSet6 = statement.executeQuery(query6);
                if (resultSet6.next()) {
                    double montoDonacionesMonetarias = resultSet6.getDouble("monto_donaciones_monetarias");
                    textMontDonMonetary.setText(String.valueOf(montoDonacionesMonetarias));
                }
                
                ResultSet resultSet7 = statement.executeQuery(query7);
                if (resultSet7.next()) {
                    int cantidadDonacionesMateriales = resultSet7.getInt("cantidad_donaciones_materiales");
                    textCantDonMaterial.setText(String.valueOf(cantidadDonacionesMateriales));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textCantPac = new javax.swing.JTextField();
        textCantExam = new javax.swing.JTextField();
        textCantVolunt = new javax.swing.JTextField();
        textMontDonMonetary = new javax.swing.JTextField();
        textCantDonMonetary = new javax.swing.JTextField();
        textCantDonMaterial = new javax.swing.JTextField();
        textCantProvee = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general_paciente.png"))); // NOI18N
        jLabel2.setText("Cantidad Pacientes:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general_examenMedico.png"))); // NOI18N
        jLabel3.setText("Cantidad Examenes:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general_voluntario.png"))); // NOI18N
        jLabel4.setText("Cantidad Voluntarios:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general_proveedor.png"))); // NOI18N
        jLabel5.setText("Cantidad Proveedores:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general_donacionMonetaria.png"))); // NOI18N
        jLabel6.setText("Cantidad Donaciones monetarias:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general_bolsa-de-dinero.png"))); // NOI18N
        jLabel7.setText("Monto Donaciones monetarias:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/general_material-escolar.png"))); // NOI18N
        jLabel8.setText("Cantidad Donaciones materiales:");

        textCantPac.setBackground(new java.awt.Color(255, 255, 255));
        textCantPac.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCantPac.setForeground(new java.awt.Color(0, 0, 0));
        textCantPac.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCantPac.setText("jTextField1");
        textCantPac.setEnabled(false);

        textCantExam.setBackground(new java.awt.Color(255, 255, 255));
        textCantExam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCantExam.setForeground(new java.awt.Color(0, 0, 0));
        textCantExam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCantExam.setText("jTextField1");
        textCantExam.setEnabled(false);

        textCantVolunt.setBackground(new java.awt.Color(255, 255, 255));
        textCantVolunt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCantVolunt.setForeground(new java.awt.Color(0, 0, 0));
        textCantVolunt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCantVolunt.setText("jTextField1");
        textCantVolunt.setEnabled(false);

        textMontDonMonetary.setBackground(new java.awt.Color(255, 255, 255));
        textMontDonMonetary.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textMontDonMonetary.setForeground(new java.awt.Color(0, 0, 0));
        textMontDonMonetary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textMontDonMonetary.setText("jTextField1");
        textMontDonMonetary.setEnabled(false);

        textCantDonMonetary.setBackground(new java.awt.Color(255, 255, 255));
        textCantDonMonetary.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCantDonMonetary.setForeground(new java.awt.Color(0, 0, 0));
        textCantDonMonetary.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCantDonMonetary.setText("jTextField1");
        textCantDonMonetary.setEnabled(false);

        textCantDonMaterial.setBackground(new java.awt.Color(255, 255, 255));
        textCantDonMaterial.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCantDonMaterial.setForeground(new java.awt.Color(0, 0, 0));
        textCantDonMaterial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCantDonMaterial.setText("jTextField1");
        textCantDonMaterial.setEnabled(false);

        textCantProvee.setBackground(new java.awt.Color(255, 255, 255));
        textCantProvee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCantProvee.setForeground(new java.awt.Color(0, 0, 0));
        textCantProvee.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textCantProvee.setText("jTextField1");
        textCantProvee.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(229, 107, 111));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 80, 112));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¡Bienvenido!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCantVolunt, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCantPac))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCantExam)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textCantDonMonetary, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textCantDonMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textMontDonMonetary, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCantProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(textCantPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMontDonMonetary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(textCantExam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCantDonMonetary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(textCantVolunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCantDonMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textCantProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(161, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textCantDonMaterial;
    private javax.swing.JTextField textCantDonMonetary;
    private javax.swing.JTextField textCantExam;
    private javax.swing.JTextField textCantPac;
    private javax.swing.JTextField textCantProvee;
    private javax.swing.JTextField textCantVolunt;
    private javax.swing.JTextField textMontDonMonetary;
    // End of variables declaration//GEN-END:variables
}
