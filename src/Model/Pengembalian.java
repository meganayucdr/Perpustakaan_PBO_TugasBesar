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
 * @author Viruz Ahaz
 */
public class Pengembalian {
    
    private int jml_kembali;
    private int id_peminjaman;
    private int id_pengembalian;
    private Date tgl_kembali;
    private int denda;
    private int keterlambatan;
    

    public Pengembalian() {
    }

    public Pengembalian(Date tgl_kembali, int denda, int keterlambatan, int jml_kembali, int id_peminjaman) {
        this.tgl_kembali = tgl_kembali;
        this.denda = denda;
        this.keterlambatan = keterlambatan;
        this.jml_kembali = jml_kembali;
        this.id_peminjaman = id_peminjaman;
    }

    public Pengembalian(int jml_kembali, int id_peminjaman, int id_pengembalian, Date tgl_kembali, int denda, int keterlambatan) {
        this.jml_kembali = jml_kembali;
        this.id_peminjaman = id_peminjaman;
        this.id_pengembalian = id_pengembalian;
        this.tgl_kembali = tgl_kembali;
        this.denda = denda;
        this.keterlambatan = keterlambatan;
    }

    public int getId_pengembalian() {
        return id_pengembalian;
    }

    public Date getTgl_kembali() {
        return tgl_kembali;
    }

    public int getId_peminjaman() {
        return id_peminjaman;
    }

    public void setId_peminjaman(int id_peminjaman) {
        this.id_peminjaman = id_peminjaman;
    }
   
    public void setTgl_kembali(Date tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }

    public int getDenda() {
        return denda;
    }

    public void setDenda(int denda) {
        this.denda = denda;
    }

    public int getKeterlambatan() {
        return keterlambatan;
    }

    public void setKeterlambatan(int keterlambatan) {
        this.keterlambatan = keterlambatan;
    }

    public int getJml_kembali() {
        return jml_kembali;
    }

    public void setJml_kembali(int jml_kembali) {
        this.jml_kembali = jml_kembali;
    }

    public void setId_pengembalian(int id_pengembalian) {
        this.id_pengembalian = id_pengembalian;
    }
    
    
}
