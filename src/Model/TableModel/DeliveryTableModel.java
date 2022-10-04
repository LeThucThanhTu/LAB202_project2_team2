/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.TableModel;

import Model.Entity.Delivery;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author this pc
 */
public class DeliveryTableModel extends AbstractTableModel{
    private String[] colNames = {"Delivery ID", "Product Name", "Customer Address"};
    private ArrayList<Delivery> list;
    
    public DeliveryTableModel() {
        list = new ArrayList();
    }
    
    public void setData(ArrayList<Delivery> list) {
        this.list = list;
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }
    
    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Delivery delivery = list.get(row);
        switch(col) {
            case 0: return delivery.getDeliveryID();
            case 1: return delivery.getProductName();
            case 2: return delivery.getCusAddress();
        }
        return null;
    }
    
}
