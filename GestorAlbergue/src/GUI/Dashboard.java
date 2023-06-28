
package GUI;

import java.sql.Connection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class Dashboard extends javax.swing.JFrame {

    // Atributos
    private Connection conexion;
    private boolean estadoBotones[];
    private javax.swing.JPanel listaBotones[];
    private javax.swing.JPanel listaScreen[];
    
    // Métodos
    
    public Dashboard(Connection conexion) {
        this.conexion = conexion;
        estadoBotones = new boolean[6];
        initComponents();
        listaBotones = new JPanel[] {botonGeneral,botonCrud,botonInforme,botonCrearUsuario,botonAcercaDe,botonSalir};
        listaScreen = new JPanel[] {new ScreenGeneral(conexion),
            new ScreenCrudTables(conexion), new ScreenInformes(conexion),
            new ScreenCreateUser(conexion), new ScreenAcercaDe(conexion),
            new ScreenSalir(conexion)};
        pulsacionBoton(6);
        try {
            labelUserName.setText("Usuario: "+conexion.getMetaData().getUserName());
        } catch (SQLException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    private void pulsacionBoton(int n){
        for (int i = 0; i < 6; i++) {
            if(i==n){
                estadoBotones[i] = true;
                listaBotones[i].setBackground(Color.decode("#6D597A"));
            }
            else{
                estadoBotones[i] = false;
                listaBotones[i].setBackground(Color.decode("#355070"));
            }
        }
    }
    
    private void botonEntered(int i){
        if (!estadoBotones[i])
            listaBotones[i].setBackground(Color.decode("#6D597A"));
    }
    
    private void botonExited(int i){
        if (!estadoBotones[i])
            listaBotones[i].setBackground(Color.decode("#355070"));
    }

    private void showPanel(JPanel p){
        p.setSize(789,700);
        p.setLocation(0, 0);
        principalPanel.removeAll();
        principalPanel.add(p, BorderLayout.CENTER);
        principalPanel.revalidate();
        principalPanel.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        principalPanel = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        botonGeneral = new javax.swing.JPanel();
        labelDashboard = new javax.swing.JLabel();
        botonCrud = new javax.swing.JPanel();
        labelRegistrar = new javax.swing.JLabel();
        botonInforme = new javax.swing.JPanel();
        labelConsultarCli = new javax.swing.JLabel();
        botonCrearUsuario = new javax.swing.JPanel();
        labelConsultarRut = new javax.swing.JLabel();
        botonAcercaDe = new javax.swing.JPanel();
        labelEstadisticas = new javax.swing.JLabel();
        botonSalir = new javax.swing.JPanel();
        labelSalir = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        labelUserName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1024, 650));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1024, 700));
        background.setName(""); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(1024, 700));

        principalPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 789, Short.MAX_VALUE)
        );
        principalPanelLayout.setVerticalGroup(
            principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelMenu.setBackground(new java.awt.Color(53, 80, 112));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo_albergue.png"))); // NOI18N

        botonGeneral.setBackground(new java.awt.Color(53, 80, 112));
        botonGeneral.setForeground(new java.awt.Color(0, 24, 72));
        botonGeneral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGeneralMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonGeneralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonGeneralMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonGeneralMousePressed(evt);
            }
        });

        labelDashboard.setBackground(new java.awt.Color(0, 24, 72));
        labelDashboard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDashboard.setForeground(new java.awt.Color(255, 255, 255));
        labelDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_general.png"))); // NOI18N
        labelDashboard.setText("    General");

        javax.swing.GroupLayout botonGeneralLayout = new javax.swing.GroupLayout(botonGeneral);
        botonGeneral.setLayout(botonGeneralLayout);
        botonGeneralLayout.setHorizontalGroup(
            botonGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botonGeneralLayout.setVerticalGroup(
            botonGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonGeneralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botonCrud.setBackground(new java.awt.Color(53, 80, 112));
        botonCrud.setForeground(new java.awt.Color(0, 24, 72));
        botonCrud.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrudMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCrudMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrudMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCrudMousePressed(evt);
            }
        });

        labelRegistrar.setBackground(new java.awt.Color(0, 24, 72));
        labelRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        labelRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_table.png"))); // NOI18N
        labelRegistrar.setText("    CRUD tablas");

        javax.swing.GroupLayout botonCrudLayout = new javax.swing.GroupLayout(botonCrud);
        botonCrud.setLayout(botonCrudLayout);
        botonCrudLayout.setHorizontalGroup(
            botonCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRegistrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botonCrudLayout.setVerticalGroup(
            botonCrudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        botonInforme.setBackground(new java.awt.Color(53, 80, 112));
        botonInforme.setForeground(new java.awt.Color(0, 24, 72));
        botonInforme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonInformeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonInformeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonInformeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonInformeMousePressed(evt);
            }
        });

        labelConsultarCli.setBackground(new java.awt.Color(0, 24, 72));
        labelConsultarCli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelConsultarCli.setForeground(new java.awt.Color(255, 255, 255));
        labelConsultarCli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsultarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_informe_orange.png"))); // NOI18N
        labelConsultarCli.setText("    Informe");

        javax.swing.GroupLayout botonInformeLayout = new javax.swing.GroupLayout(botonInforme);
        botonInforme.setLayout(botonInformeLayout);
        botonInformeLayout.setHorizontalGroup(
            botonInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelConsultarCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botonInformeLayout.setVerticalGroup(
            botonInformeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelConsultarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        botonCrearUsuario.setBackground(new java.awt.Color(53, 80, 112));
        botonCrearUsuario.setForeground(new java.awt.Color(0, 24, 72));
        botonCrearUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonCrearUsuarioMousePressed(evt);
            }
        });

        labelConsultarRut.setBackground(new java.awt.Color(0, 24, 72));
        labelConsultarRut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelConsultarRut.setForeground(new java.awt.Color(255, 255, 255));
        labelConsultarRut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelConsultarRut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_user_orange.png"))); // NOI18N
        labelConsultarRut.setText("    Crear usuario");

        javax.swing.GroupLayout botonCrearUsuarioLayout = new javax.swing.GroupLayout(botonCrearUsuario);
        botonCrearUsuario.setLayout(botonCrearUsuarioLayout);
        botonCrearUsuarioLayout.setHorizontalGroup(
            botonCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelConsultarRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botonCrearUsuarioLayout.setVerticalGroup(
            botonCrearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelConsultarRut, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        botonAcercaDe.setBackground(new java.awt.Color(53, 80, 112));
        botonAcercaDe.setForeground(new java.awt.Color(0, 24, 72));
        botonAcercaDe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAcercaDeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonAcercaDeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonAcercaDeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonAcercaDeMousePressed(evt);
            }
        });

        labelEstadisticas.setBackground(new java.awt.Color(0, 24, 72));
        labelEstadisticas.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelEstadisticas.setForeground(new java.awt.Color(255, 255, 255));
        labelEstadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_acercaDe.png"))); // NOI18N
        labelEstadisticas.setText("    Acerca de");

        javax.swing.GroupLayout botonAcercaDeLayout = new javax.swing.GroupLayout(botonAcercaDe);
        botonAcercaDe.setLayout(botonAcercaDeLayout);
        botonAcercaDeLayout.setHorizontalGroup(
            botonAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEstadisticas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botonAcercaDeLayout.setVerticalGroup(
            botonAcercaDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelEstadisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        botonSalir.setBackground(new java.awt.Color(53, 80, 112));
        botonSalir.setForeground(new java.awt.Color(0, 24, 72));
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonSalirMousePressed(evt);
            }
        });

        labelSalir.setBackground(new java.awt.Color(0, 24, 72));
        labelSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSalir.setForeground(new java.awt.Color(255, 255, 255));
        labelSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icon_logout.png"))); // NOI18N
        labelSalir.setText("    Salir");

        javax.swing.GroupLayout botonSalirLayout = new javax.swing.GroupLayout(botonSalir);
        botonSalir.setLayout(botonSalirLayout);
        botonSalirLayout.setHorizontalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        botonSalirLayout.setVerticalGroup(
            botonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jSeparator1.setBackground(new java.awt.Color(229, 107, 111));
        jSeparator1.setForeground(new java.awt.Color(229, 107, 111));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSPIRA");

        labelUserName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelUserName.setForeground(new java.awt.Color(204, 204, 204));
        labelUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserName.setText("Usuario: Default");

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            .addComponent(botonGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonCrud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonInforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonAcercaDe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                    .addComponent(labelUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUserName)
                .addGap(28, 28, 28)
                .addComponent(botonGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonInforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonCrearUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAcercaDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(principalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonGeneralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGeneralMouseEntered
        botonEntered(0);
    }//GEN-LAST:event_botonGeneralMouseEntered

    private void botonGeneralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGeneralMouseExited
        botonExited(0);
    }//GEN-LAST:event_botonGeneralMouseExited

    private void botonCrudMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrudMouseEntered
        botonEntered(1);
    }//GEN-LAST:event_botonCrudMouseEntered

    private void botonCrudMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrudMouseExited
        botonExited(1);
    }//GEN-LAST:event_botonCrudMouseExited

    private void botonInformeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInformeMouseEntered
        botonEntered(2);
    }//GEN-LAST:event_botonInformeMouseEntered

    private void botonInformeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInformeMouseExited
        botonExited(2);
    }//GEN-LAST:event_botonInformeMouseExited

    private void botonAcercaDeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcercaDeMouseEntered
        botonEntered(4);
    }//GEN-LAST:event_botonAcercaDeMouseEntered

    private void botonAcercaDeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcercaDeMouseExited
        botonExited(4);
    }//GEN-LAST:event_botonAcercaDeMouseExited

    private void botonSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseEntered
        botonEntered(5);
    }//GEN-LAST:event_botonSalirMouseEntered

    private void botonSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseExited
        botonExited(5);
    }//GEN-LAST:event_botonSalirMouseExited

    private void botonGeneralMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGeneralMousePressed
        pulsacionBoton(0);
    }//GEN-LAST:event_botonGeneralMousePressed

    private void botonCrudMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrudMousePressed
        pulsacionBoton(1);
    }//GEN-LAST:event_botonCrudMousePressed

    private void botonInformeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInformeMousePressed
        pulsacionBoton(2);
    }//GEN-LAST:event_botonInformeMousePressed

    private void botonAcercaDeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcercaDeMousePressed
        pulsacionBoton(4);
    }//GEN-LAST:event_botonAcercaDeMousePressed

    private void botonSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMousePressed
        pulsacionBoton(5);
    }//GEN-LAST:event_botonSalirMousePressed

    private void botonCrearUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMousePressed
        pulsacionBoton(3);
    }//GEN-LAST:event_botonCrearUsuarioMousePressed

    private void botonCrearUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMouseExited
        botonExited(3);
    }//GEN-LAST:event_botonCrearUsuarioMouseExited

    private void botonCrearUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMouseEntered
        botonEntered(3);
    }//GEN-LAST:event_botonCrearUsuarioMouseEntered

    private void botonGeneralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGeneralMouseClicked
        showPanel(listaScreen[0]);
    }//GEN-LAST:event_botonGeneralMouseClicked

    private void botonCrudMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrudMouseClicked
        showPanel(listaScreen[1]);
    }//GEN-LAST:event_botonCrudMouseClicked

    private void botonInformeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonInformeMouseClicked
        showPanel(listaScreen[2]);
    }//GEN-LAST:event_botonInformeMouseClicked

    private void botonCrearUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCrearUsuarioMouseClicked
        showPanel(listaScreen[3]);
    }//GEN-LAST:event_botonCrearUsuarioMouseClicked

    private void botonAcercaDeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAcercaDeMouseClicked
        showPanel(listaScreen[4]);
    }//GEN-LAST:event_botonAcercaDeMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        showPanel(listaScreen[5]);
    }//GEN-LAST:event_botonSalirMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel botonAcercaDe;
    private javax.swing.JPanel botonCrearUsuario;
    private javax.swing.JPanel botonCrud;
    private javax.swing.JPanel botonGeneral;
    private javax.swing.JPanel botonInforme;
    private javax.swing.JPanel botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelConsultarCli;
    private javax.swing.JLabel labelConsultarRut;
    private javax.swing.JLabel labelDashboard;
    private javax.swing.JLabel labelEstadisticas;
    private javax.swing.JLabel labelRegistrar;
    private javax.swing.JLabel labelSalir;
    private javax.swing.JLabel labelUserName;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel principalPanel;
    // End of variables declaration//GEN-END:variables
}
