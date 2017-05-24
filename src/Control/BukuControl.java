/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.BukuDAO;
import Model.Buku;
import Model.ModelBuku;
import javax.swing.table.TableModel;

/**
 *
 * @author Megan
 */
public class BukuControl {

    private BukuDAO myDAO;

    public BukuControl() {
        myDAO = new BukuDAO();
    }

    public void insertBuku(Buku B) {
        myDAO.makeConnection();
        myDAO.insertBuku(B);
        myDAO.closeConnection();
    }

    public TableModel showData() {
        myDAO.makeConnection();
        TableModel dataBuku = new ModelBuku(myDAO.showAll());
        myDAO.closeConnection();
        return dataBuku;
    }

    public TableModel cariBuku(String keyword) {
        myDAO.makeConnection();
        TableModel dataBuku = new ModelBuku(myDAO.cariBuku(keyword));
        myDAO.closeConnection();

        return dataBuku;
    }

    public void updateBuku(Buku B, int id_buku) {
        myDAO.makeConnection();
        myDAO.updateBuku(B, id_buku);
        myDAO.closeConnection();
    }

    public void deleteBuku(int id_buku) {
        myDAO.makeConnection();
        myDAO.deleteBuku(id_buku);
        myDAO.closeConnection();
    }

    public int getIDBuku(String judul) {
        myDAO.makeConnection();
        int id = myDAO.getIDBuku(judul);
        myDAO.closeConnection();
        return id;
    }

    public int getJumlahBuku(int ID) {
        myDAO.makeConnection();
        int jumlah = myDAO.getJumlahBuku(ID);
        myDAO.closeConnection();

        return jumlah;
    }

    public void updateStock(int jumlah) {
        myDAO.makeConnection();
        myDAO.updateStock(jumlah);
        myDAO.closeConnection();
    }

    public TableModel showBukuTersedia() {
        myDAO.makeConnection();
        TableModel dataBuku = new ModelBuku(myDAO.showBukuTersedia());
        myDAO.closeConnection();

        return dataBuku;
    }
}
