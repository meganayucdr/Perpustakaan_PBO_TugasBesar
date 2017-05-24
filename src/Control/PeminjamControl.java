/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import DAO.PeminjamDAO;
import Model.ModelPeminjam;
import Model.Peminjam;
import javax.swing.table.TableModel;

/**
 *
 * @author Megan
 */
public class PeminjamControl {
    private PeminjamDAO myDAO = new PeminjamDAO();
    
    public void insertData(Peminjam P)  {
        myDAO.makeConnection();
        myDAO.insertPeminjam(P);
        myDAO.closeConnection();
    }
    
    public TableModel showData()    {
        myDAO.makeConnection();
        TableModel dataPeminjam = new ModelPeminjam(myDAO.showAll());
        myDAO.closeConnection();
        return dataPeminjam;
    }
    
    public TableModel cariPeminjam(String keyword) {
        myDAO.makeConnection();
        TableModel dataPeminjam = new ModelPeminjam(myDAO.cariPeminjam(keyword));
        myDAO.closeConnection();
        
        return dataPeminjam;
    }
    
    public void updatePeminjam(Peminjam P, int ID)  {
        myDAO.makeConnection();
        myDAO.updatePeminjam(P, ID);
        myDAO.closeConnection();
    }
    
    public void delete(int ID)  {
        myDAO.makeConnection();
        myDAO.delete(ID);
        myDAO.closeConnection();
    }
}
