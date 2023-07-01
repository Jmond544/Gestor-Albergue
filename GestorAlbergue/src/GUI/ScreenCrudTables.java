
package GUI;

import CRUD.*;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ScreenCrudTables extends javax.swing.JPanel {

    private Connection conexion;
    private ArrayList<JPanel> listaCruds;
    
    public ScreenCrudTables(Connection conexion) {
        this.conexion = conexion;
        listaCruds = new ArrayList<>();
        initComponents();
        inicializarComboBox();
    }
    
    private void showPanel(JPanel p){
        p.setSize(785, 650);
        p.setLocation(0, 0);
        dinamicPanel.removeAll();
        dinamicPanel.add(p, BorderLayout.CENTER);
        dinamicPanel.revalidate();
        dinamicPanel.repaint();
    }

    private void inicializarComboBox(){
        // Crear un modelo de lista para el ComboBox
        comboBox.removeAllItems();
        try {
            // Crear la consulta SQL
            String sql = "SELECT TABLE_NAME FROM ALL_TABLES WHERE OWNER = 'ALBERGUE' ORDER BY 1";

            // Crear una sentencia preparada
            PreparedStatement statement = conexion.prepareStatement(sql);

            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();

            // Recorrer los resultados y agregarlos al modelo de lista
            while (resultSet.next()) {
                String tableName = resultSet.getString("TABLE_NAME");
                comboBox.addItem(tableName);
                inicializadorPaneles(tableName);
            }

            // Cerrar los recursos
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    private void inicializadorPaneles(String tableName){
        switch (tableName) {
            case "ATTORNEY":
                listaCruds.add(this.convertirAPanel(new Frm_Attorney(conexion)));
                break;
            case "CLINIC_HISTORY":
                listaCruds.add(this.convertirAPanel(new Frm_ClinicHistory(conexion)));
                break;
            case "PATIENT":
                listaCruds.add(this.convertirAPanel(new Frm_Paciente(conexion)));
                break;
            case "MEDICAL_EXAM":
                listaCruds.add(new Frm_Medical_Exam(conexion));
                break;
            case "AREA":
                listaCruds.add(null);
                break;
            case "EMPLOYEE":
                listaCruds.add(null);
                break;
            case "VOLUNTEER":
                listaCruds.add(null);
                break;
            case "VOLUNTEERPATIENT":
                listaCruds.add(null);
                break;
            case "SUPPLIER":
                listaCruds.add(null);
                break;
            case "PURCHASE":
                listaCruds.add(null);
                break;
            case "DONOR":
                listaCruds.add(this.convertirAPanel(new FrmDonor()));
                break;
            case "MONETARYDONATION":
                listaCruds.add(new FrmMonetaryDonation());
                break;
            case "MATERIALDONATION":
                listaCruds.add(null);
                break;
            case "NECESSITY":
                listaCruds.add(null);
                break;
            
            default:
                throw new AssertionError();
        }
    }
    
    public JPanel convertirAPanel(JFrame frm){
        JPanel panel = new JPanel();

        
        panel.setLayout(frm.getLayout());
        panel.setBackground(frm.getBackground());
        panel.setForeground(frm.getForeground());
        panel.setFont(frm.getFont());

        for (java.awt.Component componente : frm.getContentPane().getComponents()) {
            panel.add(componente);
        }

        return panel;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BACKGROUNDcOMBObOX = new javax.swing.JPanel();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dinamicPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        comboBox.setBorder(null);
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABLA:");

        javax.swing.GroupLayout BACKGROUNDcOMBObOXLayout = new javax.swing.GroupLayout(BACKGROUNDcOMBObOX);
        BACKGROUNDcOMBObOX.setLayout(BACKGROUNDcOMBObOXLayout);
        BACKGROUNDcOMBObOXLayout.setHorizontalGroup(
            BACKGROUNDcOMBObOXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BACKGROUNDcOMBObOXLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        BACKGROUNDcOMBObOXLayout.setVerticalGroup(
            BACKGROUNDcOMBObOXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BACKGROUNDcOMBObOXLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BACKGROUNDcOMBObOXLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        dinamicPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dinamicPanelLayout = new javax.swing.GroupLayout(dinamicPanel);
        dinamicPanel.setLayout(dinamicPanelLayout);
        dinamicPanelLayout.setHorizontalGroup(
            dinamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        dinamicPanelLayout.setVerticalGroup(
            dinamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dinamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BACKGROUNDcOMBObOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BACKGROUNDcOMBObOX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dinamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        int index = comboBox.getSelectedIndex();
        if(index >= 0 && index<listaCruds.size()){
            showPanel(listaCruds.get(index));
        }
        if(index == 2){
            showPanel(listaCruds.get(index));
        }
    }//GEN-LAST:event_comboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUNDcOMBObOX;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel dinamicPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
