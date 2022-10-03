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

    boolean add(T object);

    boolean delete(T object);

    boolean writeToFile();
    
    boolean update(T object);

    ArrayList<T> readFromFile();
}
