/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package base;

import db.DB;
import db.TutorDao;
import db.TutoringDao;
import entity.Murid;
import entity.Tutoring;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author winat
 */
public class Riwayat extends javax.swing.JFrame {

    private Murid murid;
    private List<Tutoring> tutoringList;
    private TutoringDao tutoringDao;
    private static javax.swing.JFrame frame;
    private int id;
   

    public Riwayat() {
        initComponents();
        frame = this;
    }

    public Riwayat(Murid murid) {
        this();
        try {
            this.murid = murid;
            nama.setText(murid.getNama() );
            
            DefaultTableModel model = new DefaultTableModel();

            tutoringDao = new TutoringDao();
            tutoringList = tutoringDao.getAllTutoring(murid.getId());

            for (java.lang.reflect.Field field : Tutoring.class.getDeclaredFields()) {
                model.addColumn(field.getName());
            }

            for (Tutoring tutoring : tutoringList) {
                model.addRow(new Object[]{
                    tutoring.getId(),
                    tutoring.getMatpelPilihan(),
                    tutoring.getMurid().getNama(),
                    tutoring.getTutor().getNama(),
                    tutoring.getJam(),
                    tutoring.getJadwal(),
                    tutoring.getBiaya(),
                    tutoring.getTerlaksana()
                });
            }

            jTable1.setModel(model);

        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        riwayat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();
        riwayatpemesanan = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        btn_update = new javax.swing.JButton();
        tf_id = new javax.swing.JTextField();
        riwayatpemesanan1 = new javax.swing.JLabel();
        bg_riwayat = new javax.swing.JLabel();

        riwayat.setBackground(new java.awt.Color(85, 85, 85));
        riwayat.setColumns(20);
        riwayat.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        riwayat.setForeground(new java.awt.Color(255, 255, 255));
        riwayat.setRows(5);
        riwayat.setBorder(null);
        riwayat.setOpaque(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btn_back.setBackground(new java.awt.Color(79, 80, 131));
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        riwayatpemesanan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        riwayatpemesanan.setForeground(new java.awt.Color(255, 255, 255));
        riwayatpemesanan.setText("Riwayat Pemesanan");

        nama.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nama.setForeground(new java.awt.Color(255, 255, 255));
        nama.setText("Nama");

        btn_update.setBackground(new java.awt.Color(79, 80, 131));
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update Status");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        tf_id.setBackground(new java.awt.Color(39, 38, 44));
        tf_id.setForeground(new java.awt.Color(255, 255, 255));
        tf_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_idActionPerformed(evt);
            }
        });

        riwayatpemesanan1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        riwayatpemesanan1.setForeground(new java.awt.Color(255, 255, 255));
        riwayatpemesanan1.setText("Id tutoring yg terlaksana:");

        bg_riwayat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduBridge_asset/RiwayatPemesanan.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(riwayatpemesanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(235, 235, 235)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(riwayatpemesanan)
                            .addGap(419, 419, 419)
                            .addComponent(nama)
                            .addGap(115, 115, 115))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(105, 105, 105))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(322, 322, 322)))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_riwayat)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(372, Short.MAX_VALUE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(392, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riwayatpemesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(riwayatpemesanan1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(bg_riwayat)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(482, Short.MAX_VALUE)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(26, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        frame.dispose();
        new Homepage(murid).setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            // TODO add your handling code here:

        id = Integer.parseInt(tf_id.getText());
        tutoringDao.id(id);

        } catch (SQLException ex) {
            Logger.getLogger(Riwayat.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Icon icon = new javax.swing.ImageIcon(getClass().getResource("/EduBridge_asset/tick_icon_resized.png"));
        JOptionPane.showMessageDialog(null, 
                    "Asik!\n"
                    + "Kamu telah menyelesaikan tutoring\n"
                    + "Tetap semangat dalam meraih mimpi!", 
                    "Tutoring selesai", JOptionPane.INFORMATION_MESSAGE, icon);
            frame.dispose();
        new Homepage(murid).setVisible(true);
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tf_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_idActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_riwayat;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_update;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nama;
    private javax.swing.JTextArea riwayat;
    private javax.swing.JLabel riwayatpemesanan;
    private javax.swing.JLabel riwayatpemesanan1;
    private javax.swing.JTextField tf_id;
    // End of variables declaration//GEN-END:variables
}
