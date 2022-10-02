
package Model.DAO;

import java.util.ArrayList;
import java.util.Iterator;

import Lib.MyTool;
import Model.Entity.Dealer;

public class DealerDAO implements iDAO<Dealer> {
    private static DealerDAO instance;
    private ArrayList<Dealer> dealList;

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
        // TODO Auto-generated method stub
        // search by id
        Iterator<Dealer> itr = dealList.iterator();
        while (itr.hasNext()) {
            Dealer next = itr.next();
            if (input.equals(next.getID())) {
                return next;
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
        String fn = "????";
        ArrayList<Dealer> ls = new ArrayList<>();
        ls.addAll((ArrayList<Dealer>) MyTool.readFile(fn));
        return ls;
    }

    @Override
    public boolean isExist(Dealer object) {
        // case1
        Iterator<Dealer> itr = dealList.iterator();
        while (itr.hasNext()) {
            Dealer next = itr.next();
            if (object.toString().equals(next.toString())) {
                return true;
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
    public void add(Dealer object) {
        dealList.add(object);
        // Tools | Templates.
    }

    @Override
    public void delete(Dealer object) {
        // case1 type hardcode
        Iterator<Dealer> itr = dealList.iterator();
        while (itr.hasNext()) {
            Dealer next = itr.next();
            if (object.toString().equals(next.toString())) {
                dealList.remove(next);
                System.out.println("-----DETELED-----");
                return;
            }
        }
        // case 2 using search method
        // if (!dealList.isEmpty()&&dealList.remove(object)){
        // System.out.println("-----DETELED-----");
        // };
    }

    @Override
    public void writeToFile() {
        String fn = "???";
        MyTool.writeFile(fn, dealList);
    }

}
