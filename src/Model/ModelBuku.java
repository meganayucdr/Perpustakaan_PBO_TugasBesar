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
public class ModelBuku extends AbstractTableModel {
    private List<Buku> list;

    public ModelBuku() {
    }

    public ModelBuku(List<Buku> list) {
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
                return list.get(rowIndex).getId_buku();
            case 1: 
                return list.get(rowIndex).getTahun_terbit();
            case 2: 
                return list.get(rowIndex).getNama_kategori();
            case 3: 
                return list.get(rowIndex).getStok();
            case 4: 
                return list.get(rowIndex).getJudul();
            case 5: 
                return list.get(rowIndex).getPengarang();
            case 6: 
                return list.get(rowIndex).getPenerbit();
            default: 
                return null;
        }
    }
    
}
