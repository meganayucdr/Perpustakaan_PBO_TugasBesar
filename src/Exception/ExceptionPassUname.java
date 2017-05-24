/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Andre
 */
public class ExceptionPassUname extends Exception {

    public ExceptionPassUname() {
    }

    public String showMessageError() {
        String Pesan = "Password atau Username salah!";
        return Pesan;
    }
}
