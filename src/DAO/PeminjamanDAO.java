/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import Model.Peminjaman;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Megan
 */
public class PeminjamanDAO {
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
    
    public void insertPeminjaman(Peminjaman P)  {
        String sql = "INSERT INTO Tbl_Peminjaman(id_peminjam, jumlah_pinjam, tgl_pinjam, tgl_jatuh_tempo) VALUES('"+P.getIDPeminjam()+"', '"+P.getJumlah_pinjam()+"' , '"+P.getTgl_pinjam()+"' , '"+P.getTgl_jatuh_tempo()+"')";
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
    
    public List<Peminjaman> showAll()   {
        String sql = "SELECT Tbl_Peminjaman.ID_Pinjam, Tbl_Peminjam.Nama, Tbl_Peminjaman.Jumlah_Pinjam, Tbl_Peminjaman.Tgl_Pinjam, "
                + "Tbl_Peminjaman.Tgl_jatuh_Tempo FROM Tbl_Peminjaman JOIN Tbl_Peminjam ON Tbl_Peminjam.ID = Tbl_Peminjaman.ID_Peminjaman";
        System.out.println("Daftar peminjaman...");
        List<Peminjaman> list = new ArrayList<>();
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    Peminjaman P = new Peminjaman(rs.getInt("Tbl_Peminjaman.ID_Pinjam"), rs.getString("Tbl_Pinjam.Nama"), rs.getInt("Tbl_Peminjaman.Jumlah_Pinjam"), rs.getDate("Tbl_Peminjaman.Tgl_Pinjam"), rs.getDate("Tbl_Peminjaman.Tgl_Jatuh_Tempo"));
                    list.add(P);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Peminjaman> cariPeminjaman(String keyword)  {
         String sql = "SELECT Tbl_Peminjaman.ID_Pinjam, Tbl_Peminjam.Nama, Tbl_Peminjaman.Jumlah_Pinjam, Tbl_Peminjaman.Tgl_Pinjam, "
                + "Tbl_Peminjaman.Tgl_jatuh_Tempo FROM Tbl_Peminjaman JOIN Tbl_Peminjam ON Tbl_Peminjam.ID = Tbl_Peminjaman.ID_Peminjaman"
                 + "WHERE ((Cstr(Tbl_Peminjaman.ID_Peminjam) LIKE '%"+keyword+"%'))";
        System.out.println("Daftar peminjam...");
        List<Peminjaman> list = new ArrayList<>();
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    Peminjaman P = new Peminjaman(rs.getInt("Tbl_Peminjaman.ID_Pinjam"), rs.getString("Tbl_Pinjam.Nama"), rs.getInt("Tbl_Peminjaman.Jumlah_Pinjam"), rs.getDate("Tbl_Peminjaman.Tgl_Pinjam"), rs.getDate("Tbl_Peminjaman.Tgl_Jatuh_Tempo"));
                    list.add(P);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
        }
        
        return list;
    }
}
