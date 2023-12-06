/*
 * Kelas ini merupakan bagian dari package 'db' dan berfungsi sebagai data access object (DAO) untuk entitas Tutoring.
 * Digunakan untuk berinteraksi dengan database terkait data tutoring.
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

/**
 * Kelas TutoringDao
 *
 * Fungsi:
 * - Membaca dan memasukkan informasi tutoring dalam database.
 */
public class TutoringDao {

    // Objek DB untuk mengelola koneksi database
    private final DB db;

    // Objek Connection untuk koneksi ke database
    private final Connection conn;

    // Konstruktor untuk inisialisasi objek DB dan koneksi
    public TutoringDao() {
        db = new DB();
        conn = db.getConnection();
    }

    /**
     * Mengambil daftar tutoring berdasarkan ID murid.
     *
     * @param id_murid ID murid yang akan dicari tutoring-nya.
     * @return List berisi objek Tutoring dari semua tutoring yang dimiliki oleh murid dengan ID tersebut.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public List getAllTutoring(int id_murid) throws SQLException {
        String sql = "SELECT murid.nama AS nama_murid, tutor.nama AS nama_tutor, tutoring.* FROM tutoring INNER JOIN tutor ON tutor.id = tutoring.id_tutor INNER JOIN murid ON murid.id = tutoring.id_murid WHERE murid.id = ?";
        PreparedStatement ps;
        List<Tutoring> list = new ArrayList<>();
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id_murid);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Tutoring tutoring = new Tutoring();
            tutoring.setBiaya(rs.getInt("biaya"));
            tutoring.setId(rs.getInt("id"));
            tutoring.setJadwal(rs.getDate("jadwal"));
            tutoring.setJam(rs.getInt("jam"));

            Murid murid = new Murid(rs.getInt("id_murid"), rs.getString("nama_murid"));
            tutoring.setMurid(murid);

            tutoring.setMatpelPilihan(rs.getString("matpel_pilihan"));

            Tutor tutor = new Tutor(rs.getInt("id_tutor"), rs.getString("nama_tutor"));
            tutoring.setTutor(tutor);

            list.add(tutoring);
        }
        return list;
    }

        public List getAllTutoringTutor(int id_tutor) throws SQLException {
        String sql = "SELECT murid.nama AS nama_murid, tutor.nama AS nama_tutor, tutoring.* FROM tutoring INNER JOIN tutor ON tutor.id = tutoring.id_tutor INNER JOIN murid ON murid.id = tutoring.id_murid WHERE tutor.id = ?";
        PreparedStatement ps;
        List<Tutoring> list = new ArrayList<>();
        ps = conn.prepareStatement(sql);
        ps.setInt(1, id_tutor);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Tutoring tutoring = new Tutoring();
            tutoring.setBiaya(rs.getInt("biaya"));
            tutoring.setId(rs.getInt("id"));
            tutoring.setJadwal(rs.getDate("jadwal"));
            tutoring.setJam(rs.getInt("jam"));

            Murid murid = new Murid(rs.getInt("id_murid"), rs.getString("nama_murid"));
            tutoring.setMurid(murid);

            tutoring.setMatpelPilihan(rs.getString("matpel_pilihan"));

            Tutor tutor = new Tutor(rs.getInt("id_tutor"), rs.getString("nama_tutor"));
            tutoring.setTutor(tutor);

            list.add(tutoring);
        }
        return list;
    }
        
    /**
     * Menyimpan informasi tutoring ke dalam database.
     *
     * @param tutoring Objek Tutoring yang akan disimpan dalam database.
     * @throws SQLException jika terjadi kesalahan SQL.
     */
    public void insert(Tutoring tutoring) throws SQLException {

        String sql = "INSERT INTO tutoring(id_murid, id_tutor, biaya, jadwal, jam, matpel_pilihan) VALUES (?,?,?,?,?,?) ";
        PreparedStatement ps;

        ps = conn.prepareStatement(sql);
        ps.setInt(1, tutoring.getMurid().getId());
        ps.setInt(2, tutoring.getTutor().getId());
        ps.setInt(3, tutoring.getBiaya());
        ps.setDate(4, new java.sql.Date(tutoring.getJadwal().getTime()));
        ps.setInt(5, tutoring.getJam());
        ps.setString(6, tutoring.getMatpelPilihan());
        ps.execute();
    }
}
