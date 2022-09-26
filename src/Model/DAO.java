package Model;

/**
 *
 * @author letu
 */
import java.util.ArrayList;

public interface DAO<T> {
    ArrayList<T> getList();
    
    ArrayList<T> readFromFile();
    
    boolean exist(T object);
    
    void add(T object);
    
    void delete(T object);
    
    void writeToFile();
}
