/*
 * Kelas ini merupakan bagian dari package 'db' dan berfungsi sebagai data access object (DAO) untuk entitas Tutor.
 * Digunakan untuk berinteraksi dengan database terkait data tutor.
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
 * Kelas TutorDao
 *
 * Fungsi:
 * - Membuat, membaca, dan memperbarui informasi tutor dalam database.
 */
public class TutorDao {

    // Objek DB untuk mengelola koneksi database
    private final DB db;

    // Objek Connection untuk koneksi ke database
    private final Connection conn;

    // Konstruktor untuk inisialisasi objek DB dan koneksi
    public TutorDao() {
        db = new DB();
        conn = db.getConnection();
    }

    /**
     * Membuat data tutor baru dalam database.
     *
     * @param tutor Objek Tutor yang akan disimpan dalam database.
     * @return true jika pembuatan tutor berhasil.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public boolean create(Tutor tutor) throws SQLException {
        String sql = "INSERT INTO tutor(nama, notelp, pekerjaan, tentang, hargaperjam, rating) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, tutor.getNama());
        ps.setString(2, tutor.getNoTelp());
        ps.setString(3, tutor.getPekerjaan());
        ps.setString(4, tutor.getTentang());
        ps.setInt(5, tutor.getHargaPerJam());
        ps.setFloat(6, tutor.getRating());
        ps.execute();

        return true;
    }

    /**
     * Mengambil informasi satu tutor dari database berdasarkan ID.
     *
     * @param id ID tutor yang akan dicari.
     * @return Objek Tutor jika ditemukan, atau null jika tidak ditemukan.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public Tutor getOneTutor(int id) throws SQLException {
        PreparedStatement ps;
        ResultSet rs;

        ps = conn.prepareStatement("SELECT * FROM `tutor` WHERE id=?");
        ps.setInt(1, id);
        rs = ps.executeQuery();

        if (!rs.next()) {
            return null;
        }

        Tutor tutor = new Tutor();

        tutor.setId(rs.getInt("id"));
        tutor.setNama(rs.getString("nama"));
        tutor.setNoTelp(rs.getString("notelp"));
        tutor.setPekerjaan(rs.getString("pekerjaan"));
        tutor.setTentang(rs.getString("tentang"));
        tutor.setRating(rs.getFloat("rating"));
        tutor.setHargaPerJam(rs.getInt("hargaperjam"));

        return tutor;
    }

    /**
     * Mengambil semua informasi tutor dari database.
     *
     * @return List berisi objek Tutor dari semua tutor dalam database.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public List<Tutor> getAllTutor() throws SQLException {
        String sql = "SELECT * FROM tutor";
        ResultSet rs = conn.createStatement().executeQuery(sql);
        List<Tutor> list = new ArrayList<>();
        while (rs.next()) {
            Tutor tutor = new Tutor();
            tutor.setId(rs.getInt("id"));
            tutor.setNama(rs.getString("nama"));
            tutor.setNoTelp(rs.getString("notelp"));
            tutor.setPekerjaan(rs.getString("pekerjaan"));
            tutor.setTentang(rs.getString("tentang"));
            tutor.setRating(rs.getFloat("rating"));
            tutor.setHargaPerJam(rs.getInt("hargaperjam"));
            list.add(tutor);
        }
        return list;
    }

}
