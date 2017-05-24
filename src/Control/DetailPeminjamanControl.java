/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import DAO.DetailPeminjamanDAO;
import Interface.iDenda;
import Model.DetailPinjam;
import Model.ModelDetail;
import Model.ModelPeminjaman;
import javax.swing.table.TableModel;


/**
 *
 * @author Megan
 */
public class DetailPeminjamanControl {
    private DetailPeminjamanDAO myDAO = new DetailPeminjamanDAO();
    
    public void insertData(DetailPinjam DP) {
        myDAO.makeConnection();
        myDAO.insertDetailPeminjaman(DP);
        myDAO.closeConnection();
    }
    
    public TableModel showData()    {
        myDAO.makeConnection();
        TableModel dataDetail = new ModelDetail(myDAO.showAll());
        myDAO.closeConnection();
        
        return dataDetail;
    }
    
    public TableModel cariData(String keyword)  {
        myDAO.makeConnection();
        TableModel dataDetail = new ModelDetail(myDAO.cari(keyword));
        myDAO.closeConnection();
        
        return dataDetail;
    }
    
    public void updateStatus(String status) {
        myDAO.makeConnection();
        myDAO.updateStatus(status);
        myDAO.closeConnection();
    }
}
