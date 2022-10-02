package Model.Entity;

public class Dealer {
    private String ID, name, addr, phone, continuing;

    public Dealer() {
    }

    public Dealer(String iD, String name, String addr, String phone, String continuing) {
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

    public String getContinuing() {
        return continuing;
    }

    public void setContinuing(String continuing) {
        this.continuing = continuing;
    }

    @Override
    public String toString() {
        return "Dealer [ID=" + ID + ", name=" + name + ", addr=" + addr + ", phone=" + phone + ", continuing="
                + continuing
                + "]";
    }

}
