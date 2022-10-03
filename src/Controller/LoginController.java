package Controller;

import Lib.MyTool;
import Model.AccountChecker;
import Model.DAO.AccountDAO;
import Model.Entity.Account;
import Model.Entity.LogIn;
import View.LogIn.LogInView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    private LogInView loginView;
    private AccountDAO accDAO;
    private AccountChecker accChecker = new AccountChecker();
    
    public LoginController(LogInView view) {
        this.loginView = view;
        accDAO = AccountDAO.getInstance();
        view.addSignInListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Sign In");
                Account input = view.getData();
                if (input == null) view.showMessage("Please fill in all fields!");
                else {
                    input = accChecker.check(input);
                    if (input == null) view.showMessage("Account not found: Wrong email or password! Please try again.");
                    else {
                        LogIn.getInstance().setAccount(input);
                        System.out.println(LogIn.getInstance().getAccount().getAccName());
                        view.dispose();
                    }
                }
            }
        });
    }
    
    public void showLogInView(){
        loginView.setVisible(true);
    }
}
