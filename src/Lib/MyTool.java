/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

import java.util.Scanner;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.text.ParseException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author phatt
 */
public class MyTool {

    public static final Scanner sc = new Scanner(System.in);
    //Check Valid String  

    public static boolean validStr(String str, String regEX) {
        str = sc.nextLine();
        if (str.matches(regEX)) 
            
            return true;

        else {
            return false;

        }

    }
    
    //Check Valid Password
    public static boolean validPassword(String str, int minLen) {
        if (str.length() < minLen)             
            return false;
        
        
        return str.matches(".*[a-zA-Z]+.*")
                && str.matches(".*[\\d]+.*")
                && str.matches(".*[\\W]+.*"); //           
    }

// Parse Date
    public static Date parseDate(String dateStr, String dateFormat) {
        SimpleDateFormat dF = (SimpleDateFormat) SimpleDateFormat.getInstance();
        dF.applyPattern(dateFormat);
        try {
            long t = dF.parse(dateStr).getTime();
            return new Date(t);

        } catch (ParseException e) {
            System.out.println(e);

        }
        
        return null;
    }
    // ParseBool
    public static boolean parseBool(String boolStr) {
        char c = boolStr.trim().toUpperCase().charAt(0);
        
        return (c == '1' || c == 'Y' || c == 'T');

    }
    // Tools for Inputting Data
    
    //ReadnonBlank
    public static String readNonBlank(String message) {
        String input = "";
        do {
            System.out.println(message + ": ");
            input = sc.nextLine().trim();

        } while (input.isEmpty());
        
        return input;

    }

    public static String readPattern(String message, String pattern) {
        String input = "";
        boolean valid;
        do {
            System.out.println(message + ":");
            input = sc.nextLine().trim();
            valid = validStr(input, pattern);

        } while (!valid);
        
        return input;
    }

    public static boolean readBool(String message) {
        String input;
        System.out.println(message + "[1/0-Y/N-T/F]:");        
        input = sc.nextLine().trim();
        
        if (input.isEmpty()) 
            return false;        
        
        char c = Character.toUpperCase(input.charAt(0));
        
        return (c == '1' || c == 'Y' || c == 'T');

    }

    public static List<String> readLinesFromFile(String Filename) {
        List<String> list = new ArrayList();

        try {

            FileInputStream fileIn = new FileInputStream(Filename);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();
            list.add((String)obj);
            
            System.out.println("The Object has been read from the file");                      
            objectIn.close();
            
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
            
            return null;           
        }

    }

    public static void writeFile(String filename, List list) {

        try {
            
            FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            objectOut.writeObject(list);
            objectOut.close();
            
            System.out.println("The Object  was succesfully written to a file");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
