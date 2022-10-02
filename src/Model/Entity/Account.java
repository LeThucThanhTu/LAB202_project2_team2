package Model.Entity;

public class Account {
    private String accName, pwd, role;

    public Account(String accName, String pwd, String role) {
        this.accName = accName;
        this.pwd = pwd;
        this.role = role;
    }

    public Account() {
    }

    public String getaccName() {
        return accName;
    }

    public void setaccName(String accName) {
        this.accName = accName;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account [accName=" + accName + ", pwd=" + pwd + ", role=" + role + "]";
    }

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
