/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import Lib.MyTool;

/**
 *
 * @author this pc
 */
class LogIn {

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

//constructor
//    public LogIn(Account acc) {
//        this.acc = acc;
//    }
//
//    // input data of an account - IMPLEMENT IT
//    // create new account
//    // return this account
//    public static Account inputAccount() {
//        String accName;
//        String pwd; // password
//        String role;
//        accName = MyTool.readNonBlank("Enter account name: ").toUpperCase();
//        pwd = MyTool.readPattern("Enter password: ", ".*[a-zA-Z]+.*{6,8}|.*[\\d]+.*|.*[\\W]+.*");
//        role = MyTool.readPattern("Enter role: ", "BOSS|ACC-1|ACC-2").toUpperCase();
//        Account a = new Account(accName, pwd, role);
//        this.add(a);
//        //return ;
//    }
//
//    // getter
//    public Account getAcc() {
//        return acc;
//    }
// main program
//    public static void main(String[] args) {
//
//    }
//}
