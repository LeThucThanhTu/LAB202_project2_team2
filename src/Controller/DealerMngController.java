package Controller;

import Lib.MyTool;
import Model.DAO.DealerDAO;
import Model.Entity.Dealer;
import View.Dealer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DealerMngController {
    private DealerMngView dealerMngView;
    private AddDealerView addView;
    private RemoveDealerView removeView;
    private UpdateDealerView updateView;
    private SearchDealerView searchView;
    private DealerListView listView;
    private DealerDAO dealerDAO;
    public DealerMngController(DealerMngView view) {
        this.dealerMngView = view;
        dealerDAO = DealerDAO.getInstance();
        
        dealerMngView.addAddButtonListener(new ActionListener() {
            Dealer d;
            ArrayList<String> data; // {0: ID, 1: name, 2: address, 3: phone, 4: continuing}
            boolean valid = true;
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                //show Add Dealer view
                showAddDealerView();
                //add Add Button Listener in Add Dealer View
                addView.addAddButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        data = addView.getData();
                        // Checking is there any empty field
                        for (int i = 0; i < data.size(); i++){
                            System.out.println(data.get(i));
                            System.out.println(data.get(i).equals(""));
                            if (data.get(i).equals("")) valid = false;
                        }
                        if (!valid) addView.showMessage("Please fill in all field!");
                        else {
                            // Validating input
                            if (!MyTool.validStr(data.get(0), Dealer.ID_FORMAT)) addView.showMessage("Invalid ID format!");
                            else if (!MyTool.validStr(data.get(3), Dealer.PHONE_FORMAT)) addView.showMessage("Invalid phone number format!" + data.get(3));
                            else {
                                //String format: "ID,name,address,phone,continuing"
                                String s = data.get(0) + Dealer.SEPARATOR + data.get(1) + Dealer.SEPARATOR + data.get(2) +
                                        Dealer.SEPARATOR + data.get(3) + Dealer.SEPARATOR + data.get(4);
                                d = new Dealer(s);
                                System.out.println(d);
                                if (dealerDAO.add(d)) {
                                    addView.showMessage("Add new Dealer successfully!");
                                    addView.clearTextField();
                                }
                                else addView.showMessage("Add new Dealer Failed: Dealer is exist!");
                            }
                        }
                    }
                });
                //add Back Button Listener in Add Dealer View
                addView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        addView.dispose();
                    }
                });
            }
        });
        
        dealerMngView.addDeleteButtonListener(new ActionListener() {
            Dealer d;
            String data = "";
            boolean valid;
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                valid = true;
           
                // show Remove Dealer View
                showRemoveDealerView();
                
                // add ActionListener for Search Button in Delete Dealer view
                removeView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        data = removeView.getData().equals("ID") ? "" : removeView.getData();
                        if (data.equals("")) removeView.showMessage("ID cannot be empty!");
                        else {
                            d = dealerDAO.search(data);
                            if (d == null) removeView.setNullTextField();
                            else {
                                removeView.setTextFieldValue(d);
                            }
                        }
                    }
                });
                
                // add ActionListener for Delete Button in Delete Dealer view
                removeView.addDeleteButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        if (data.equals("")) removeView.showMessage("ID cannot be empty!");
                        else if (d == null) removeView.showMessage("Delete Dealer Failed: Dealer is not found!");
                        else {
                            if (!dealerDAO.delete(d)) removeView.showMessage("Delete Dealer Failed: Dealer is not found!");
                            else {
                                removeView.showMessage("Delete Dealer Successfully!");
                                removeView.clearTextField();
                            }
                            
                        }
                    }
                });
                
                //add Actionlistener for Back Button in Delete Dealer view
                removeView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        removeView.dispose();
                    }
                });
                
                
            }
        });
        
        dealerMngView.addSearchButtonListener(new ActionListener() {
            Dealer d;
            String data = "";
            boolean valid;
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                showSearchDealerView();
                
                // add ActionListener for Search Button in Search Dealer view
                searchView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        data = searchView.getIDData().equals("ID") ? "" : searchView.getIDData();
                        if (data.equals("")) searchView.showMessage("ID cannot be empty!");
                        else {
                            d = dealerDAO.search(data);
                            if (d == null) searchView.setNullTextField();
                            else {
                                searchView.setTextFieldValue(d);
                            }
                        }
                    }
                });
                
                //add Actionlistener for Back Button in Search Dealer view
                searchView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        searchView.dispose();
                    }
                });
            }
        });
        
        dealerMngView.addUpdateButtonListener(new ActionListener() {
            Dealer d;
            String data = "";
            boolean valid;
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                valid = true;
           
                // show Update Dealer View
                showUpdateDealerView();
                
                // add ActionListener for Search Button in Delete Dealer view
                updateView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        data = updateView.getIDData().equals("ID") ? "" : updateView.getIDData();
                        if (data.equals("")) updateView.showMessage("ID cannot be empty!");
                        else {
                            d = dealerDAO.search(data);
                            if (d == null) updateView.setNullTextField();
                            else {
                                updateView.setTextFieldValue(d);
                            }
                        }
                    }
                });
                
                // add ActionListener for Delete Button in Delete Dealer view
                updateView.addUpdateButton(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        if (data.equals("")) updateView.showMessage("ID cannot be empty!");
                        else if (d == null) updateView.showMessage("Update Dealer Failed: Dealer is not found!");
                        else {
                            d = updateView.getNewDealer();
                            if (d.getName().equals("") || d.getAddr().equals("") || d.getPhone().equals("") || (d.getContinuing() + "").equals("")){
                                updateView.showMessage("Please fill in all fields!"); //check empty field
                            }else if (MyTool.validStr(d.getPhone(), Dealer.PHONE_FORMAT)) updateView.showMessage("Invalid phone number format!"); //check valid new phone number
                            else {
                                //check update successfully or not
                                if (!dealerDAO.update(d)) updateView.showMessage("Update Dealer Failed: Dealer is not found!"); 
                                else {
                                    updateView.showMessage("Update Dealer Successfully!");
                                    updateView.clearTextField();
                                }
                            }
                        }
                    }
                });
                
                //add Actionlistener for Back Button in Delete Dealer view
                updateView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        updateView.dispose();
                    }
                });
            }
        });
        
        dealerMngView.addPrintAllButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                showListAllDealerView();
                
            }
        });
        
        dealerMngView.addPrintContButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                showListContDealerView();
            }
        });
        
        dealerMngView.addPrintUnContButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                showListUnContDealerView();
            }
        });
        
        dealerMngView.addSaveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Save");
            }
        });  
    }
    
    public void showDealerMngView() {
        dealerMngView.setVisible(true);
    }
    
//    Inner functions
    private void showAddDealerView() {
        addView = new AddDealerView();
        addView.setVisible(true);
        
    }
    
    private void showRemoveDealerView() {
        removeView = new RemoveDealerView();
        removeView.setVisible(true);
        
    }
    
    private void showUpdateDealerView() {
        updateView = new UpdateDealerView();
        updateView.setVisible(true);
        
    }
    
    private void showSearchDealerView() {
        searchView = new SearchDealerView();
        searchView.setVisible(true);
        
    }
    
    private void showListAllDealerView() {
        listView = new DealerListView();
        listView.setVisible(true);
        
    }
    
    private void showListContDealerView() {
        listView = new DealerListView();
        listView.setVisible(true);
        
    }
    
    private void showListUnContDealerView() {
        listView = new DealerListView();
        listView.setVisible(true);
        
    }
}
