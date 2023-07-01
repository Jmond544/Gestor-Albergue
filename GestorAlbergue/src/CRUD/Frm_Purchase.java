
package CRUD;

import BO.Purchase_BO;
import Database.OracleDatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Entity.*;

public class Frm_Purchase extends javax.swing.JPanel {
    private Connection conexion;
    private Purchase_BO pu_BO;
    
    
    public Frm_Purchase(Connection conexion) {
        initComponents();
        this.conexion=conexion;
        this.pu_BO= new Purchase_BO();
        listarPurchase();
    }
    private void listarPurchase(){
        pu_BO.listarPurchase(TBFormulario);
    }

    private void limpiar(){
        textFieldIDCompra.setValue(0);
        textFieldIDArea.setValue(0);
        textFieldIDProveedor.setValue(0);
        textFieldNombreProducto.setText("");
        textFieldTipo.setText("");
        textFieldCantidad.setValue(0);
        textFieldPrecioUnitario.setText("");
        textAreaDescripcion.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textFieldNombreProducto = new javax.swing.JTextField();
        textFieldTipo = new javax.swing.JTextField();
        textFieldPrecioUnitario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescripcion = new javax.swing.JTextArea();
        BotonAgregar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        BotonEliminar = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BotonLimpiar = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        textFieldIDArea = new javax.swing.JSpinner();
        textFieldIDProveedor = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBFormulario = new javax.swing.JTable();
        textFieldCantidad = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        textFieldIDCompra = new javax.swing.JSpinner();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(785, 650));
        setPreferredSize(new java.awt.Dimension(785, 650));

