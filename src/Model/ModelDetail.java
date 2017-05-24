/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Megan
 */
public class ModelDetail extends AbstractTableModel{
    List<DetailPinjam> list;

    public ModelDetail() {
    }

    public ModelDetail(List<DetailPinjam> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: 
                return list.get(rowIndex).getJudul();
            case 1: 
                return list.get(rowIndex).getTgl_pinjam();
            case 2: 
                return list.get(rowIndex).getTgl_jatuh_tempo();
            case 3: 
                return list.get(rowIndex).getNama_peminjam();
            case 4: 
                return list.get(rowIndex).getId_buku();
            default: 
                return null;
        }
    }
    
}
