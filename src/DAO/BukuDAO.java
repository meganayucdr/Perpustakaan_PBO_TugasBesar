/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import Model.Buku;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Megan
 */
public class BukuDAO {
    public static Connection CON;
    public static final String url = "jdbc:ucanaccess://";
    public static final String path = "D:" + File.separator + "DBPerpus.accdb";
    
    public void makeConnection() 
    {
        System.out.println("Opening Database...");
        try {
            CON = DriverManager.getConnection(url + path);
            System.out.println("Success!\n");
        } catch (Exception Ex) {
            System.out.println("Error opening the database...");
            System.out.println(Ex);
        }
    }
    
    public void closeConnection () {
        System.out.println("Closing database...");
        try {
            CON.close();
            System.out.println("Success!\n");
        } catch (Exception Ex) {
            System.out.println("Error Closing the database...");
            System.out.println(Ex);
        }
    }
    
    public void insertBuku(Buku B)  {
        String sql = "INSERT INTO Tbl_Buku(nama_kategori, stock, judul, pengarang, penerbit, tahun_terbit) VALUES('" + B.getNama_kategori()+"' , '"+ B.getStok()+"', '"+B.getJudul()+"' , '"+B.getPengarang()+"' , '"+ B.getPengarang() +"' , '"+B.getTahun_terbit()+"')";
        System.out.println("Menambah buku...");
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Menambah"+ result +"buku\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal menambah buku");
            System.out.println(e);
        }
    }
    
    public List<Buku> showAll() {
        String sql = "SELECT * FROM Tbl_Buku";
        System.out.println("Daftar buku...");
        List<Buku> list = new ArrayList<>();
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    Buku b = new Buku(rs.getInt("id_buku"),rs.getString("nama_kategori"), rs.getInt("stok"), rs.getString("judul"), rs.getString("pengarang"), rs.getString("penerbit"), rs.getInt("tahun_terbit"));
                    list.add(b);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database...");
            System.out.println(e);
        }
        return list;
    }
    
    public List<Buku> cariBuku(String keyword)    {
       String sql = "SELECT * FROM Tbl_Buku WHERE ((nama_kategori LIKE '%"+keyword+"%') OR (judul   LIKE '%"+keyword+"%') "
               + "OR (Cstr(id_buku) LIKE '%"+keyword+"%') OR (pengarang LIKE '%"+keyword+"%') OR (penerbit LIKE '%"+keyword+"%') OR (tahun_terbit LIKE '%"+keyword+"%'))";
        System.out.println("Mencari...");
        List<Buku> list = new ArrayList<>();
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    Buku b = new Buku(rs.getInt("id_buku"), rs.getString("nama_kategori"), rs.getInt("stok"), rs.getString("judul"), rs.getString("pengarang"), rs.getString("penerbit"), rs.getInt("tahun_terbit"));
                    list.add(b);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
        
        return list;
    }
    
    public void updateBuku(Buku b, int ID)  {
        String sql = "UPDATE Tbl_Buku SET nama_kategori = '"+ b.getNama_kategori()+"', stok = '"+b.getStok()+"', judul = '"+ b.getJudul()+"', pengarang = '"+b.getPengarang()+"', penerbit = '"+ b.getPenerbit()+"', tahun_terbit = '"+b.getTahun_terbit()+"' ";
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added"+ result +"buku\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
    }
    
    public void deleteBuku(int ID)   {
        String sql = "DELETE FROM Tbl_Buku WHERE '"+ID+"' = ID ";
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete"+result+"buku\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
    }
    
    public int getIDBuku(String Judul)  {
        String sql = "SELECT id_buku WHERE judul = '"+Judul+"' ";
        System.out.println("Mencari...");
        int id_buku = 0;
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    id_buku = rs.getInt("id_buku");
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
        return id_buku;
    }
    
    public int getJumlahBuku(int ID)    {
        String sql = "SELECT stock FROM Tbl_Buku WHERE '"+ID+"' = id_buku";
        System.out.println("Mencari jumlah buku...");
        int jumlah = 0;
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    jumlah = rs.getInt("stock");
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
        return jumlah;
    }
    
    public void updateStock(int jumlah)   {
        String sql = "UPDATE Tbl_Buku SET stock = '"+jumlah+"' ";
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added"+ result +"buku\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
    }
    
    public List<Buku> showBukuTersedia()    {
        String sql = "SELECT * FROM Tbl_Buku WHERE stock > 0";
        System.out.println("Daftar buku...");
        List<Buku> list = new ArrayList<>();
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    Buku B = new Buku(rs.getInt("id_buku"), rs.getString("nama_kategori"), rs.getInt("stok"), rs.getString("judul"), rs.getString("pengarang"), rs.getString("penerbit"), rs.getInt("tahun_terbit"));
                    list.add(B);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
        return list;
    }
    
    
}
