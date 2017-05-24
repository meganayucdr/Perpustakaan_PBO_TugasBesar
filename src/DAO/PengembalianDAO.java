/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pengembalian;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Megan
 */
public class PengembalianDAO {
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
    
    public void insertPengembalian(Pengembalian P)    {
        String sql = "INSERT INTO Tbl_Pengembalian(id_peminjaman, jumlah_kembali, tgl_kembali, keterlambatan, denda) VALUES('"+P.getId_peminjaman()+"','"+P.getJml_kembali()+"','"+P.getTgl_kembali()+"','"+P.getKeterlambatan()+"', '"+P.getDenda()+"')";
        System.out.println("Menambah pengembalian...");
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added"+result+"pengembalian\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal menambah pengembalian");
            System.out.println(e);
        } 
    }
    
    public List<Pengembalian> showAll() {
        String sql = "SELECT * FROM Tbl_Pengembalian";
        System.out.println("Daftar pengembalian...");
        List<Pengembalian> list = new ArrayList<>();
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                while (rs.next()) {                    
                    //Pengembalian P = new Pengembalian(rs.getDate("tgl_kembali"), rs.getInt("denda"), rs.getInt("keterlambatan"), rs.getInt("jumlah_kembali"));
                }
            }
        } catch (Exception e) {
        }
        
        return list;
    }
}
