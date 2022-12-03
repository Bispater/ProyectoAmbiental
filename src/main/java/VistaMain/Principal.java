/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaMain;

public class Principal extends javax.swing.JFrame {
        
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        TituloPrincipal = new javax.swing.JLabel();
        Borde = new javax.swing.JPanel();
        Borde2 = new javax.swing.JPanel();
        AdminButton = new javax.swing.JButton();
        UsuarioButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(201, 234, 253));

        TituloPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TituloPrincipal.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        TituloPrincipal.setForeground(new java.awt.Color(0, 0, 102));
        TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipal.setText("RecyPoint");
        TituloPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));

        Borde.setBackground(new java.awt.Color(76, 168, 207));

        javax.swing.GroupLayout BordeLayout = new javax.swing.GroupLayout(Borde);
        Borde.setLayout(BordeLayout);
        BordeLayout.setHorizontalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BordeLayout.setVerticalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        Borde2.setBackground(new java.awt.Color(76, 168, 207));

        javax.swing.GroupLayout Borde2Layout = new javax.swing.GroupLayout(Borde2);
        Borde2.setLayout(Borde2Layout);
        Borde2Layout.setHorizontalGroup(
            Borde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Borde2Layout.setVerticalGroup(
            Borde2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        AdminButton.setBackground(new java.awt.Color(76, 168, 207));
        AdminButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminButton.setText("Administrador");
        AdminButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        AdminButton.setBorderPainted(false);
        AdminButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdminButton.setPreferredSize(new java.awt.Dimension(70, 50));
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        UsuarioButton.setBackground(new java.awt.Color(76, 168, 207));
        UsuarioButton.setForeground(new java.awt.Color(255, 255, 255));
        UsuarioButton.setText("Usuario");
        UsuarioButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        UsuarioButton.setBorderPainted(false);
        UsuarioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsuarioButton.setPreferredSize(new java.awt.Dimension(70, 50));
        UsuarioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
            .addComponent(Borde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Borde2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminButton, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(UsuarioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Borde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(AdminButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(UsuarioButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addComponent(Borde2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        VentanaAdmin admin =  new VentanaAdmin();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void UsuarioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioButtonActionPerformed
        TiposUsuarios usuarios = new TiposUsuarios();
        usuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_UsuarioButtonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JPanel Borde;
    private javax.swing.JPanel Borde2;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel TituloPrincipal;
    private javax.swing.JButton UsuarioButton;
    // End of variables declaration//GEN-END:variables
}

