/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artemis.front;

import com.artemis.entities.Cuentausuario;
import com.artemis.entities.Persona;
import com.artemis.service.ServiceCuentaUsuario;
import com.artemis.service.ServicePersona;
import javax.swing.JOptionPane;
import com.artemis.util.AES;
import java.util.List;

/**
 *
 * @author david
 */
public class GUICrear extends javax.swing.JFrame {

    ServiceCuentaUsuario scu = new ServiceCuentaUsuario();
    ServicePersona sp = new ServicePersona();
    AES aes = new AES();

    public GUICrear() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nombreUsuarioTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        contraseñaField = new javax.swing.JPasswordField();
        crearCuenta = new javax.swing.JButton();
        retornarAnteriorMenu = new javax.swing.JButton();
        confirmacionField = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Engravers MT", 3, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear Usuario");

        nombreUsuarioTextField.setBackground(new java.awt.Color(51, 51, 51));
        nombreUsuarioTextField.setForeground(new java.awt.Color(255, 255, 255));
        nombreUsuarioTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresa el nombre de usuario");

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingrese la contraseña");

        contraseñaField.setBackground(new java.awt.Color(51, 51, 51));
        contraseñaField.setForeground(new java.awt.Color(255, 255, 255));
        contraseñaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaFieldActionPerformed(evt);
            }
        });

        crearCuenta.setBackground(new java.awt.Color(51, 255, 102));
        crearCuenta.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        crearCuenta.setForeground(new java.awt.Color(0, 0, 0));
        crearCuenta.setText("Crear");
        crearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaActionPerformed(evt);
            }
        });

        retornarAnteriorMenu.setBackground(new java.awt.Color(51, 255, 102));
        retornarAnteriorMenu.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        retornarAnteriorMenu.setForeground(new java.awt.Color(0, 0, 0));
        retornarAnteriorMenu.setText("Cancelar");
        retornarAnteriorMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarAnteriorMenuActionPerformed(evt);
            }
        });

        confirmacionField.setBackground(new java.awt.Color(51, 51, 51));
        confirmacionField.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingrese su nombre ");

        nombreTextField.setBackground(new java.awt.Color(51, 51, 51));
        nombreTextField.setForeground(new java.awt.Color(255, 255, 255));
        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Confirme la contraseña");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(contraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmacionField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(nombreUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(crearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(retornarAnteriorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contraseñaField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmacionField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(retornarAnteriorMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreUsuarioTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioTextFieldActionPerformed

    private void crearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaActionPerformed
        if (!(contraseñaField.getText().equals(confirmacionField.getText()))) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
            confirmacionField.setText("");
            contraseñaField.setText("");
        } else if (nombreTextField.getText().equals("") || contraseñaField.getText().equals("") || confirmacionField.getText().equals("")
                || nombreUsuarioTextField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe llenar todos los espacios", "Informacion", JOptionPane.WARNING_MESSAGE);
        } else {
            sp.crearNuevaPersona(nombreTextField.getText().trim());
            List<Persona> p = sp.buscarPersonaNombreIgual(nombreTextField.getText().trim());
            scu.crearNuevoCuentaUsuario(nombreUsuarioTextField.getText(), contraseñaField.getText(), p.get(0));
            JOptionPane.showMessageDialog(this, "Creación con exito", "Informacion", JOptionPane.INFORMATION_MESSAGE);
            nombreTextField.setText("");
            confirmacionField.setText("");
            contraseñaField.setText("");
            nombreUsuarioTextField.setText("");
        }
    }//GEN-LAST:event_crearCuentaActionPerformed

    private void contraseñaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaFieldActionPerformed

    private void retornarAnteriorMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarAnteriorMenuActionPerformed
        GUILogin gl = new GUILogin();
        this.setVisible(false);
        gl.setLocationRelativeTo(null);
        gl.setVisible(true);
    }//GEN-LAST:event_retornarAnteriorMenuActionPerformed

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUICrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUICrear gc = new GUICrear();
                gc.setVisible(true);
                gc.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmacionField;
    private javax.swing.JPasswordField contraseñaField;
    private javax.swing.JButton crearCuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField nombreUsuarioTextField;
    private javax.swing.JButton retornarAnteriorMenu;
    // End of variables declaration//GEN-END:variables
}
