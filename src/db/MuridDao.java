/*
 * Kelas ini merupakan bagian dari package 'db' dan berfungsi sebagai data access object (DAO) untuk entitas Murid.
 * Digunakan untuk berinteraksi dengan database terkait data murid.
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
 * Kelas MuridDao
 * 
 * Fungsi:
 * - Membuat, membaca, dan memperbarui informasi murid dalam database.
 */
public class MuridDao {

    // Objek DB untuk mengelola koneksi database
    private final DB db;

    // Objek Connection untuk koneksi ke database
    private final Connection conn;

    // Konstruktor untuk inisialisasi objek DB dan koneksi
    public MuridDao() {
        db = new DB();
        conn = db.getConnection();
    }

    /**
     * Membuat akun baru untuk murid dalam database.
     *
     * @param murid Objek Murid yang akan disimpan dalam database.
     * @return true jika pembuatan akun berhasil.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public boolean createAccount(Murid murid) throws SQLException {
        String sql = "INSERT INTO murid(nama, email, kata_sandi, notelp, asal_sekolah) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, murid.getNama());
        ps.setString(2, murid.getEmail());
        ps.setString(3, murid.getKataSandi());
        ps.setString(4, murid.getNoTelp());
        ps.setString(5, murid.getAsalSekolah());
        ps.execute();
        return true;
    }

    /**
     * Mengambil informasi akun murid dari database berdasarkan email dan kata sandi.
     *
     * @param email Email murid.
     * @param password Kata sandi murid.
     * @return Objek Murid jika ditemukan, atau null jika tidak ditemukan.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public Murid getAccount(String email, String password) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;

        ps = conn.prepareStatement("SELECT * FROM murid WHERE email=? AND kata_sandi=?");
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

    /**
     * Memeriksa apakah email murid sudah ada dalam database.
     *
     * @param email Email yang akan diperiksa.
     * @return true jika email sudah ada, false jika belum.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public boolean isEmailAlreadyExist(String email) throws SQLException {
        String sql = "SELECT * FROM murid WHERE email = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        return rs.next();
    }

    /**
     * Mengambil semua informasi akun murid dari database.
     *
     * @return List berisi objek Murid dari semua akun murid dalam database.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public List<Murid> getAllAccount() throws SQLException {
        String sql = "SELECT * FROM murid";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        List<Murid> list = new ArrayList<>();
        while (rs.next()) {
            Murid murid = new Murid();
            murid.setId(rs.getInt("id"));
            murid.setNama(rs.getString("nama"));
            murid.setEmail(rs.getString("email"));
            murid.setKataSandi(rs.getString("kata_sandi"));
            murid.setNoTelp(rs.getString("notelp"));
            murid.setAsalSekolah(rs.getString("asal_sekolah"));
            list.add(murid);
        }
        return list;
    }
}