        jPanel1.setBackground(new java.awt.Color(229, 107, 111));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de compras");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID Area:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID Proveedor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre producto:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Descripcion del producto:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Tipo: ");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cantidad:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Precio unitario:");

        textFieldNombreProducto.setBackground(new java.awt.Color(255, 255, 255));

        textFieldTipo.setBackground(new java.awt.Color(255, 255, 255));

        textFieldPrecioUnitario.setBackground(new java.awt.Color(255, 255, 255));

        textAreaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        textAreaDescripcion.setColumns(20);
        textAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(textAreaDescripcion);

        BotonAgregar.setBackground(new java.awt.Color(181, 101, 118));
        BotonAgregar.setPreferredSize(new java.awt.Dimension(125, 30));
        BotonAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Agregar");

        javax.swing.GroupLayout BotonAgregarLayout = new javax.swing.GroupLayout(BotonAgregar);
        BotonAgregar.setLayout(BotonAgregarLayout);
        BotonAgregarLayout.setHorizontalGroup(
            BotonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        BotonAgregarLayout.setVerticalGroup(
            BotonAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        BotonModificar.setBackground(new java.awt.Color(181, 101, 118));
        BotonModificar.setPreferredSize(new java.awt.Dimension(125, 30));
        BotonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonModificarMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Modificar");

        javax.swing.GroupLayout BotonModificarLayout = new javax.swing.GroupLayout(BotonModificar);
        BotonModificar.setLayout(BotonModificarLayout);
        BotonModificarLayout.setHorizontalGroup(
            BotonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        BotonModificarLayout.setVerticalGroup(
            BotonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        BotonEliminar.setBackground(new java.awt.Color(181, 101, 118));
        BotonEliminar.setPreferredSize(new java.awt.Dimension(125, 30));
        BotonEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEliminarMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Eliminar");

        javax.swing.GroupLayout BotonEliminarLayout = new javax.swing.GroupLayout(BotonEliminar);
        BotonEliminar.setLayout(BotonEliminarLayout);
        BotonEliminarLayout.setHorizontalGroup(
            BotonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        BotonEliminarLayout.setVerticalGroup(
            BotonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        BotonLimpiar.setBackground(new java.awt.Color(181, 101, 118));
        BotonLimpiar.setPreferredSize(new java.awt.Dimension(125, 30));
        BotonLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLimpiarMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Limpiar");

        javax.swing.GroupLayout BotonLimpiarLayout = new javax.swing.GroupLayout(BotonLimpiar);
        BotonLimpiar.setLayout(BotonLimpiarLayout);
        BotonLimpiarLayout.setHorizontalGroup(
            BotonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        BotonLimpiarLayout.setVerticalGroup(
            BotonLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("ID Compra:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                            .addComponent(textFieldTipo)
                            .addComponent(textFieldIDArea)
                            .addComponent(textFieldIDProveedor)
                            .addComponent(textFieldCantidad)
                            .addComponent(textFieldIDCompra))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldPrecioUnitario))))
                    .addComponent(jScrollPane2))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(textFieldPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(textFieldIDCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldIDArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textFieldIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textFieldNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textFieldCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel4)))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarMouseClicked
        if(textFieldIDArea.getValue()==null||
                textFieldIDProveedor.getValue()==null ||
                textFieldNombreProducto.getText().isEmpty() ||
                textFieldTipo.getText().isEmpty() ||
                textFieldCantidad.getValue()==null ||
                textFieldPrecioUnitario.getText().isEmpty() ||
                textAreaDescripcion.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Rellene todos los campos. ");
    }else{
            Purchase purchase = new Purchase();
            try {
                purchase.setIdArea((int) textFieldIDArea.getValue());
                purchase.setIdSupplier((int) textFieldIDProveedor.getValue());
                purchase.setNameProduct(textFieldNombreProducto.getText());
                purchase.setType(textFieldTipo.getText());
                purchase.setAmount((int) textFieldCantidad.getValue());
                purchase.setUnitAmount(Float.parseFloat(textFieldPrecioUnitario.getText()));
                purchase.setDescriptionProduct(textAreaDescripcion.getText());
                String mensaje= pu_BO.agregarPurchase(purchase);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarPurchase();
            } catch (Exception e) {
                
            }
        }
    }//GEN-LAST:event_BotonAgregarMouseClicked

    private void BotonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseClicked
        if(textFieldIDArea.getValue()==null||
                textFieldIDProveedor.getValue()==null ||
                textFieldNombreProducto.getText().isEmpty() ||
                textFieldTipo.getText().isEmpty() ||
                textFieldCantidad.getValue()==null ||
                textFieldPrecioUnitario.getText().isEmpty() ||
                textAreaDescripcion.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Rellene todos los campos. ");
    }else{
            Purchase purchase = new Purchase();
            try {
                purchase.setIdPurchase((int) textFieldIDCompra.getValue());
                purchase.setIdArea((int) textFieldIDArea.getValue());
                purchase.setIdSupplier((int)textFieldIDProveedor.getValue());
                purchase.setNameProduct(textFieldNombreProducto.getText());
                purchase.setType(textFieldTipo.getText());
                purchase.setAmount((int)textFieldCantidad.getValue());
                purchase.setUnitAmount(Float.parseFloat(textFieldPrecioUnitario.getText()));
                purchase.setDescriptionProduct(textAreaDescripcion.getText());
                String mensaje = pu_BO.modificarPurchase(purchase);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarPurchase();   
            } catch(Exception e){
                
            }
            
            
        }
        
        
    }//GEN-LAST:event_BotonModificarMouseClicked

    private void BotonEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEliminarMouseClicked
        if (textFieldIDCompra.getNextValue()==null) {
            JOptionPane.showMessageDialog(null, "rellene todos los campos");
        }else{
            try {
                int index=(int)textFieldIDCompra.getValue();
                String mensaje=pu_BO.eliminarPurchase(index);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();
                listarPurchase();
                
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_BotonEliminarMouseClicked

    private void BotonLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLimpiarMouseClicked
        //Limpiamos los valores ingresados
        limpiar();
    }//GEN-LAST:event_BotonLimpiarMouseClicked

    private void TBFormularioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBFormularioMousePressed
        int rowSelect  = TBFormulario.getSelectedRow();
        System.out.println(rowSelect);
        try{
            int idCompra = Integer.parseInt(TBFormulario.getValueAt(rowSelect, 0).toString());
            int idArea = Integer.parseInt(TBFormulario.getValueAt(rowSelect, 1).toString());
            int idProveedor=Integer.parseInt(TBFormulario.getValueAt(rowSelect, 2).toString());
            textFieldIDCompra.setValue(idCompra);
            textFieldIDArea.setValue(idArea);
            textFieldIDProveedor.setValue(idProveedor);
            textFieldNombreProducto.setText(TBFormulario.getValueAt(rowSelect, 3).toString());
            textFieldTipo.setText(TBFormulario.getValueAt(rowSelect, 4).toString());
            int Cantidad = Integer.parseInt(TBFormulario.getValueAt(rowSelect, 5).toString());
            textFieldCantidad.setValue(Cantidad);
            textFieldPrecioUnitario.setText(TBFormulario.getValueAt(rowSelect, 6).toString());
            
            textAreaDescripcion.setText(TBFormulario.getValueAt(rowSelect, 7).toString());
        }catch(NumberFormatException e){
            System.out.println("Error alc onvertir los valores: " + e.getMessage());
        }
        catch(Exception ex){
            System.out.println("Error: "+ ex.getMessage());
        }
    }//GEN-LAST:event_TBFormularioMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonAgregar;
    private javax.swing.JPanel BotonEliminar;
    private javax.swing.JPanel BotonLimpiar;
    private javax.swing.JPanel BotonModificar;
    private javax.swing.JTable TBFormulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextArea textAreaDescripcion;
    private javax.swing.JSpinner textFieldCantidad;
    private javax.swing.JSpinner textFieldIDArea;
    private javax.swing.JSpinner textFieldIDCompra;
    private javax.swing.JSpinner textFieldIDProveedor;
    private javax.swing.JTextField textFieldNombreProducto;
    private javax.swing.JTextField textFieldPrecioUnitario;
    private javax.swing.JTextField textFieldTipo;
    // End of variables declaration//GEN-END:variables
}
