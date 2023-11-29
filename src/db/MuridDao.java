/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import entity.Murid;
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
public class MuridDao {

    private final DB db;
    private final Connection conn;

    public MuridDao() {
        db = new DB();
        conn = db.getConnection();
    }

    public boolean createAccount(Murid murid) {
        String sql = "insert into murid(nama,email,kata_sandi,notelp,asal_sekolah) values (?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, murid.getNama());
            ps.setString(2, murid.getEmail());
            ps.setString(3, murid.getKataSandi());
            ps.setString(4, murid.getNoTelp());
            ps.setString(5, murid.getAsalSekolah());
            ps.execute();
        } catch (SQLException ex) {
        }
        return true;
    }

    public Murid getAccount(String email, String password) {
        PreparedStatement ps;
        ResultSet rs;
        System.out.println("masuk");

        try {
            ps = conn.prepareStatement("select * from murid where email=? and kata_sandi=?");
            ps.setString(1, email);
            ps.setString(2, password);
            rs = ps.executeQuery();
            System.out.println(rs);

            if (!rs.next()) {
                return null;
            }

            Murid murid = new Murid();

            murid.setId(rs.getInt("id"));
            murid.setNama(rs.getString("nama"));
            murid.setEmail(rs.getString("email"));
            murid.setKataSandi(rs.getString("kata_sandi"));
            murid.setNoTelp(rs.getString("notelp"));
            murid.setAsalSekolah(rs.getString("asal_sekolah"));
            System.out.println(rs);

            return murid;
        } catch (SQLException e1) {
        }
        return null;
    }

    public boolean isEmailAlreadyExist(String email) {
        String sql = "select * from murid where email = " + email;
        ResultSet rs;
        try {
            rs = conn.createStatement().executeQuery(sql);
            if (!rs.next()) {
                return false;
            }
        } catch (SQLException ex) {
        }
        return true;
    }

    public List getAllAccount() throws SQLException {
        String sql = "select * from murid";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        List<Murid> list = new ArrayList<>();
        while (rs.next()) {
            Murid murid = new Murid();
            murid.setId(rs.getInt("id"));
            murid.setNama(rs.getString("name"));
            murid.setEmail(rs.getString("email"));
            murid.setKataSandi(rs.getString("kata_sandi"));
            murid.setNoTelp(rs.getString("notelp"));
            murid.setAsalSekolah(rs.getString("asal_sekolah"));
            list.add(murid);
        }
        return list;
    }
}
