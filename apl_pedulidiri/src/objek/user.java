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
public class user implements Serializable{
    private String nik;
    private String nama;
    private String foto;

    public user() {
    }

    public user(String nik, String nama, String foto) {
        this.nik = nik;
        this.nama = nama;
        this.foto = foto;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}

