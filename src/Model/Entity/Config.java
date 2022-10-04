/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import Lib.MyTool;
import java.util.List;

/**
 *
 * @author this pc
 */
public class Config {
    private static final String CONFIG_FILE = "config.txt";
    private String accountFile;
    private String dealerFile;
    private String deliveryFile;

    public Config() {
        readData();
    }

    private void readData() {
        List<String> lines = MyTool.readLinesFromFile(CONFIG_FILE);
        for (String line : lines) {
            String[] parts = line.split(":");
            String fPart = parts[0].toUpperCase();

            if (fPart.contains("ACCOUNT"))
                accountFile = parts[1].trim();
            else if (fPart.indexOf("DEALER") >= 0)
                dealerFile = parts[1].trim();
            else if (fPart.indexOf("DELIVER") >= 0)
                deliveryFile = parts[1].trim();
        }
    }

    public String getAccountFile() {
        return accountFile;
    }

    public String getDealerFile() {
        return dealerFile;
    }

    public String getDeliveryFile() {
        return deliveryFile;
    }
}
