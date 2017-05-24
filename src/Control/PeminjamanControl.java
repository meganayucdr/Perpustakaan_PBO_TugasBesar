/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import DAO.PeminjamanDAO;
import Model.ModelPeminjaman;
import Model.Peminjaman;
import javax.swing.table.TableModel;

/**
 *
 * @author Megan
 */
public class PeminjamanControl {
    private PeminjamanDAO myDAO = new PeminjamanDAO();
    
    public void insertData(Peminjaman P) {
        myDAO.makeConnection();
        myDAO.insertPeminjaman(P);
        myDAO.closeConnection();
    }
    
    public TableModel showData()    {
        myDAO.makeConnection();
        TableModel dataPeminjaman = new ModelPeminjaman(myDAO.showAll());
        myDAO.closeConnection();
        
        return dataPeminjaman;
    }
    
    public TableModel cariData(String keyword)  {
        myDAO.makeConnection();
        TableModel dataPeminjaman = new ModelPeminjaman(myDAO.cariPeminjaman(keyword));
        myDAO.closeConnection();
        
        return dataPeminjaman;
    }
}
