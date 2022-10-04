/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Lib.MyTool;
import Model.DAO.AccountDAO;
import Model.Entity.Account;
import Model.Entity.Config;
import View.Account.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 *
 * @author this pc
 */
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
        
        accMngView.addAddButtonListener(new ActionListener (){
            Account data; 
            boolean valid = true;

            @Override
            public void actionPerformed(ActionEvent ae) {
                showAddAccountView();
                addView.addAddButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        data = addView.getData();
                        // Checking is there any empty field
                        if (data.getAccName().equals("") || data.getPwd().equals("") || data.getRole().equals("")){
                            valid = false;
                        }
                        if (!valid) addView.showMessage("Please fill in all field!");
                        else {
                            // Validating input
                            if (!MyTool.validPassword(data.getPwd(),8)) addView.showMessage("Invalid password! " + data.getPwd());
                            else {
                                System.out.println(data);
                                if (accDAO.add(data)) {
                                    addView.showMessage("Add new Account successfully!");
                                    addView.clearTextField();
                                    System.out.println(accDAO.search(data.getAccName()));
                                }
                                else addView.showMessage("Add new Account Failed: Account is exist!");
                            }
                        }
                    }
                });
                
                addView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        addView.dispose();
                    }
                });
            }
        });
        
        
        accMngView.addDeleteButtonListener(new ActionListener() {
            String input = "";
            Account a;
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                showRemoveAccountView();
                removeView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        input = removeView.getData().equals("Username") ? "" : removeView.getData();
                        if (input.equals("")) {
                            removeView.showMessage("Username cannot be empty!");
                        }else {
                            a = accDAO.search(input);
                            if (a == null) removeView.setNullTextField();
                            else removeView.setTextFieldValue(a);
                        }
                    }
                });
                
                removeView.addDeleteButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        if (input.equals("")) removeView.showMessage("Username cannot be empty!");
                        else if (a == null) removeView.showMessage("Delete Account Failed: Account is not found!");
                        else {
                            if (!accDAO.delete(a)) removeView.showMessage("Delete Account Failed: Account is not found!");
                            else {
                                removeView.showMessage("Delete Account Successfully!");
                                removeView.clearTextField();
                            }
                            
                        }
                    }
                });
                
                removeView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        removeView.dispose();
                    }
                });
            }
        });
        
        accMngView.addUpdateButtonListener(new ActionListener() {
            String input = "";
            Account a;
            @Override
            public void actionPerformed(ActionEvent ae) {
                showUpdateDealerView();
                updateView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        input = updateView.getData().equals("Username") ? "" : updateView.getData();
                        if (input.equals("")) {
                            updateView.showMessage("Username cannot be empty!");
                        }else {
                            a = accDAO.search(input);
                            if (a == null) updateView.setNullTextField();
                            else updateView.setTextFieldValue(a);
                        }
                    }
                });
                
                updateView.addUpdateButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        if (input.equals("")) removeView.showMessage("Username cannot be empty!");
                        else if (a == null) removeView.showMessage("Delete Account Failed: Account is not found!");
                        else {
                            if (!accDAO.delete(a)) removeView.showMessage("Delete Account Failed: Account is not found!");
                            else {
                                removeView.showMessage("Delete Account Successfully!");
                                removeView.clearTextField();
                            }
                            
                        }
                    }
                });
                
                updateView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        updateView.dispose();
                    }
                });
            }
        });
        
        accMngView.addSearchButtonListener(new ActionListener() {
            String input = "";
            Account a;
            @Override
            public void actionPerformed(ActionEvent ae) {
                showSearchAccountView();
                searchView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        input = searchView.getData().equals("Username") ? "" : searchView.getData();
                        if (input.equals("")) {
                            searchView.showMessage("Username cannot be empty!");
                        }else {
                            a = accDAO.search(input);
                            if (a == null) searchView.setNullTextField();
                            else searchView.setTextFieldValue(a);
                        }
                    }
                });
                
                searchView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        searchView.dispose();
                    }
                });
            }
        });
        
        accMngView.addPrintAllButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Account> list = accDAO.getList();
                showListAllAccountView(list);
                listView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        listView.dispose();
                    }
                });
            }
        });
        
        accMngView.addSaveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Account> list = accDAO.getList();
                if (MyTool.writeFile(fileName, list)){
                    accMngView.showMessage("Save to file successfully!");
                }else accMngView.showMessage("Save to file Failed!");
            }
        });
    }
    
    public void showAccMngView() {
        accMngView.setVisible(true);
    }
    
    public void exitByDispose() {
        accMngView.setDefaultCloseOperation(addView.DISPOSE_ON_CLOSE);
    }
    
    //    Inner functions
    private void showAddAccountView() {
        addView = new AddAccountView();
        addView.setVisible(true);
        
    }
    
    private void showRemoveAccountView() {
        removeView = new RemoveAccountView();
        removeView.setVisible(true);
        
    }
    
    private void showUpdateDealerView() {
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
