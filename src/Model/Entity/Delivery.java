package Model.Entity;

public class Delivery {
    public static final char SEPARATOR = ',';
    private String ID;
    private String name;
    private String addr;

    public Delivery() {
    }

    public Delivery(String line) {
        String[] parts = line.split("" + this.SEPARATOR);
        ID = parts[0].trim();
        name = parts[1].trim();
        addr = parts[2].trim();
    }

    public Delivery(String id, String name, String address) {
        this.ID = id;
        this.name = name;
        this.addr = address;
    }

    public String getID() {
        return ID;
    }

    public void setID(String id) {
        this.ID = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return addr;
    }

    public void setAddress(String address) {
        this.addr = address;
    }

    @Override
    public String toString() {
        return ID + "," + name + "," + addr;
    }

}
