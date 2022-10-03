/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

/**
 *
 * @author this pc
 */
public class LogIn {

    private Account acc = null;
    private static LogIn instance;  // account will log in

    private LogIn() {
    }

    public static LogIn getInstance() {
        if (instance == null) {
            instance = new LogIn();
        }
        return instance;
    }

    public Account getAccount() {
        return acc;
    }

    public void setAccount(Account acc) {
        this.acc = acc;
    }
}
