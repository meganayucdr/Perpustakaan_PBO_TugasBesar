/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import DAO.UserDAO;
import Model.User;
import Exception.ExceptionPassUname;

/**
 *
 * @author Megan
 */
public class ControllerUser {
    private UserDAO myDAO = new UserDAO();
    
    public boolean cekLogin(String password, String username)   {
        myDAO.makeConnection();
        boolean cek = myDAO.cekUser(password, username);
        myDAO.closeConnection();
        
        return cek;
    }
}
