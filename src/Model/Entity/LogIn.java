package Model.Entity;

public class LogIn {

    private Account acc = null;
    private static LogIn instance; // account will log in

    private LogIn() {
    }

    public static LogIn getInstance() {
        if (instance == null)
            instance = new LogIn();

        return instance;
    }

    public Account getAccount() {
        return acc;
    }

    public void setAccount(Account acc) {
        this.acc = acc;
    }
}
