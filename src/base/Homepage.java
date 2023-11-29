/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

import entity.Murid;

/**
 *
 * @author ASUS
 */
public class Homepage extends javax.swing.JFrame {

    private static javax.swing.JFrame frame;
    private Murid murid;

    public Homepage() {
        initComponents();
        frame = this;
    }

    public Homepage(Murid murid) {
        this();
        this.murid = murid;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_booknow = new javax.swing.JButton();
        home = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jembatan = new javax.swing.JTextArea();
        bg_homepage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_booknow.setBackground(new java.awt.Color(46, 47, 102));
        btn_booknow.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn_booknow.setForeground(new java.awt.Color(255, 255, 255));
        btn_booknow.setText("Book Now");
        btn_booknow.setBorder(null);
        btn_booknow.setBorderPainted(false);
        btn_booknow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_booknow.setFocusPainted(false);
        btn_booknow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_booknowActionPerformed(evt);
            }
        });
        getContentPane().add(btn_booknow, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 100, 40));

        home.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setToolTipText("");
        getContentPane().add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setFocusable(false);

        jembatan.setEditable(false);
        jembatan.setBackground(new java.awt.Color(39, 38, 44));
        jembatan.setColumns(20);
        jembatan.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jembatan.setForeground(new java.awt.Color(255, 255, 255));
        jembatan.setLineWrap(true);
        jembatan.setRows(5);
        jembatan.setText("  Jembatan \n  Untuk \n  Membangun \n  Masa Depan");
        jembatan.setBorder(null);
        jembatan.setFocusable(false);
        jScrollPane1.setViewportView(jembatan);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 260, 290));

        bg_homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduBridge_asset/HomePage.png"))); // NOI18N
        bg_homepage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(bg_homepage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 870, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_booknowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_booknowActionPerformed
        // TODO add your handling code here:
        frame.dispose();
        new PilihMapelTutorPage().setVisible(true);
    }//GEN-LAST:event_btn_booknowActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_homepage;
    private javax.swing.JButton btn_booknow;
    private javax.swing.JLabel home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jembatan;
    // End of variables declaration//GEN-END:variables
}
