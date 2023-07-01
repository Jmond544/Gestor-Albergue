package CRUD;

import BO.DonorBO;
import Entity.Donor;

public class FrmDonor extends javax.swing.JFrame {

    private DonorBO dbo = new DonorBO();
            
    public FrmDonor() {
        initComponents();
        listarDonor();
        idMax();
    }
    
    public void listarDonor(){
        dbo.listarDonor(tbDonor);
    }
    
    public void idMax(){
        txtIdDonor.setText(String.valueOf(dbo.getMaxID()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoHeroe = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdDonor = new javax.swing.JTextField();
        txtNombresD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApodoD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCelularD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorreoD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDonor = new javax.swing.JTable();
        cbCategoriaHeroe = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        rdHeroeSi = new javax.swing.JRadioButton();
        rdHeroeNo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(785, 650));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(785, 650));
        jPanel1.setMinimumSize(new java.awt.Dimension(785, 650));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID Donador:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Héroe:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Apodo:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Celular:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Correo:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Categoría de Héroe:");

        tbDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDonorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDonor);

        cbCategoriaHeroe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Héroe 5", "Héroe 19", "Héroe 30", "Héroe 60", "Héroe 100", "Héroe (Otros)" }));
        cbCategoriaHeroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCategoriaHeroeActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(229, 107, 111));
        jPanel2.setForeground(new java.awt.Color(229, 107, 111));
        jPanel2.setPreferredSize(new java.awt.Dimension(229, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel6.setText("Formulario donador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(312, 312, 312)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btnEliminar.setBackground(new java.awt.Color(181, 101, 118));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(181, 101, 118));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(181, 101, 118));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(181, 101, 118));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        grupoHeroe.add(rdHeroeSi);
        rdHeroeSi.setText("Sí");
        rdHeroeSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHeroeSiActionPerformed(evt);
            }
        });

        grupoHeroe.add(rdHeroeNo);
        rdHeroeNo.setText("No");
        rdHeroeNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdHeroeNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCelularD, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(txtApodoD)
                                    .addComponent(txtNombresD)
                                    .addComponent(txtIdDonor))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(txtCorreoD, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbCategoriaHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(77, 77, 77)
                                        .addComponent(rdHeroeSi)
                                        .addGap(55, 55, 55)
                                        .addComponent(rdHeroeNo)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdDonor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombresD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rdHeroeSi)
                    .addComponent(rdHeroeNo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtApodoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbCategoriaHeroe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtCelularD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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

    private void cbCategoriaHeroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCategoriaHeroeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCategoriaHeroeActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(txtIdDonor.getText().isEmpty()||
                txtCorreoD.getText().isEmpty()||
                txtCelularD.getText().isEmpty()||
                (!rdHeroeSi.isSelected() && !rdHeroeNo.isSelected())){
            System.out.println("Error, ingrese datos");
        }else{
            String mensaje = dbo.eliminarDonor(Integer.parseInt(txtIdDonor.getText()));
            System.out.println(mensaje);
            limpiar();
            listarDonor();
        }    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(txtIdDonor.getText().isEmpty()||
                txtCorreoD.getText().isEmpty()||
                txtCelularD.getText().isEmpty()||
                (!rdHeroeSi.isSelected() && !rdHeroeNo.isSelected())){
            System.out.println("Error, ingrese datos");
        }else{
            String estado;
            String cat;
            if(rdHeroeSi.isSelected()){
                estado="Yes";
                if(cbCategoriaHeroe.getSelectedIndex()==0){
                    cat="Héroe 5";
                }else if(cbCategoriaHeroe.getSelectedIndex()==1){
                    cat="Héroe 19";
                }else if(cbCategoriaHeroe.getSelectedIndex()==2){
                    cat="Héroe 30";
                }else if(cbCategoriaHeroe.getSelectedIndex()==3){
                    cat="Héroe 60";
                }else if(cbCategoriaHeroe.getSelectedIndex()==4){
                    cat="Héroe 100";
                }else{
                    cat="Héroe (Otros)";
                }
                
            }else{
                estado="No";
                cat=null;
            }
            Donor don=new Donor();
            don.setIdDonor(Integer.parseInt(txtIdDonor.getText()));
            don.setNameDonor(txtNombresD.getText());
            don.setNicknameDonor(txtApodoD.getText());
            don.setMailContact(txtCorreoD.getText());
            don.setCellPhoneNumber(txtCelularD.getText());
            don.setHero(estado);
            don.setCategoryHero(cat);
            String mensaje = dbo.modificarDonor(don);
            System.out.println(mensaje);
            limpiar();
            listarDonor();
        }    
    }//GEN-LAST:event_btnModificarActionPerformed
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void rdHeroeSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHeroeSiActionPerformed
        cbCategoriaHeroe.setEnabled(true);
    }//GEN-LAST:event_rdHeroeSiActionPerformed

    private void rdHeroeNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdHeroeNoActionPerformed
        cbCategoriaHeroe.setEnabled(false);
    }//GEN-LAST:event_rdHeroeNoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(txtIdDonor.getText().isEmpty()||
                txtCorreoD.getText().isEmpty()||
                txtCelularD.getText().isEmpty()||
                (!rdHeroeSi.isSelected() && !rdHeroeNo.isSelected())){
            System.out.println("Error, ingrese datos");
        }else{
            String estado;
            String cat;
            if(rdHeroeSi.isSelected()){
                estado="Yes";
                if(cbCategoriaHeroe.getSelectedIndex()==0){
                    cat="Héroe 5";
                }else if(cbCategoriaHeroe.getSelectedIndex()==1){
                    cat="Héroe 19";
                }else if(cbCategoriaHeroe.getSelectedIndex()==2){
                    cat="Héroe 30";
                }else if(cbCategoriaHeroe.getSelectedIndex()==3){
                    cat="Héroe 60";
                }else if(cbCategoriaHeroe.getSelectedIndex()==4){
                    cat="Héroe 100";
                }else{
                    cat="Héroe (Otros)";
                }
                
            }else{
                estado="No";
                cat=null;
            }
            Donor don=new Donor();
            don.setIdDonor(Integer.parseInt(txtIdDonor.getText()));
            don.setNameDonor(txtNombresD.getText());
            don.setNicknameDonor(txtApodoD.getText());
            don.setMailContact(txtCorreoD.getText());
            don.setCellPhoneNumber(txtCelularD.getText());
            don.setHero(estado);
            don.setCategoryHero(cat);
            String mensaje = dbo.agregarDonor(don);
            System.out.println(mensaje);
            limpiar();
            listarDonor();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tbDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDonorMouseClicked
        int seleccion=tbDonor.rowAtPoint(evt.getPoint());
        txtIdDonor.setText(tbDonor.getValueAt(seleccion, 0)+"");
        txtNombresD.setText(tbDonor.getValueAt(seleccion, 1)+"");
        txtApodoD.setText(tbDonor.getValueAt(seleccion, 2)+"");
        txtCelularD.setText(tbDonor.getValueAt(seleccion, 4)+"");
        txtCorreoD.setText(tbDonor.getValueAt(seleccion, 3)+"");
        String estado=tbDonor.getValueAt(seleccion, 5)+"";
        if(estado.equals("Yes")){
            rdHeroeSi.setSelected(true);
        }else{
            rdHeroeNo.setSelected(true);
        }
        String categ=tbDonor.getValueAt(seleccion, 6)+"";
        if(categ.equals("Héroe 5")){
            cbCategoriaHeroe.setSelectedIndex(0);
        }else if(categ.equals("Héroe 19")){
            cbCategoriaHeroe.setSelectedIndex(1);
        }else if(categ.equals("Héroe 30")){
            cbCategoriaHeroe.setSelectedIndex(2);
        }else if(categ.equals("Héroe 60")){
            cbCategoriaHeroe.setSelectedIndex(3);
        }else if(categ.equals("Héroe 100")){
            cbCategoriaHeroe.setSelectedIndex(4);
        }else if(categ.equals("Héroe (Otros)")){
            cbCategoriaHeroe.setSelectedIndex(5);
        }else{
            cbCategoriaHeroe.setSelectedIndex(-1);
        }
    }//GEN-LAST:event_tbDonorMouseClicked

    
    public void limpiar(){
        txtIdDonor.setText("");
        txtNombresD.setText("");
        txtApodoD.setText("");
        txtCelularD.setText("");
        txtCorreoD.setText(""); 
        cbCategoriaHeroe.setSelectedIndex(0);
        grupoHeroe.clearSelection();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbCategoriaHeroe;
    private javax.swing.ButtonGroup grupoHeroe;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdHeroeNo;
    private javax.swing.JRadioButton rdHeroeSi;
    private javax.swing.JTable tbDonor;
    private javax.swing.JTextField txtApodoD;
    private javax.swing.JTextField txtCelularD;
    private javax.swing.JTextField txtCorreoD;
    private javax.swing.JTextField txtIdDonor;
    private javax.swing.JTextField txtNombresD;
    // End of variables declaration//GEN-END:variables
}
