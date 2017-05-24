/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Megan
 */
public class UserDAO {
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
    
    public boolean cekUser(String password, String username)   {
        String sql = "SELECT username FROM Tbl_User WHERE username = '"+username+"' AND password = '"+password+"' ";
        System.out.println("Mencari user...");
        boolean cek = false;
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            if (rs!=null) {
                cek = true;
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Gagal membaca database");
            System.out.println(e);
        }
        return cek;
    }
    
   
}
