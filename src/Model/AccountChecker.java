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
    public Account check(Account acc) {
        // read data in file
        List<String> lines = MyTool.readLinesFromFile(accFile);

        // traverse each line for checking
        for (String line : lines) {
            String[] parts = line.split(this.SEPARATOR);
            if (parts.length < 3) {
                return null;
            }
            if (parts[0].equalsIgnoreCase(acc.getAccName()) && parts[1].equalsIgnoreCase(acc.getPwd())) {
                return new Account(parts[0], parts[1], parts[2]);
            }
        }
        return null;
    }
}
