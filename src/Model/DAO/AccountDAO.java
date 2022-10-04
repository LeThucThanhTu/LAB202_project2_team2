
package Model.DAO;

import java.util.ArrayList;
import java.util.Iterator;

import Lib.MyTool;
import Model.Entity.Account;
import Model.Entity.Config;
import java.util.List;

public class AccountDAO implements iDAO<Account> {
    private static AccountDAO instance;
    private ArrayList<Account> accList;
    private Config cF = new Config();
    private String fileName = cF.getAccountFile();

    private AccountDAO() {
        accList = readFromFile();
    }

    // create a singleton class
    public static AccountDAO getInstance() {
        if (instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    @Override
    public Account search(String input) {
        // TODO Auto-generated method stub
        // search by id
        Iterator<Account> itr = accList.iterator();
        while (itr.hasNext()) {
            Account next = itr.next();
            if (input.equals(next.getAccName())) {
                return next;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Account> getList() {
        ArrayList<Account> list = new ArrayList<Account>();
        list.addAll(accList);
        return list;
        // Tools | Templates.
    }

    @Override
    public ArrayList<Account> readFromFile() {
        ArrayList<Account> ls = new ArrayList<>();
        List<String> strList = MyTool.readLinesFromFile(fileName);
        for (int i = 0; i < strList.size(); i++) {
            ls.add(new Account(strList.get(i)));
        }
        return ls;
    }

    @Override
    public boolean isExist(Account object) {
        // case1
        if (object == null) return false;
        Iterator<Account> itr = accList.iterator();
        while (itr.hasNext()) {
            Account next = itr.next();
            if (object.toString().equals(next.toString())) {
                return true;
            }
        }
        return false;
        // case 2 using search method
        // Iterator<Account> itr = accList.iterator();
        // while (itr.hasNext()) {
        // Account next = itr.next();
        // if (object==next) {
        // return true;
        // }
        // }
        // return false;
    }

    @Override
    public boolean add(Account object) {
        if (isExist(object)) return false;
        accList.add(object);
        return true;
        // Tools | Templates.
    }

    @Override
    public boolean delete(Account object) {
        if (!isExist(object)) return false;
        // case1 type hardcode
        System.out.println("It is exist");
        Iterator<Account> itr = accList.iterator();
        while (itr.hasNext()) {
            Account next = itr.next();
            if (object.getAccName().equals(next.getAccName())) {
                accList.remove(next);
                
                return true;
            }
        }
        // case 2 using search method
        // if (!accList.isEmpty()&&accList.remove(object)){
        // System.out.println("-----DETELED-----");
        // };
        return false;
    }

    @Override
    public boolean writeToFile() {
        MyTool.writeFile(fileName, accList);
        return true;
    }

    @Override
    public boolean update(Account object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
