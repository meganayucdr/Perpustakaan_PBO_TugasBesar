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
public class Peminjam {
    
    private String nama;
    private int id_peminjam;

    public Peminjam() {
    }

    public Peminjam(String nama) {
        this.nama = nama;
    }
    
    public Peminjam(int id_peminjam, String nama)  {
        this.nama = nama;
        this.id_peminjam = id_peminjam;
    }

    public int getId_peminjam() {
        return id_peminjam;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setId_peminjam(int id_peminjam) {
        this.id_peminjam = id_peminjam;
    }
}
