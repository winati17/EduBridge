/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.util.Date; // Import Date class

/**
 *
 * @author winat
 */
public class Pembayaran {
    private int id;
    private int biaya;
    private Date tgl_pembayaran;

    // Getter and setter methods for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and setter methods for 'biaya'
    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    // Getter and setter methods for 'tgl_pembayaran'
    public Date getTglPembayaran() {
        return tgl_pembayaran;
    }

    public void setTglPembayaran(Date tgl_pembayaran) {
        this.tgl_pembayaran = tgl_pembayaran;
    }
}
