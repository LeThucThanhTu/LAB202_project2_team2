
package Model.DAO;

import java.util.ArrayList;
import java.util.Iterator;

import Lib.MyTool;
import Model.Entity.Config;
import Model.Entity.Dealer;
import java.util.List;

public class DealerDAO implements iDAO<Dealer> {
    private static DealerDAO instance;
    private ArrayList<Dealer> dealList;
    private Config cF = new Config();
    private String fileName = cF.getDealerFile();

    private DealerDAO() {
        dealList = readFromFile();
    }

    // create a singleton class
    public static DealerDAO getInstance() {
        if (instance == null) {
            instance = new DealerDAO();
        }
        return instance;
    }

    @Override
    public Dealer search(String input) {
        if (!dealList.isEmpty()) {
            // TODO Auto-generated method stub
            // search by id
            Iterator<Dealer> itr = dealList.iterator();
            while (itr.hasNext()) {
                Dealer next = itr.next();
                if (input.equals(next.getID())) {
                    return next;
                }
            }
        }
        return null;
    }

    @Override
    public ArrayList<Dealer> getList() {
        ArrayList<Dealer> list = new ArrayList<Dealer>();
        list.addAll(dealList);
        return list;
        // Tools | Templates.
    }

    @Override
    public ArrayList<Dealer> readFromFile() {
        ArrayList<Dealer> ls = new ArrayList();
        List<String> strList = MyTool.readLinesFromFile(fileName);
        for (int i = 0; i < strList.size(); i++) {
            ls.add(new Dealer(strList.get(i)));
        }
        return ls;
    }

    @Override
    public boolean isExist(Dealer object) {
        if (!dealList.isEmpty()) {
            // case1
            Iterator<Dealer> itr = dealList.iterator();
            while (itr.hasNext()) {
                Dealer next = itr.next();
                if (object.toString().equals(next.toString())) {
                    return true;
                }
            }
        }
        return false;
        // case 2 using search method
        // Iterator<Dealer> itr = dealList.iterator();
        // while (itr.hasNext()) {
        // Dealer next = itr.next();
        // if (object==next) {
        // return true;
        // }
        // }
        // return false;
    }

    @Override
    public boolean add(Dealer object) {
        if (isExist(object)) return false;
        dealList.add(object);
        // Tools | Templates.
        return true;
    }

    @Override
    public boolean delete(Dealer object) {
        if (!isExist(object)) return false;
        // case1 type hardcode
        Iterator<Dealer> itr = dealList.iterator();
        while (itr.hasNext()) {
            Dealer next = itr.next();
            if (object.toString().equals(next.toString())) {
                dealList.remove(next);
                return true;
            }
        }
        // case 2 using search method
        // if (!dealList.isEmpty()&&dealList.remove(object)){
        // System.out.println("-----DETELED-----");
        // };
        return false;
    }

    @Override
    public boolean writeToFile() {
        MyTool.writeFile(fileName, dealList);
        return true;
    }

    @Override
    public boolean update(Dealer object) {
        if (!dealList.isEmpty()) {
            Iterator<Dealer> itr = dealList.iterator();
            for (int i = 0; i < dealList.size(); i++) {
                if (dealList.get(i).getID().equals(object.getID())) {
                    dealList.set(i, object);
                    return true;
                }
            }
        }
        return false;
    }

}
