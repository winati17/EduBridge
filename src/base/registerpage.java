/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

import db.MuridDao;
import entity.Murid;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class RegisterPage extends javax.swing.JFrame {

    private static javax.swing.JFrame frame;
    private MuridDao muridDao;

    /**
     * Creates new form RegisterPage
     */
    public RegisterPage() {
        initComponents();
        frame = this;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_email = new javax.swing.JTextField();
        tf_nohp = new javax.swing.JTextField();
        tf_sekolah = new javax.swing.JTextField();
        tf_nama = new javax.swing.JTextField();
        tf_password = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        bg_register = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_email.setBackground(new java.awt.Color(39, 38, 44));
        tf_email.setForeground(new java.awt.Color(255, 255, 255));
        tf_email.setText("Email");
        tf_email.setBorder(null);
        tf_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_emailActionPerformed(evt);
            }
        });
        getContentPane().add(tf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 236, 260, 20));

        tf_nohp.setBackground(new java.awt.Color(39, 38, 44));
        tf_nohp.setForeground(new java.awt.Color(255, 255, 255));
        tf_nohp.setText("No.HP");
        tf_nohp.setBorder(null);
        tf_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nohpActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 326, 260, 20));

        tf_sekolah.setBackground(new java.awt.Color(39, 38, 44));
        tf_sekolah.setForeground(new java.awt.Color(255, 255, 255));
        tf_sekolah.setText("Sekolah");
        tf_sekolah.setBorder(null);
        tf_sekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_sekolahActionPerformed(evt);
            }
        });
        getContentPane().add(tf_sekolah, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 296, 260, 20));

        tf_nama.setBackground(new java.awt.Color(39, 38, 44));
        tf_nama.setForeground(new java.awt.Color(255, 255, 255));
        tf_nama.setText("Nama");
        tf_nama.setBorder(null);
        tf_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_namaActionPerformed(evt);
            }
        });
        getContentPane().add(tf_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 206, 260, 20));

        tf_password.setBackground(new java.awt.Color(39, 38, 44));
        tf_password.setForeground(new java.awt.Color(255, 255, 255));
        tf_password.setText("Password");
        tf_password.setBorder(null);
        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 266, 270, 20));

        btn_register.setBackground(new java.awt.Color(64, 68, 237));
        btn_register.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_register.setForeground(new java.awt.Color(255, 255, 255));
        btn_register.setText("Register");
        btn_register.setBorder(null);
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });
        getContentPane().add(btn_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 290, 30));

        bg_register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduBridge_asset/Register.png"))); // NOI18N
        getContentPane().add(bg_register, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_emailActionPerformed

    private void tf_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nohpActionPerformed

    private void tf_sekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_sekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_sekolahActionPerformed

    private void tf_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_namaActionPerformed

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passwordActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        muridDao = new MuridDao();
        Murid murid = new Murid();
        murid.setNama(tf_nama.getText());
        murid.setEmail(tf_email.getText());
        murid.setKataSandi(String.valueOf(tf_password.getPassword()));
        murid.setNoTelp(tf_nohp.getText());
        murid.setAsalSekolah(tf_sekolah.getText());
        try {
            if (!judgeRegister(tf_email.getText(), String.valueOf(tf_password.getPassword()))) {
                return;
            }

            if (!muridDao.isEmailAlreadyExist(tf_email.getText())) {
                muridDao.createAccount(murid);
                frame.removeNotify();
                frame.dispose();
                new Login().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, " The account has existed!",
                        " The account has existed! ", JOptionPane.ERROR_MESSAGE);
                System.out.println("akdjada");
            }

        } catch (SQLException | ClassNotFoundException ex) {
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private boolean judgeRegister(String email, String password) throws SQLException, ClassNotFoundException {
        if (email.equals("")) {
            JOptionPane.showMessageDialog(null, " Email cannot be empty! ",
                    "Email", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if (password.equals("")) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty!",
                    "Password is empty", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_register;
    private javax.swing.JButton btn_register;
    private javax.swing.JTextField tf_email;
    private javax.swing.JTextField tf_nama;
    private javax.swing.JTextField tf_nohp;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_sekolah;
    // End of variables declaration//GEN-END:variables
}
