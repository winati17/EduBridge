/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.Murid;
import entity.Tutor;
import entity.Tutoring;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author winat
 */
public class TutoringDao {

    private final DB db;
    private final Connection conn;

    public TutoringDao() {
        db = new DB();
        conn = db.getConnection();
    }

    public List getTutoring(String id_murid) throws SQLException {
        String sql = "select murid.nama as nama_murid, tutor.nama as nama_tutor, tutoring.* from tutoring inner join tutor on tutor.id = tutoring.id_tutor inner join murid on murid.id = tutoring.id_murid where murid.id = ?";
        PreparedStatement ps;
        List<Tutoring> list = new ArrayList<>();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, id_murid);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Tutoring tutoring = new Tutoring();
                tutoring.setBiaya(rs.getInt("biaya"));
                tutoring.setId(rs.getInt("id"));
                tutoring.setJadwal(rs.getDate("jadwal"));
                tutoring.setJumlahSesi(rs.getInt("jumlah_sesi"));

                Murid murid = new Murid(rs.getInt("id_murid"), rs.getString("nama_murid"));
                tutoring.setMurid(murid);

                tutoring.setMatpelPilihan(rs.getString("matpel_pilihan"));

                Tutor tutor = new Tutor(rs.getInt("id_tutor"), rs.getString("nama_tutor"));
                tutoring.setTutor(tutor);

                list.add(tutoring);
            }
        } catch (SQLException ex) {
        }
        return list;
    }

    public void insert(Map<Integer, Tutoring> tutoringMap) {

        String sql = "insert into tutoring(id_murid, id_tutor, biaya, jadwal, jumlah_sesi, matpel_pilihan) values (?,?,?,?,?,?) ";
        PreparedStatement ps;
        for (Map.Entry<Integer, Tutoring> entry : tutoringMap.entrySet()) {
            Tutoring tutoring = entry.getValue();
            try {
                ps = conn.prepareStatement(sql);
                ps.setInt(1, tutoring.getMurid().getId());
                ps.setInt(2, tutoring.getTutor().getId());
                ps.setInt(3, tutoring.getBiaya());
                ps.setDate(4, (Date) tutoring.getJadwal());
                ps.setInt(5, tutoring.getJumlahSesi());
                ps.setString(6, tutoring.getMatpelPilihan());
                ps.execute();
            } catch (SQLException ex) {
            }
        }
    }
}