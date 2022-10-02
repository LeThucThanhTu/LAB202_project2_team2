package Model.Entity;

public class Account {
    private String AccName, Pwd, role;

    public Account(String AccName, String Pwd, String role) {
        this.AccName = AccName;
        this.Pwd = Pwd;
        this.role = role;
    }

    public Account() {
    }

    public String getAccName() {
        return AccName;
    }

    public void setAccName(String AccName) {
        this.AccName = AccName;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String Pwd) {
        this.Pwd = Pwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Account [AccName=" + AccName + ", Pwd=" + Pwd + ", role=" + role + "]";
    }

}
