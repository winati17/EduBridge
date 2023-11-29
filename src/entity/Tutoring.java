/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.Date;
/**
 *
 * @author winat
 */
public class Tutoring {
    private int id;
    private String matpel_pilihan;
    private int id_murid;
    private int id_tutor;
    private int jumlah_sesi;
    private Date jadwal;

    // Getter and setter methods for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for 'matpel_pilihan'
    public String getMatpelPilihan() {
        return matpel_pilihan;
    }

    public void setMatpelPilihan(String matpel_pilihan) {
        this.matpel_pilihan = matpel_pilihan;
    }

    // Getter and setter methods for 'id_murid'
    public int getIdMurid() {
        return id_murid;
    }

    public void setIdMurid(int id_murid) {
        this.id_murid = id_murid;
    }

    // Getter and setter methods for 'id_tutor'
    public int getIdTutor() {
        return id_tutor;
    }

    public void setIdTutor(int id_tutor) {
        this.id_tutor = id_tutor;
    }

    // Getter and setter methods for 'jumlah_sesi'
    public int getJumlahSesi() {
        return jumlah_sesi;
    }

    public void setJumlahSesi(int jumlah_sesi) {
        this.jumlah_sesi = jumlah_sesi;
    }

    // Getter and setter methods for 'jadwal'
    public Date getJadwal() {
        return jadwal;
    }

    public void setJadwal(Date jadwal) {
        this.jadwal = jadwal;
    }
}
