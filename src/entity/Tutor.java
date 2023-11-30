/*
 * Kelas ini merupakan bagian dari package 'entity' dan merepresentasikan entitas Tutor.
 * Digunakan untuk menyimpan informasi mengenai tutor.
 */
package entity;

/**
 * Kelas Tutor
 *
 * Fungsi:
 * - Merepresentasikan data mengenai tutor.
 * - Menyediakan getter dan setter untuk setiap atribut.
 */
public class Tutor {

    // Atribut-atribut yang menyimpan informasi mengenai tutor
    private int id;
    private String nama;
    private String notelp;
    private String pekerjaan;
    private int hargaperjam;
    private float rating;
    private String tentang;

    // Konstruktor default
    public Tutor() {
    }

    // Konstruktor dengan parameter ID dan Nama
    public Tutor(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Konstruktor dengan parameter lengkap
    public Tutor(int id, String nama, String notelp, String pekerjaan, int hargaperjam, float rating, String tentang) {
        this.id = id;
        this.nama = nama;
        this.notelp = notelp;
        this.pekerjaan = pekerjaan;
        this.hargaperjam = hargaperjam;
        this.rating = rating;
        this.tentang = tentang;
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

    // Getter dan setter untuk 'notelp'
    public String getNoTelp() {
        return notelp;
    }

    public void setNoTelp(String notelp) {
        this.notelp = notelp;
    }

    // Getter dan setter untuk 'pekerjaan'
    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    // Getter dan setter untuk 'hargaperjam'
    public int getHargaPerJam() {
        return hargaperjam;
    }

    public void setHargaPerJam(int hargaperjam) {
        this.hargaperjam = hargaperjam;
    }

    // Getter dan setter untuk 'rating'
    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    // Getter dan setter untuk 'tentang'
    public String getTentang() {
        return tentang;
    }

    public void setTentang(String tentang) {
        this.tentang = tentang;
    }

}
