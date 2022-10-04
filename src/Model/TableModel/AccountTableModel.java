/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.TableModel;

import Model.Entity.Account;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author this pc
 */
public class AccountTableModel extends AbstractTableModel{
    private String[] colNames = {"Username", "Password", "Role"};
    private ArrayList<Account> list;
    
    public AccountTableModel() {
        list = new ArrayList<>();
    }
    
    public void setData(ArrayList<Account> list) {
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
        Account a = list.get(row);
        switch (col) {
            case 0:
                return a.getAccName();
            case 1:
                return a.getPwd();
            case 2:
                return a.getRole();
        }
        return null;
    }
}
