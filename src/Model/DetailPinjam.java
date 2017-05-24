/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Megan
 */
public class DetailPinjam {
    private int id_pinjam, id_buku;
    private String status, nama_peminjam, judul;
    private Date tgl_pinjam, tgl_jatuh_tempo;
    
    public DetailPinjam()   {}

    public DetailPinjam(String status, int id_buku, int id_pinjam) {
        this.id_pinjam = id_pinjam;
        this.id_buku = id_buku;
        this.status = status;
    }
    
    public DetailPinjam(String judul, Date tgl_pinjam, Date tgl_jatuh_tempo, String nama_peminjam, int id_buku)   {
        this.judul = judul;
        this.tgl_pinjam = tgl_pinjam;
        this.tgl_jatuh_tempo = tgl_jatuh_tempo; 
        this.nama_peminjam = nama_peminjam;
        this.id_buku = id_buku;
    }

    public String getNama_peminjam() {
        return nama_peminjam;
    }

    public String getJudul() {
        return judul;
    }

    public Date getTgl_pinjam() {
        return tgl_pinjam;
    }

    public Date getTgl_jatuh_tempo() {
        return tgl_jatuh_tempo;
    }

    public void setNama_peminjam(String nama_peminjam) {
        this.nama_peminjam = nama_peminjam;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setTgl_pinjam(Date tgl_pinjam) {
        this.tgl_pinjam = tgl_pinjam;
    }

    public void setTgl_jatuh_tempo(Date tgl_jatuh_tempo) {
        this.tgl_jatuh_tempo = tgl_jatuh_tempo;
    }

    public String getStatus() {
        return status;
    }

        public int getId_pinjam() {
        return id_pinjam;
    }

    public int getId_buku() {
        return id_buku;
    }

    public void setId_pinjam(int id_pinjam) {
        this.id_pinjam = id_pinjam;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 
}
