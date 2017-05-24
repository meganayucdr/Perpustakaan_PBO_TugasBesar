/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.PeminjamanDAO.CON;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import Model.DetailPinjam;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Megan
 */
public class DetailPeminjamanDAO {
    public static Connection CON;
    public static final String url = "jdbc:ucanaccess://";
    public static final String path = "D:" + File.separator + "mahasiswadb.mdb";
    
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
    
    public void insertDetailPeminjaman(DetailPinjam DP)  {
        String sql = "INSERT INTO Tbl_Peminjaman(id_pinjam, id_buku, status) VALUES('"+DP.getId_pinjam()+"', '"+DP.getId_buku()+"' , '"+DP.getStatus()+"')";
        System.out.println("Menambah Peminjaman...");
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Menambah"+result+"Pemijaman \n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal menambah peminjaman");
            System.out.println(e);
        }
    }
    
    public List<DetailPinjam> showAll()   {
        String sql = "SELECT Tbl_Peminjaman.Nama_Peminjam, Tbl_Peminjaman.Tgl_Pinjam, Tbl_Peminjaman.Tgl_Jatuh_Tempo, Tbl_Detail_Peminjaman.id_buku, Tbl_Buku.Judul, Tbl_Detail_Peminjaman.status"
                + "FROM Tbl_Detail_Peminjaman "
                + "JOIN Tbl _Peminjaman ON Tbl_Peminjaman.ID_Pinjam = Tbl_Detail_Pinjam.id_pinjam"
                + "JOIN Tbl_Buku ON Tbl_Buku.ID_Buku = Tbl_Detail_Pinjam.id_buku"
                + "WHERE Tbl_Detail_Peminjaman.status = 'Dipinjam'";
        System.out.println("Daftar detail peminjaman...");
        List<DetailPinjam> list = new ArrayList<>();
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    DetailPinjam dp = new DetailPinjam(rs.getString("Tbl_Buku.Judul"), rs.getDate("Tbl_Peminjaman.Tgl_Pinjam"), 
                            rs.getDate("Tbl_Peminjam.Tgl_Jatuh_Tempo"), "Tbl_Peminjam.Nama", rs.getInt("Tbl_Detail_Peminjaman.id_buku"));
                    list.add(dp);
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
    
    public List<DetailPinjam> cari(String keyword)  {
        String sql = "SELECT Tbl_Peminjaman.Nama_Peminjam, Tbl_Peminjaman.Tgl_Pinjam, Tbl_Peminjaman.Tgl_Jatuh_Tempo, Tbl_Detail_Peminjaman.id_buku, Tbl_Buku.Judul, Tbl_Detail_Peminjaman.status"
                + "FROM Tbl_Detail_Peminjaman "
                + "JOIN Tbl_Peminjaman ON Tbl_Peminjaman.ID_Pinjam = Tbl_Detail_Pinjam.id_pinjam"
                + "JOIN Tbl_Buku ON Tbl_Buku.ID_Buku = Tbl_Detail_Pinjam.id_buku"
                + "WHERE Tbl_Detail_Peminjaman.status = 'Dipinjam' AND ((Cstr(Tbl_Detail_Peminjaman.id_buku) LIKE '%"+keyword+"%') OR (Cstr(Tbl_Peminjam.ID) LIKE '%"+keyword+"%') OR (Tbl_Buku.Judul LIKE '%"+keyword+"%'))";
        System.out.println("Daftar detail peminjaman...");
        
        List<DetailPinjam> list = new ArrayList<>();
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    DetailPinjam dp = new DetailPinjam(rs.getString("Tbl_Buku.Judul"), rs.getDate("Tbl_Peminjaman.Tgl_Pinjam"), 
                            rs.getDate("Tbl_Peminjam.Tgl_Jatuh_Tempo"), "Tbl_Peminjam.Nama", rs.getInt("Tbl_Detail_Peminjaman.id_buku"));
                    list.add(dp);
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
    
    public void updateStatus(String status)  {
        String sql = "UPDATE Tbl_Detail_Pinjam SET status = '"+status+"' ";
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added"+result+"status\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal mengupdate status");
            System.out.println(e);
        }
    }
    
    
}
