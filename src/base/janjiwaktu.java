/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

/**
 *
 * @author ASUS
 */
public class JanjiWaktu extends javax.swing.JFrame {

    /**
     * Creates new form janjiwaktu
     */
    public JanjiWaktu() {
        initComponents();
       txtTanggal.setBackground(new java.awt.Color(0,0,0,1));
       txtBulan.setBackground(new java.awt.Color(0,0,0,1));
       txtTahun.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_jam = new javax.swing.JTextField();
        tf_tanggal = new javax.swing.JTextField();
        l_tutor = new javax.swing.JLabel();
        btn_booknow = new javax.swing.JButton();
        bg_JanjiWaktu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_jam.setBackground(new java.awt.Color(39, 38, 44));
        tf_jam.setForeground(new java.awt.Color(255, 255, 255));
        tf_jam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_jam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_jamActionPerformed(evt);
            }
        });
        getContentPane().add(tf_jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 160, 20));

        tf_tanggal.setBackground(new java.awt.Color(39, 38, 44));
        tf_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        tf_tanggal.setText(" yyyy-mm-dd");
        tf_tanggal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tf_tanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_tanggalActionPerformed(evt);
            }
        });
        getContentPane().add(tf_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 160, 20));

        l_tutor.setBackground(new java.awt.Color(39, 38, 44));
        l_tutor.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(l_tutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 150, 20));

        btn_booknow.setBackground(new java.awt.Color(46, 47, 102));
        btn_booknow.setForeground(new java.awt.Color(255, 255, 255));
        btn_booknow.setText("Book Now");
        btn_booknow.setBorder(null);
        getContentPane().add(btn_booknow, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 160, 30));

        bg_JanjiWaktu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduBridge_asset/Janji waktu2.png"))); // NOI18N
        getContentPane().add(bg_JanjiWaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_jamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_jamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_jamActionPerformed

    private void tf_tanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_tanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_tanggalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_JanjiWaktu;
    private javax.swing.JButton btn_booknow;
    private javax.swing.JLabel l_tutor;
    private javax.swing.JTextField tf_jam;
    private javax.swing.JTextField tf_tanggal;
    // End of variables declaration//GEN-END:variables
}
