package Model.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Lib.MyTool;
import Model.Entity.Config;
import Model.Entity.Delivery;

public class DeliveryDAO implements iDAO<Delivery> {
    private static DeliveryDAO instance;
    private ArrayList<Delivery> deliList;
    private Config cF = new Config();
    private String fileName = cF.getDeliveryFile();

    public DeliveryDAO() {
        deliList = readFromFile();
    }
    
    public static DeliveryDAO getInstance() {
        if (instance == null)
            instance = new DeliveryDAO();
        return instance;
    }

    @Override
    public boolean add(Delivery object) {
        if (isExist(object))
            return false;
        deliList.add(object);
        // Tools | Templates.
        return true;
    }

    @Override
    public boolean delete(Delivery object) {
        if (!isExist(object))
            return false;

        Iterator<Delivery> itr = deliList.iterator();
        while (itr.hasNext()) {
            Delivery next = itr.next();
            if (object.toString().equals(next.toString())) {
                deliList.remove(next);
                return true;
            }
        }

        return false;
    }

    @Override
    public ArrayList<Delivery> getList() {
        ArrayList<Delivery> list = new ArrayList<Delivery>();
        list.addAll(deliList);
        return list;
    }

    @Override
    public boolean isExist(Delivery object) {
        if (object == null) return false;
        Iterator<Delivery> itr = deliList.iterator();
        while (itr.hasNext()) {
            Delivery next = itr.next();
            if (object.toString().equals(next.toString()))
                return true;
        }
        return false;
    }

    @Override
    public ArrayList<Delivery> readFromFile() {
        ArrayList<Delivery> ls = new ArrayList();
        List<String> strList = MyTool.readLinesFromFile(fileName);
        for (int i = 0; i < strList.size(); i++) {
            ls.add(new Delivery(strList.get(i)));
        }
        return ls;
    }

    @Override
    public Delivery search(String input) {
        if (!deliList.isEmpty()) {
            Iterator<Delivery> itr = deliList.iterator();
            while (itr.hasNext()) {
                Delivery next = itr.next();
                if (input.equals(next.getDeliveryID()))
                    return next;
            }
        }
        return null;
    }

    @Override
    public boolean update(Delivery object) {
        if (!deliList.isEmpty()) {
            Iterator<Delivery> itr = deliList.iterator();
            for (int i = 0; i < deliList.size(); i++)
                if (deliList.get(i).getDeliveryID().equals(object.getDeliveryID())) {
                    deliList.set(i, object);
                    return true;
                }
        }
        return false;
    }

    @Override
    public boolean writeToFile() {
        MyTool.writeFile(fileName, deliList);
        return true;
    }

}
