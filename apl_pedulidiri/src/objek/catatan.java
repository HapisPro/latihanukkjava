/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objek;

import java.io.Serializable;

/**
 *
 * @author Hafizh Ak
 */
public class catatan implements Serializable{
    private String tanggal;
    private String waktu;
    private String lokasi;
    int suhu_tubuh;

    public catatan() {
    }

    public catatan(String tanggal, String waktu, String lokasi, int suhu_tubuh) {
        this.tanggal = tanggal;
        this.waktu = waktu;
        this.lokasi = lokasi;
        this.suhu_tubuh = suhu_tubuh;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public int getSuhu_tubuh() {
        return suhu_tubuh;
    }

    public void setSuhu_tubuh(int suhu_tubuh) {
        this.suhu_tubuh = suhu_tubuh;
    }
}
