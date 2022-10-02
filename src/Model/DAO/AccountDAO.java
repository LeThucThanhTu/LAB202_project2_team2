
package Model.DAO;

import java.util.ArrayList;
import java.util.Iterator;

import Lib.MyTool;
import Model.Entity.Account;
import Model.Entity.Config;

public class AccountDAO implements iDAO<Account> {
    private static AccountDAO instance;
    private ArrayList<Account> accList;
    private String fn = new Config().getAccountFile();

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
        ls.addAll((ArrayList<Account>) MyTool.readFile(fn));
        return ls;
    }

    @Override
    public boolean isExist(Account object) {
        // case1
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
    public void add(Account object) {
        accList.add(object);
        // Tools | Templates.
    }

    @Override
    public void delete(Account object) {
        // case1 type hardcode
        Iterator<Account> itr = accList.iterator();
        while (itr.hasNext()) {
            Account next = itr.next();
            if (object.toString().equals(next.toString())) {
                accList.remove(next);
                System.out.println("-----DETELED-----");
                return;
            }
        }
        // case 2 using search method
        // if (!accList.isEmpty()&&accList.remove(object)){
        // System.out.println("-----DETELED-----");
        // };
    }

    @Override
    public void writeToFile() {
        MyTool.writeFile(fn, accList);
    }

}
