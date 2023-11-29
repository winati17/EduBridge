/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.Tutor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author winat
 */
public class TutorDao {

    private final DB db;
    private final Connection conn;

    public TutorDao() {
        db = new DB();
        conn = db.getConnection();
    }

    public boolean insert(Tutor tutor) {
        String sql = "insert into tutor(nama,notelp,pekerjaan,tentang,hargaperjam,rating) values (?,?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, tutor.getNama());
            ps.setString(2, tutor.getNoTelp());
            ps.setString(3, tutor.getPekerjaan());
            ps.setString(4, tutor.getTentang());
            ps.setInt(5, tutor.getHargaPerJam());
            ps.setFloat(6, tutor.getRating());
            ps.execute();
        } catch (SQLException ex) {
        }
        return true;
    }

    public List getAllTutor() throws SQLException {
        String sql = "select * from tutor";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        List<Tutor> list = new ArrayList<>();
        while (rs.next()) {
            Tutor tutor = new Tutor();
            tutor.setId(rs.getInt("id"));
            tutor.setNama(rs.getString("name"));
            tutor.setNoTelp(rs.getString("notelp"));
            tutor.setPekerjaan(rs.getString("pekerjaan"));
            tutor.setTentang(rs.getString("asal_sekolah"));
            tutor.setRating(rs.getFloat("rating"));
            tutor.setHargaPerJam(rs.getInt("hargaperjam"));
            list.add(tutor);
        }
        return list;
    }

}
