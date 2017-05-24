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
public class ModelPeminjaman extends AbstractTableModel {
    private List<Peminjaman> list;

    public ModelPeminjaman() {
    }

    public ModelPeminjaman(List<Peminjaman> list) {
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
                return list.get(rowIndex).getIDPeminjaman();
            case 1: 
                return list.get(rowIndex).getJumlah_pinjam();
            case 2: 
                return list.get(rowIndex).getNama();
            case 3: 
                return list.get(rowIndex).getTgl_pinjam();
            case 4: 
                return list.get(rowIndex).getTgl_jatuh_tempo();
            default: 
                return null;
        }
    }
    
}
