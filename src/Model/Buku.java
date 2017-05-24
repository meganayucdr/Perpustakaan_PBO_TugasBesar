/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Viruz Ahaz
 */
public class Buku {
    private int stok, tahun_terbit, id_buku;
    private String nama_kategori, judul, pengarang, penerbit; 
    
    public Buku()   {}

    public Buku(String nama_kategori, int stok, String judul, String pengarang, String penerbit, int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
        this.nama_kategori = nama_kategori;
        this.stok = stok;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }
    
    public Buku(int id_buku, String nama_kategori, int stok, String judul, String pengarang, String penerbit, int tahun_terbit) {
        this.id_buku = id_buku;
        this.tahun_terbit = tahun_terbit;
        this.nama_kategori = nama_kategori;
        this.stok = stok;
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    public int getId_buku() {
        return id_buku;
    }
    
    public int getTahun_terbit() {
        return tahun_terbit;
    }
    
    public String getNama_kategori() {
        return nama_kategori;
    }

    public int getStok() {
        return stok;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setTahun_terbit(int tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public void setId_buku(int id_buku) {
        this.id_buku = id_buku;
    }
    
    
}
