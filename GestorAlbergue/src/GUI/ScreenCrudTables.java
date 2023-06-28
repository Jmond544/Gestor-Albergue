
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;


public class ScreenCrudTables extends javax.swing.JPanel {

    private Connection conexion;
    
    public ScreenCrudTables(Connection conexion) {
        this.conexion = conexion;
        initComponents();
        inicializarComboBox();
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
            }

            // Cerrar los recursos
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
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
        System.out.println(comboBox.getSelectedItem());
    }//GEN-LAST:event_comboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BACKGROUNDcOMBObOX;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JPanel dinamicPanel;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
