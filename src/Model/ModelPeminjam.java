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
public class ModelPeminjam extends AbstractTableModel {
    private List<Peminjam> list;

    public ModelPeminjam() {
    }

    public ModelPeminjam(List<Peminjam> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex) {
            case 0: 
                return list.get(rowIndex).getId_peminjam();
            case 1: 
                return list.get(rowIndex).getNama();
            default: 
                return null;
        }
    }
    
}
