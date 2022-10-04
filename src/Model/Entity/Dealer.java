package Model.Entity;

import Lib.MyTool;

public class Dealer implements Comparable<Dealer>{
    public static final char SEPARATOR = ',';
    public static final String ID_FORMAT = "D\\d{3}";
    public static final String PHONE_FORMAT = "\\d{9}|\\d{11}";
    private String ID, name, addr, phone;
    private boolean continuing;

    public Dealer() {
    }
    
    public Dealer(String line) {
        String[] parts = line.split("" + this.SEPARATOR);
        ID = parts[0].trim();
        name = parts[1].trim();
        addr = parts[2].trim();
        phone = parts[3].trim();
        continuing = MyTool.parseBool(parts[4]);
    }

    public Dealer(String iD, String name, String addr, String phone, boolean continuing) {
        ID = iD;
        this.name = name;
        this.addr = addr;
        this.phone = phone;
        this.continuing = continuing;
    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        ID = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean getContinuing() {
        return continuing;
    }

    public void setContinuing(boolean continuing) {
        this.continuing = continuing;
    }

    @Override
    public String toString() {
        return "Dealer [ID=" + ID + ", name=" + name + ", addr=" + addr + ", phone=" + phone + ", continuing="
                + continuing
                + "]";
    }

    @Override
    public int compareTo(Dealer t) {
        return this.getID().compareTo(t.getID());
    }

}
