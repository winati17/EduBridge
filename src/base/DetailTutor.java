/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

/**
 *
 * @author ASUS
 */
public class DetailTutor extends javax.swing.JFrame {

    /**
     * Creates new form janjipage2
     */
    public DetailTutor() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        btn_paynow = new javax.swing.JMenuItem();
        btn_bookaschedule = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        bg_detailtutor = new javax.swing.JLabel();

        btn_paynow.setText("jMenuItem1");
        btn_paynow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paynowActionPerformed(evt);
            }
        });
        jPopupMenu1.add(btn_paynow);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_bookaschedule.setBackground(new java.awt.Color(46, 47, 102));
        btn_bookaschedule.setForeground(new java.awt.Color(255, 255, 255));
        btn_bookaschedule.setText("Book A Schedule");
        btn_bookaschedule.setBorderPainted(false);
        btn_bookaschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookascheduleActionPerformed(evt);
            }
        });
        getContentPane().add(btn_bookaschedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 120, 40));

        btn_back.setBackground(new java.awt.Color(46, 47, 102));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.setBorderPainted(false);
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 120, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Detail Tutor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tarif");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 346, -1, 20));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nomor Telepon");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tentang");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nomor Telepon");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("00222");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 130, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nomor Telepon");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, 20));

        bg_detailtutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduBridge_asset/DetailTutor.png"))); // NOI18N
        bg_detailtutor.setText("jLabel1");
        getContentPane().add(bg_detailtutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonRectangle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonRectangle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMaterialButtonRectangle2ActionPerformed

    private void btn_bookascheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookascheduleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bookascheduleActionPerformed

    private void btn_paynowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paynowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paynowActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_detailtutor;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_bookaschedule;
    private javax.swing.JMenuItem btn_paynow;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}