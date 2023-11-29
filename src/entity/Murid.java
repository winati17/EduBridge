/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author winat
 */
public class Murid {

    private int id;
    private String nama;
    private String email;
    private String kata_sandi;
    private String asal_sekolah;
    private String notelp;

    public Murid() {
    }

    public Murid(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public Murid(int id, String nama, String email, String kata_sandi, String asal_sekolah, String notelp) {
        this.id = id;
        this.nama = nama;
        this.email = email;
        this.kata_sandi = kata_sandi;
        this.asal_sekolah = asal_sekolah;
        this.notelp = notelp;
    }

    // Getter and setter methods for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for 'nama'
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter and setter methods for 'email'
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and setter methods for 'kata_sandi'
    public String getKataSandi() {
        return kata_sandi;
    }

    public void setKataSandi(String kata_sandi) {
        this.kata_sandi = kata_sandi;
    }

    // Getter and setter methods for 'asal_sekolah'
    public String getAsalSekolah() {
        return asal_sekolah;
    }

    public void setAsalSekolah(String asal_sekolah) {
        this.asal_sekolah = asal_sekolah;
    }

    // Getter and setter methods for 'notelp'
    public String getNoTelp() {
        return notelp;
    }

    public void setNoTelp(String notelp) {
        this.notelp = notelp;
    }
}