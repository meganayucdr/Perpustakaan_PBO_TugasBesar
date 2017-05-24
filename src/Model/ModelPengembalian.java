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
public class ModelPengembalian extends AbstractTableModel {
    private List<Pengembalian> list;

    public ModelPengembalian() {
    }

    public ModelPengembalian(List<Pengembalian> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: 
                return list.get(rowIndex).getId_pengembalian();
            case 1: 
                return list.get(rowIndex).getId_peminjaman();
            case 2: 
                return list.get(rowIndex).getJml_kembali();
            case 3:
                return list.get(rowIndex).getTgl_kembali();
            case 4: 
                return list.get(rowIndex).getDenda();
            case 5: 
                return list.get(rowIndex).getKeterlambatan();
            default: 
                return null;
        }
    }
    
}
