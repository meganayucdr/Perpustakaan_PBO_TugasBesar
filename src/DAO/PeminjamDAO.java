/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import Model.Peminjam;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Megan
 */
public class PeminjamDAO {
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
    
    public void insertPeminjam(Peminjam P)    {
        String sql = "INSERT INTO Tbl_Peminjam(nama) VALUES('"+ P.getNama()+"')";
        
        System.out.println("Menambah peminjam...");
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "peminjam\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding peminjam");
            System.out.println(e);
        }
    }
    
    public List<Peminjam> showAll() {
        String sql = "SELECT * FROM Tbl_Peminjam";
        System.out.println("Daftar peminjam...");
        List<Peminjam> list = new ArrayList<>();
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    Peminjam P = new Peminjam(rs.getInt("ID"),rs.getString("nama"));
                    list.add(P);
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
    
    public List<Peminjam> cariPeminjam(String keyword)    {
        String sql = "SELECT * FROM Tbl_Peminjam WHERE ((Cstr(ID) LIKE '%"+keyword+"%') OR(nama LIKE '%"+keyword+"%') )";
        System.out.println("Mencari...");
        List<Peminjam> list = new ArrayList<>();
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    Peminjam P = new Peminjam(rs.getInt("ID"), rs.getString("nama"));
                    list.add(P);
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
    
    public void updatePeminjam(Peminjam P, int ID)   {
        String sql = "UPDATE Tbl_Peminjam SET nama = '"+ P.getNama()+"' ";
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "user\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal mengedit peminjam");
            System.out.println(e);
        }
    }
    
    public void delete(int ID)  {
        String sql = "DELETE FROM Tbl_Peminjam WHERE '"+ ID +"' = ID";
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Hapus" + result + "peminjam");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal menghapus peminjam");
            System.out.println(e);
        }
    }
}
