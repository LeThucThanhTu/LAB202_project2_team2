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
import java.io.BufferedWriter;
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
    String ID,name,add,phone,continuing;
    public static final Scanner sc = new Scanner(System.in);
    //Check Valid String  

    public static boolean validStr(String str, String regEX) {
        str = sc.nextLine();
        if (str.matches(regEX)) 
            
            return false;

        else {
            return true;

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

          File f = new File(Filename);
          if(!f.exists())
              return null;
          
          FileReader fr = new FileReader(f);
          BufferedReader bf = new BufferedReader(fr);
          String details;
          while ((details = bf.readLine()) != null)
          {
              
              
              list.add(details);
          }
            
          
        } catch (Exception ex) {
            ex.printStackTrace();
            
                      
        }
        return list;
    }

    public static void writeFile(String filename, List list) {
        
        
        try{
        FileWriter fw = new FileWriter(filename);
       PrintWriter pw = new PrintWriter(fw);
        
       
        for ( int i = 0; i< list.size();i++)
        {
         
        pw.println(list.get(i));
       
        
        }
         pw.close();
         fw.close();
        }catch(Exception e)
        {
            System.out.println(e);
        
        }








}

    

}
