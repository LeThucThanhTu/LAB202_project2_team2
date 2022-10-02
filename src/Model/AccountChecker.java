/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Lib.MyTool;
import Model.Entity.Account;
import Model.Entity.Config;
import java.util.List;

/**
 *
 * @author this pc
 */
public class AccountChecker {

    private String accFile;
    private static String SEPARATOR = ",";

    public AccountChecker() {
        setupAccFile();
    }

    private void setupAccFile() {
        Config cR = new Config();
        accFile = cR.getAccountFile();
    }

    // check valiadity od an account
    public boolean check(Account acc) {
        // read data in file
        List<String> lines = MyTool.readLinesFromFile(accFile);

        // traverse each line for checking
        for (String line : lines) {
            String[] parts = line.split(this.SEPARATOR);
            if (parts.length < 3) {
                return false;
            }
            if (parts[0].equalsIgnoreCase(acc.getAccName()) && parts[1].equalsIgnoreCase(acc.getPwd()) && parts[2].equalsIgnoreCase(acc.getRole())) {
                return true;
            }
        }
        return false;
    }

    // test OK - It is optional
    public static void main(String[] args) {
        AccountChecker aChk = new AccountChecker();
        Account acc = new Account("E001", "12345678", "BOSS");
        boolean valid = aChk.check(acc);
        System.out.println("Needs OK, OK?: " + valid);
        acc = new Account("E002", "2345678", "ACC-1");
        valid = aChk.check(acc);
        System.out.println("Needs OK, OK?: " + valid);
        acc = new Account("E003", "12345678", "ACC-2");
        valid = aChk.check(acc);
        System.out.println("Needs OK, OK?: " + valid);
    }
}
