/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import javax.swing.JOptionPane;

/**
 *
 * @author Andre
 */
public class ExceptionDate extends Exception {

    String realisedate;

    public void ShowMessageError() {
        System.err.println("Release Date using format DDMMYYYY");
    }
}
