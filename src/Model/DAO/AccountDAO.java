
package Model.DAO;

import java.util.ArrayList;

import Model.Entity.Account;

public class AccountDAO implements iDAO<Account> {
    private ArrayList<Account> accList;

    @Override
    public Account search(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    public AccountDAO() {
        accList = readFromFile();
    }

    @Override
    public ArrayList<Account> getList() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public ArrayList<Account> readFromFile() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public boolean isExist(Account object) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void add(Account object) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void delete(Account object) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    @Override
    public void writeToFile() {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
