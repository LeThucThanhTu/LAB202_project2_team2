package Model.Entity;

public class Account {

    private String accName; // ID
    private String pwd; // password
    private String role;

    //constructor - IMPLEMENT IT
    public Account(String accName, String pwd, String role) {
        this.accName = accName;
        this.pwd = pwd;
        this.role = role;
    }

    // Getters -- IMPLEMENT THEM
    public String getAccName() {
        return accName;
    }

    public String getPwd() {
        return pwd;
    }

    public String getRole() {
        return role;
    }

}
