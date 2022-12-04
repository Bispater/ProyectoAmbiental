/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VistaMain;

import Usuarios.Usuario;

import javax.swing.*;

public class LoginUsuario extends javax.swing.JFrame {

    /**
     * Creates new form LoginUsuario
     */
    public LoginUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Borde = new javax.swing.JPanel();
        ExitButton = new javax.swing.JButton();
        TituloPrincipal = new javax.swing.JLabel();
        IngresarButton = new javax.swing.JButton();
        TextRut = new javax.swing.JLabel();
        FieldPass = new javax.swing.JTextField();
        FieldRUT = new javax.swing.JTextField();
        TextErrorRut = new javax.swing.JLabel();
        TextErrorPass = new javax.swing.JLabel();
        TextPass1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(201, 234, 253));
        Fondo.setMaximumSize(new java.awt.Dimension(440, 550));
        Fondo.setPreferredSize(new java.awt.Dimension(440, 550));

        Borde.setBackground(new java.awt.Color(76, 168, 207));

        ExitButton.setBackground(new java.awt.Color(76, 168, 207));
        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExitButton.setForeground(new java.awt.Color(255, 255, 255));
        ExitButton.setText("Regresar");
        ExitButton.setBorder(null);
        ExitButton.setBorderPainted(false);
        ExitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitButton.setMinimumSize(new java.awt.Dimension(78, 28));
        ExitButton.setPreferredSize(new java.awt.Dimension(78, 28));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BordeLayout = new javax.swing.GroupLayout(Borde);
        Borde.setLayout(BordeLayout);
        BordeLayout.setHorizontalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BordeLayout.createSequentialGroup()
                .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        BordeLayout.setVerticalGroup(
            BordeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TituloPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TituloPrincipal.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        TituloPrincipal.setForeground(new java.awt.Color(0, 0, 102));
        TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipal.setText("RecyPoint");
        TituloPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));

        IngresarButton.setBackground(new java.awt.Color(76, 168, 207));
        IngresarButton.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        IngresarButton.setForeground(new java.awt.Color(255, 255, 255));
        IngresarButton.setText("Ingresar");
        IngresarButton.setMaximumSize(new java.awt.Dimension(105, 40));
        IngresarButton.setPreferredSize(new java.awt.Dimension(105, 40));
        IngresarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarButtonActionPerformed(evt);
            }
        });

        TextRut.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextRut.setForeground(new java.awt.Color(76, 168, 207));
        TextRut.setText("RUT:");
        TextRut.setMaximumSize(new java.awt.Dimension(100, 40));
        TextRut.setPreferredSize(new java.awt.Dimension(100, 40));

        FieldPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldPass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldPass.setBorder(null);
        FieldPass.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldPass.setPreferredSize(new java.awt.Dimension(140, 35));

        FieldRUT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FieldRUT.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        FieldRUT.setBorder(null);
        FieldRUT.setMaximumSize(new java.awt.Dimension(140, 35));
        FieldRUT.setPreferredSize(new java.awt.Dimension(140, 35));
        FieldRUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldRUTActionPerformed(evt);
            }
        });

        TextErrorRut.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TextErrorRut.setForeground(new java.awt.Color(255, 0, 0));
        //TextErrorRut.setText("jLabel2");

        TextErrorPass.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        TextErrorPass.setForeground(new java.awt.Color(255, 0, 0));
        //TextErrorPass.setText("jLabel3");
        TextErrorPass.setMaximumSize(new java.awt.Dimension(37, 22));

        TextPass1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        TextPass1.setForeground(new java.awt.Color(76, 168, 207));
        TextPass1.setText("Contraseña:");
        TextPass1.setMaximumSize(new java.awt.Dimension(100, 40));
        TextPass1.setPreferredSize(new java.awt.Dimension(100, 40));

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Borde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextErrorPass, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(TextErrorRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TextPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FieldRUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(IngresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Borde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TituloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldRUT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextErrorRut, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(FondoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(TextPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextErrorPass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(IngresarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldRUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldRUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldRUTActionPerformed

    private void IngresarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarButtonActionPerformed
        if(ValidarCampos()){
            Usuario usuario = new Usuario();
            UsuarioFuncion usuarioInterface = new UsuarioFuncion();
            String rut = FieldRUT.getText();
            String contrasenia = FieldPass.getText();
            if(usuario.validarUsuario(rut, contrasenia)){
                usuarioInterface.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario ingresado no encontrado.");
            }
        }
    }

    public boolean ValidarCampos(){
        String rut = FieldRUT.getText();
        String contrasenia = FieldPass.getText();
        if(rut.length()==0||contrasenia.length()==0){
            JOptionPane.showMessageDialog(null, "Uno o más campos están vacíos.");
            return false;
        }
        if(!rut.matches("[0-9]*[-'][0-9]")){
            JOptionPane.showMessageDialog(null, "Debe escribir números con guión y dígito verificador");
            return false;
        }
        if(!contrasenia.matches("([a-zA-Z]*)")){
            JOptionPane.showMessageDialog(null, "El campo contraseña está incorrecto");
            return false;
        }
        return true;
    }

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        TiposUsuarios Regresar = new TiposUsuarios();
        Regresar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Borde;
    private javax.swing.JButton ExitButton;
    private javax.swing.JTextField FieldPass;
    private javax.swing.JTextField FieldRUT;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton IngresarButton;
    private javax.swing.JLabel TextErrorPass;
    private javax.swing.JLabel TextErrorRut;
    private javax.swing.JLabel TextPass1;
    private javax.swing.JLabel TextRut;
    private javax.swing.JLabel TituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
