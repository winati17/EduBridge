/*
 * Kelas ini merupakan bagian dari package 'entity' dan merepresentasikan entitas Tutoring.
 * Digunakan untuk menyimpan informasi mengenai sesi tutoring antara murid dan tutor.
 */
package entity;

import java.util.Date;

/**
 * Kelas Tutoring
 *
 * Fungsi:
 * - Merepresentasikan data mengenai sesi tutoring antara murid dan tutor.
 * - Menyediakan getter dan setter untuk setiap atribut.
 */
public class Tutoring {

    // Atribut-atribut yang menyimpan informasi mengenai sesi tutoring
    private int id;
    private String matpel_pilihan;
    private Murid murid;
    private Tutor tutor;
    private int jam;
    private Date jadwal;
    private int biaya;
    private boolean terlaksana;

    // Getter dan setter untuk 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan setter untuk 'matpel_pilihan'
    public String getMatpelPilihan() {
        return matpel_pilihan;
    }

    public void setMatpelPilihan(String matpel_pilihan) {
        this.matpel_pilihan = matpel_pilihan;
    }

    // Getter dan setter untuk 'murid'
    public Murid getMurid() {
        return murid;
    }

    public void setMurid(Murid murid) {
        this.murid = murid;
    }

    // Getter dan setter untuk 'tutor'
    public Tutor getTutor() {
        return this.tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    // Getter dan setter untuk 'jam'
    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    // Getter dan setter untuk 'jadwal'
    public Date getJadwal() {
        return jadwal;
    }

    public void setJadwal(Date jadwal) {
        this.jadwal = jadwal;
    }

    // Getter dan setter untuk 'biaya'
    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
}
