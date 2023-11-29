/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author winat
 */
public class Tutor {

    private int id;
    private String nama;
    private String notelp;
    private String pekerjaan;
    private int hargaperjam;
    private float rating;
    private String tentang;

    public Tutor() {
    }

    public Tutor(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public Tutor(int id, String nama, String notelp, String pekerjaan, int hargaperjam, float rating, String tentang) {
        this.id = id;
        this.nama = nama;
        this.notelp = notelp;
        this.pekerjaan = pekerjaan;
        this.hargaperjam = hargaperjam;
        this.rating = rating;
        this.tentang = tentang;
    }

    public int getId() {
        return id; //??
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return notelp;
    }

    public void setNoTelp(String notelp) {
        this.notelp = notelp;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public int getHargaPerJam() {
        return hargaperjam;
    }

    public void setHargaPerJam(int hargaperjam) {
        this.hargaperjam = hargaperjam;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getTentang() {
        return tentang;
    }

    public void setTentang(String tentang) {
        this.tentang = tentang;
    }

}
