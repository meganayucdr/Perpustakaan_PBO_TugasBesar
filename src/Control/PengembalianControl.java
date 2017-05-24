/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import DAO.PengembalianDAO;
import Model.ModelPengembalian;
import Model.Pengembalian;
import javax.swing.table.TableModel;
import Interface.iDenda;
import Interface.iKeterlambatan;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Megan
 */
public class PengembalianControl implements iDenda, iKeterlambatan {
    private PengembalianDAO myDAO = new PengembalianDAO();
    
    public void insertData(Pengembalian P)  {
        myDAO.makeConnection();
        myDAO.insertPengembalian(P);
        myDAO.closeConnection();
    }
    
    public TableModel showPengembalian()  {
        myDAO.makeConnection();
        TableModel dataPengembalian = new ModelPengembalian(myDAO.showAll());
        myDAO.closeConnection();
        
        return dataPengembalian;
    }

    @Override
    public int hitungDenda(int keterlambatan, int jumlah_buku) {
        return keterlambatan * 2000 * jumlah_buku;
    }

    @Override
    public long hitungKeterlambatan(Date tgl_pinjam, Date tgl_kembali) {
        long keterlambatan =  tgl_kembali.getTime() - tgl_pinjam.getTime();
        
        return keterlambatan;       
    }
}
