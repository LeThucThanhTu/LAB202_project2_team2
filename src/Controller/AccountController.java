package Controller;

import Lib.MyTool;
import Model.DAO.AccountDAO;
import Model.Entity.Account;
import Model.Entity.Config;
import View.Account.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AccountController {
    private AccountMngView accMngView;
    private AccountDAO accDAO;
    private AddAccountView addView;
    private RemoveAccountView removeView;
    private SearchAccountView searchView;
    private UpdateAccountView updateView;
    private AccountListView listView;
    private String fileName = new Config().getAccountFile();

    public AccountController(AccountMngView view) {
        this.accMngView = view;
        accDAO = AccountDAO.getInstance();

        // Add ActionListener For Add Button in Account Manager View
        accMngView.addAddButtonListener(new ActionListener() {
            Account data;

            @Override
            public void actionPerformed(ActionEvent ae) {
                // Make Add Account View visible
                showAddAccountView();
                // Add ActionListener For Add Button in Account Add View
                addView.addAddButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        data = addView.getData();
                        String name = data.getAccName().equals("User") ? "" : data.getAccName();
                        String pwd = data.getPwd().equals("Password") ? "" : data.getAccName();
                        String role = data.getRole().equals("Role") ? "" : data.getRole();
                        // Checking is there any empty field
                        if (name.equals("")
                                || pwd.equals("")
                                || role.equals(""))
                            addView.showMessage("Please fill in all field!");
                        else {
                            // Validating input
                            if (accDAO.search(name) != null)
                                addView.showMessage("Invalid Account Username: Account Username is exist!");
                            else if (!MyTool.validPassword(data.getPwd(), 8))
                                addView.showMessage("Invalid password! ");
                            else if (!(role.equals("ACC-1")
                                    || role.equals("ACC-2")
                                    || role.equals("BOSS")))
                                addView.showMessage("Invalid Role: Must be [ACC-1] / [ACC-2] / [BOSS]");
                            // Add new Account
                            else {
                                System.out.println(data);
                                if (accDAO.add(data)) {
                                    addView.showMessage("Add new Account successfully!");
                                    addView.clearTextField();
                                    System.out.println(accDAO.search(data.getAccName()));
                                } else
                                    addView.showMessage("Add new Account Failed: Account is exist!");
                            }
                        }
                    }
                });

                // Add ActionListener For Back Button in Account Add View
                addView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        addView.dispose();
                    }
                });
            }
        });

        // Add ActionListener For Remove Button in Account Manager View
        accMngView.addDeleteButtonListener(new ActionListener() {
            String input = "";
            Account a;

            @Override
            public void actionPerformed(ActionEvent ae) {
                // Make Remove Account View visible
                showRemoveAccountView();
                // Add ActionListener For Search Button in Remove Account View
                removeView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // Check empty input
                        input = removeView.getData().equals("Username") ? "" : removeView.getData();
                        if (input.equals(""))
                            removeView.showMessage("Username cannot be empty!");
                        else {
                            // Search Account and show Account's information
                            a = accDAO.search(input);
                            if (a == null)
                                removeView.setNullTextField();
                            else
                                removeView.setTextFieldValue(a);
                        }
                    }
                });
                // Add ActionListener For Remove Button in Remove Account View
                removeView.addDeleteButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // check empty input and not exist Account
                        input = removeView.getData().equals("Username") ? "" : removeView.getData();
                        if (input.equals(""))
                            removeView.showMessage("Username cannot be empty!");
                        else {
                            a = accDAO.search(input);
                            // Remove Account
                            if (!accDAO.delete(a))
                                removeView.showMessage("Delete Account Failed: Account is not found!");
                            else {
                                removeView.showMessage("Delete Account Successfully!");
                                removeView.clearTextField();
                            }

                        }
                    }
                });
                // Add ActionListener For Back Button in Remove Account View
                removeView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        removeView.dispose();
                    }
                });
            }
        });

        // Add ActionListener For Update Button in Account Manager View
        accMngView.addUpdateButtonListener(new ActionListener() {
            String input = "";
            Account a, newAccount;

            @Override
            public void actionPerformed(ActionEvent ae) {
                // Make Update Account View visible
                showUpdateAccountView();
                // Add ActionListener For Search Button in Update Account View
                updateView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // Check empty input
                        input = updateView.getData().equals("Username") ? "" : updateView.getData();
                        if (input.equals(""))
                            updateView.showMessage("Username cannot be empty!");
                        else {
                            // Search Account and show Account's information
                            a = accDAO.search(input);
                            if (a == null)
                                updateView.setNullTextField();
                            else
                                updateView.setTextFieldValue(a);
                        }
                    }
                });

                // Add ActionListener For Update Button in Update Account View
                updateView.addUpdateButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // Check empty input and not exist account
                        input = updateView.getData().equals("Username") ? "" : updateView.getData();
                        if (input.equals(""))
                            updateView.showMessage("Username cannot be empty!");
                        else {
                            if (a == null)
                                if (accDAO.search(input) != null) {
                                    // User doesn't change anything
                                    updateView.showMessage("Update Account Successfully!");
                                    updateView.clearTextField();
                                } else
                                    updateView.showMessage("Update Account Failed: Account is not found!");
                            else {
                                // Check New Account information
                                newAccount = updateView.getNewAccount();
                                if (!MyTool.validPassword(newAccount.getPwd(), 8))
                                    updateView.showMessage("Invalid Account Password!");
                                else if (!(newAccount.getRole().equals("ACC-1")
                                        || newAccount.getRole().equals("ACC-2")
                                        || newAccount.getRole().equals("BOSS")))
                                    updateView.showMessage("Invalid Role: Must be [ACC-1] / [ACC-2] / [BOSS]");
                                else { // Update New Account
                                    if (!accDAO.delete(newAccount))
                                        updateView.showMessage("Update Account Failed!");
                                    else {
                                        updateView.showMessage("Update Account Successfully!");
                                        updateView.clearTextField();
                                    }
                                }
                            }
                        }
                    }
                });
                // Add ActionListener For Back Button in Update Account View
                updateView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        updateView.dispose();
                    }
                });
            }
        });

        // Add Actionlistener For Search Button in Account Manager View
        accMngView.addSearchButtonListener(new ActionListener() {
            String input = "";
            Account a;

            @Override
            public void actionPerformed(ActionEvent ae) {
                // Make Search Account View visible
                showSearchAccountView();
                // Add ActionListener For Search Button in Search Account View
                searchView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // check empty input
                        input = searchView.getData().equals("Username") ? "" : searchView.getData();
                        if (input.equals(""))
                            searchView.showMessage("Username cannot be empty!");
                        else {
                            // Search Account and show Account's information
                            a = accDAO.search(input);
                            if (a == null)
                                searchView.setNullTextField();
                            else
                                searchView.setTextFieldValue(a);
                        }
                    }
                });
                // Add ActionListener For Back Button in Search Account View
                searchView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        searchView.dispose();
                    }
                });
            }
        });
        // Add ActionListener For Print All Button in Account Manager View
        accMngView.addPrintAllButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Account> list = accDAO.getList();
                // Make Account List View visible
                showListAllAccountView(list);

                // Add ActionListener For Back Button in Account List View
                listView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        listView.dispose();
                    }
                });
            }
        });
        // Add ActionListener For Save Button in Account Manager View
        accMngView.addSaveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Save Account list to file
                ArrayList<Account> list = accDAO.getList();
                if (MyTool.writeFile(fileName, list))
                    accMngView.showMessage("Save to file successfully!");
                else
                    accMngView.showMessage("Save to file Failed!");
            }
        });
    }

    public void showAccMngView() {
        accMngView.setVisible(true);
    }

    public void exitByDispose() {
        accMngView.setDefaultCloseOperation(addView.DISPOSE_ON_CLOSE);
    }

    // Inner functions
    private void showAddAccountView() {
        addView = new AddAccountView();
        addView.setVisible(true);

    }

    private void showRemoveAccountView() {
        removeView = new RemoveAccountView();
        removeView.setVisible(true);

    }

    private void showUpdateAccountView() {
        updateView = new UpdateAccountView();
        updateView.setVisible(true);

    }

    private void showSearchAccountView() {
        searchView = new SearchAccountView();
        searchView.setVisible(true);

    }

    private void showListAllAccountView(ArrayList<Account> list) {
        listView = new AccountListView(list);
        listView.setVisible(true);
    }
}
