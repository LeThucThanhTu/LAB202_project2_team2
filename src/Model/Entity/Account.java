package Model.Entity;

public class Account {
    public static final char SEPARATOR = ',';
    private String accName; // ID
    private String pwd; // password
    private String role;

    public Account() {
    }
    
    public Account(String accName, String accPwd) {
        this.accName = accName;
        this.pwd = accPwd;
        this.role = null;
    }
    
    public Account(String line) {
        String[] parts = line.split("" + this.SEPARATOR);
        accName = parts[0].trim();
        pwd = parts[1].trim();
        role = parts[2].trim();
    }
    
    //constructor - IMPLEMENT IT
    public Account(String accName, String pwd, String role) {
        this.accName = accName;
        this.pwd = pwd;
        this.role = role;
    }

    @Override
    public String toString() {
        return (accName + SEPARATOR + pwd + SEPARATOR + role);
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
