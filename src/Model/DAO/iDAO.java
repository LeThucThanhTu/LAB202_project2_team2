package Model.DAO;

/**
 *
 * @author letu
 */
import java.util.ArrayList;

public interface iDAO<T> {
    ArrayList<T> getList();

    boolean isExist(T object);

    T search(String input);

    void add(T object);

    void delete(T object);

    void writeToFile();

    ArrayList<T> readFromFile();
}
