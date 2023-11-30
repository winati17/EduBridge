/*
 * Kelas ini merupakan bagian dari package 'entity' dan merepresentasikan entitas Murid.
 * Digunakan untuk menyimpan informasi mengenai murid.
 */
package entity;

/**
 * Kelas Murid
 *
 * Fungsi:
 * - Merepresentasikan data mengenai murid.
 * - Menyediakan getter dan setter untuk setiap atribut.
 */
public class Murid {

    // Atribut-atribut yang menyimpan informasi mengenai murid
    private int id;
    private String nama;
    private String email;
    private String kata_sandi;
    private String asal_sekolah;
    private String notelp;

    // Konstruktor default
    public Murid() {
    }

    // Konstruktor dengan parameter ID dan Nama
    public Murid(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Konstruktor dengan parameter lengkap
    public Murid(int id, String nama, String email, String kata_sandi, String asal_sekolah, String notelp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.kata_sandi = kata_sandi;
        this.asal_sekolah = asal_sekolah;
        this.notelp = notelp;
    }

    // Getter dan setter untuk 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter dan setter untuk 'nama'
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter dan setter untuk 'kata_sandi'
    public String getKataSandi() {
        return kata_sandi;
    }

    public void setKataSandi(String kata_sandi) {
        this.kata_sandi = kata_sandi;
    }

    // Getter dan setter untuk 'asal_sekolah'
    public String getAsalSekolah() {
        return asal_sekolah;
    }

    public void setAsalSekolah(String asal_sekolah) {
        this.asal_sekolah = asal_sekolah;
    }

    // Getter dan setter untuk 'notelp'
    public String getNoTelp() {
        return notelp;
    }

    public void setNoTelp(String notelp) {
        this.notelp = notelp;
    }
}
