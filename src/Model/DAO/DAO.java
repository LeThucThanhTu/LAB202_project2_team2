package Model.DAO;

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
