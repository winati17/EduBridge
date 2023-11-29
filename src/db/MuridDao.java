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

    public boolean createAccount(Murid murid) throws SQLException {
        String sql = "insert into murid(nama,email,kata_sandi,notelp,asal_sekolah) values (?,?,?,?,?)";
        PreparedStatement ps;
        ps = conn.prepareStatement(sql);
        ps.setString(1, murid.getNama());
        ps.setString(2, murid.getEmail());
        ps.setString(3, murid.getKataSandi());
        ps.setString(4, murid.getNoTelp());
        ps.setString(5, murid.getAsalSekolah());
        ps.execute();
        return true;
    }

    public Murid getAccount(String email, String password) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;

        ps = conn.prepareStatement("select * from murid where email=? and kata_sandi=?");
        ps.setString(1, email);
        ps.setString(2, password);
        rs = ps.executeQuery();

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

        return murid;
    }

    public boolean isEmailAlreadyExist(String email) throws SQLException {
        String sql = "select * from murid where email = " + email;
        ResultSet rs;
        rs = conn.createStatement().executeQuery(sql);
        return rs.next();
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
