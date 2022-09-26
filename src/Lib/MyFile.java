package Lib;

/**
 *
 * @author letu
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFile<T> {
    ArrayList<T> fileList = new ArrayList<T>();
    String fileIn, fileOut;

    public ArrayList<T> getList() {
        return fileList;
    }

    public void update() {
        fileList.removeAll(fileList);
        getFile(fileIn);
    }

    public void setFile(String outputFile, ArrayList<T> list) {
        outputFile = fileOut;
        try {
            FileOutputStream FOS = new FileOutputStream(outputFile);
            ObjectOutputStream OOS = new ObjectOutputStream(FOS);

            for (T each : list)
                OOS.writeObject(each);

            OOS.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    public ArrayList<T> getFile(String inputFile) {
        inputFile = fileIn;
        try {
            FileInputStream FIS = new FileInputStream(inputFile);
            ObjectInputStream OIS = new ObjectInputStream(FIS);

            while (OIS.readObject() != null)
                fileList.add((T) OIS.readObject());
            OIS.close();
            return fileList;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<String> getFileLine(String inputFile) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            File file = new File(inputFile);
            Scanner readFile = new Scanner(file);

            while (readFile.hasNextLine())
                list.add(readFile.nextLine());

            readFile.close();
            return list;
        } catch (Exception e) {
        }
        return null;
    }

    public ArrayList<String> getData(ArrayList<String> list, String pattern) {
        for (String each : list) {
            each = each.toLowerCase();
            String fileName[] = each.split(pattern);
            list.add(MyUtils.formatName(fileName[1]));
        }
        return list;
    }
}

