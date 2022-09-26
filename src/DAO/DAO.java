/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author letu
 */
import java.util.ArrayList;

public interface DAO<T> {
    void add();

    void delete();

    void update();
    void tuNgu();
    T search();

    void setList(ArrayList<T> aList);

    ArrayList<T> getList();

    boolean isExist(String finder);

    void printTable(ArrayList<T> list);
}
