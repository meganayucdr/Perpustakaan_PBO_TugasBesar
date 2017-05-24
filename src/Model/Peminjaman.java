/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Megan
 */
public class Peminjaman {
    
    private int IDPeminjam, jumlah_pinjam, IDPeminjaman; 
    private Date tgl_pinjam, tgl_jatuh_tempo;
    private String nama;
    
    public Peminjaman()    {}

    public Peminjaman(int IDPeminjam, Date tgl_pinjam, Date tgl_jatuh_tempo, int jumlah_pinjam) {
        this.IDPeminjam = IDPeminjam;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_jatuh_tempo = tgl_jatuh_tempo;
        this.jumlah_pinjam = jumlah_pinjam;
    }
    
    public Peminjaman(int IDPeminjaman, String nama, int jumlah_pinjam, Date tgl_pinjam, Date tgl_jatuh_tempo) {
        this.IDPeminjaman = IDPeminjaman;
        this.jumlah_pinjam = jumlah_pinjam;
        this.nama = nama;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_jatuh_tempo = tgl_jatuh_tempo;
    }

    public int getIDPeminjaman() {
        return IDPeminjaman;
    }

    public String getNama() {
        return nama;
    }

    public int getIDPeminjam() {
        return IDPeminjam;
    }

    public int getJumlah_pinjam() {
        return jumlah_pinjam;
    }
    
    public Date getTgl_pinjam() {
        return tgl_pinjam;
    }

    public Date getTgl_jatuh_tempo() {
        return tgl_jatuh_tempo;
    }

    public void setJumlah_pinjam(int jumlah_pinjam) {
        this.jumlah_pinjam = jumlah_pinjam;
    }

    
    public void setIDPeminjam(int IDPeminjam) {
        this.IDPeminjam = IDPeminjam;
    }

    public void setTgl_pinjam(Date tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public void setTgl_jatuh_tempo(Date tgl_jatuh_tempo) {
        this.tgl_jatuh_tempo = tgl_jatuh_tempo;
    }

    public void setIDPeminjaman(int IDPeminjaman) {
        this.IDPeminjaman = IDPeminjaman;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
