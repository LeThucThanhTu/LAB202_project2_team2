package Controller;

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
        //Add ActionListener For Sign In Button in Login View
        loginView.addSignInListener(new ActionListener() {
            Account input;
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Sign In");
                input = view.getData();
                //Check empty input
                if (input.getAccName().equals("") || input.getPwd().equals("")) view.showMessage("Please fill in all fields!");
                else {
                    //Check valid Account' information
                    input = accChecker.check(input);
                    if (input == null) view.showMessage("Account not found: Wrong email or password! Please try again.");
                    else {
                        //Store Account and Redirect to Manager View corresponding to Account's Role
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
