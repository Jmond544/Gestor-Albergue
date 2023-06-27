
package GUI;

import Database.OracleDatabaseConnector;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    // ATRIBUTOS
    
    private OracleDatabaseConnector oracleDatabaseConnector;
    
    // MÉTODOS
    
    public Login() {
        initComponents();
        textFieldUsuario.setBackground(new java.awt.Color(0,0,0,1));
        fieldPassword.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        textFieldUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        botonLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        imaBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(864, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(870, 590));

        jPanel1.setMinimumSize(new java.awt.Dimension(864, 559));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldUsuario.setBackground(new java.awt.Color(101, 98, 102));
        textFieldUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textFieldUsuario.setForeground(new java.awt.Color(204, 204, 204));
        textFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldUsuario.setText("User");
        textFieldUsuario.setBorder(null);
        textFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(textFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 220, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 220, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_user.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        fieldPassword.setBackground(new java.awt.Color(101, 98, 102));
        fieldPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        fieldPassword.setForeground(new java.awt.Color(204, 204, 204));
        fieldPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fieldPassword.setText("Password");
        fieldPassword.setBorder(null);
        jPanel1.add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 220, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 220, 10));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_password.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        botonLogin.setBackground(new java.awt.Color(0, 0, 0));
        botonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLoginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                botonLoginMouseReleased(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LOG IN");

        javax.swing.GroupLayout botonLoginLayout = new javax.swing.GroupLayout(botonLogin);
        botonLogin.setLayout(botonLoginLayout);
        botonLoginLayout.setHorizontalGroup(
            botonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonLoginLayout.setVerticalGroup(
            botonLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(botonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 260, 40));

        imaBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FondoLogin.png"))); // NOI18N
        imaBackground.setMinimumSize(new java.awt.Dimension(864, 600));
        jPanel1.add(imaBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginMouseClicked
        String username = textFieldUsuario.getText();
        String password = String.valueOf(fieldPassword.getPassword());
        
        oracleDatabaseConnector = new OracleDatabaseConnector(username, password);
        
        if(oracleDatabaseConnector.connect()){
            Dashboard dashBoard = new Dashboard();
            jPanel1.setVisible(false);
            dispose();
            dashBoard.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
                
    }//GEN-LAST:event_botonLoginMouseClicked

    private void botonLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginMousePressed
        botonLogin.setBackground(Color.decode("#222222"));
    }//GEN-LAST:event_botonLoginMousePressed

    private void botonLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLoginMouseReleased
        botonLogin.setBackground(Color.decode("#000000"));
    }//GEN-LAST:event_botonLoginMouseReleased

    private void textFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldUsuarioKeyTyped
        if(textFieldUsuario.getText().equals("User")){
            textFieldUsuario.setForeground(Color.decode("#FFFFFF"));
            textFieldUsuario.setText("");
            fieldPassword.setText("");
        }
    }//GEN-LAST:event_textFieldUsuarioKeyTyped

    public void showLogin() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botonLogin;
    private javax.swing.JPasswordField fieldPassword;
    private javax.swing.JLabel imaBackground;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField textFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
