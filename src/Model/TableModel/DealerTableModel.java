/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.TableModel;

import Model.Entity.Dealer;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author this pc
 */
public class DealerTableModel extends AbstractTableModel {
    private String[] colNames = {"ID", "Name", "Address", "Phone", "Continuing"};
    private ArrayList<Dealer> list;
    
    public DealerTableModel() {
        list = new ArrayList<>();
    }
    
    public void setData(ArrayList<Dealer> list) {
        this.list = list;
        fireTableDataChanged();
    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Dealer d = list.get(row);
        switch (col) {
            case 0:
                return d.getID();
            case 1:
                return d.getName();
            case 2:
                return d.getAddr();
            case 3:
                return d.getPhone();
            case 4:
                return d.getContinuing() + "";
        }
        return null;
    }
}
