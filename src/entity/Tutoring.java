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
    private Murid murid;
    private Tutor tutor;
    private int jam;
    private Date jadwal;
    private int biaya;

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
    public Murid getMurid() {
        return murid;
    }

    public void setMurid(Murid murid) {
        this.murid = murid;
    }

    // Getter and setter methods for 'id_tutor'
    public Tutor getTutor() {
        return this.tutor;
    }

    public void setTutor(Tutor nama_tutor) {
        this.tutor = nama_tutor;
    }

    // Getter and setter methods for 'jumlah_sesi'
    public int getJam() {
        return jam;
    }

    public void setJam(int jumlah_sesi) {
        this.jam = jumlah_sesi;
    }

    // Getter and setter methods for 'jadwal'
    public Date getJadwal() {
        return jadwal;
    }

    public void setJadwal(Date jadwal) {
        this.jadwal = jadwal;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
}
