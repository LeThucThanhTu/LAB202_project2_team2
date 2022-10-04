package Controller;

import Lib.MyTool;
import Model.DAO.DealerDAO;
import Model.Entity.Config;
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
    private String fileName = new Config().getDealerFile();

    public DealerMngController(DealerMngView view) {
        this.dealerMngView = view;
        dealerDAO = DealerDAO.getInstance();

        // Add ActionListener For Add Button in Dealer Management View
        dealerMngView.addAddButtonListener(new ActionListener() {
            Dealer d;
            ArrayList<String> data; // {0: ID, 1: name, 2: address, 3: phone, 4: continuing}

            @Override
            public void actionPerformed(ActionEvent ae) {
                // show Add Dealer view
                showAddDealerView();
                // add Add Button Listener in Add Dealer View
                addView.addAddButtonListener(new ActionListener() {
                    boolean valid = true;

                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        data = addView.getData();
                        // Checking is there any empty field
                        String id = data.get(0).equals("ID") ? "" : data.get(0);
                        String name = data.get(1).equals("Name") ? "" : data.get(1);
                        String addr = data.get(2).equals("Address") ? "" : data.get(2);
                        String phone = data.get(3).equals("Phone") ? "" : data.get(3);
                        String cont = data.get(4);
                        if (id.equals("")
                                || name.equals("")
                                || addr.equals("")
                                || phone.equals(""))
                            addView.showMessage("Please fill in all field!");
                        else {
                            // Validating input
                            if (dealerDAO.search(data.get(0)) != null)
                                addView.showMessage("Invalid Dealer ID: Dealer ID is exist!");
                            else if (!MyTool.validStr(data.get(0), Dealer.ID_FORMAT))
                                addView.showMessage("Invalid ID format!");
                            else if (!MyTool.validStr(data.get(3), Dealer.PHONE_FORMAT))
                                addView.showMessage("Invalid phone number format!" + data.get(3));
                            else {
                                // String format: "ID,name,address,phone,continuing"
                                String s = data.get(0)
                                        + Dealer.SEPARATOR
                                        + data.get(1)
                                        + Dealer.SEPARATOR
                                        + data.get(2)
                                        + Dealer.SEPARATOR
                                        + data.get(3)
                                        + Dealer.SEPARATOR
                                        + data.get(4);
                                d = new Dealer(s);
                                // Add new Dealer
                                if (dealerDAO.add(d)) {
                                    addView.showMessage("Add new Dealer successfully!");
                                    addView.clearTextField();
                                } else
                                    addView.showMessage("Add new Dealer Failed: Dealer is exist!");
                            }
                        }
                    }
                });
                // Add ActionListener For Back Button in Add Dealer View
                addView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        addView.dispose();
                    }
                });
            }
        });
        // Add ActionListener For Remove Button in Dealer Management View
        dealerMngView.addDeleteButtonListener(new ActionListener() {
            Dealer d;
            String input = "";

            @Override
            public void actionPerformed(ActionEvent ae) {
                // Make Remove Dealer View visible
                showRemoveDealerView();
                // Add ActionListener For Search Button in Remove Dealer view
                removeView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // check empty input
                        input = removeView.getData().equals("ID") ? "" : removeView.getData();
                        if (input.equals(""))
                            removeView.showMessage("ID cannot be empty!");
                        else {
                            // Search Dealer and show Dealer's information
                            d = dealerDAO.search(input);
                            if (d == null)
                                removeView.setNullTextField();
                            else
                                removeView.setTextFieldValue(d);
                        }
                    }
                });
                // Add ActionListener For Remove Button in Remove Dealer view
                removeView.addDeleteButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // Check empty input and not exist Dealer
                        input = removeView.getData().equals("ID") ? "" : removeView.getData();
                        if (input.equals(""))
                            removeView.showMessage("ID cannot be empty!");
                        else {
                            d = dealerDAO.search(input);
                            // Remove Dealer
                            if (!dealerDAO.delete(d))
                                removeView.showMessage("Delete Dealer Failed: Dealer is not found!");
                            else {
                                removeView.showMessage("Delete Dealer Successfully!");
                                removeView.clearTextField();
                            }
                        }
                    }
                });
                // Add Actionlistener For Back Button in Delete Dealer view
                removeView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        removeView.dispose();
                    }
                });

            }
        });
        // Add ActionListener For Search Button in Dealer Management View
        dealerMngView.addSearchButtonListener(new ActionListener() {
            Dealer d;
            String input = "";

            @Override
            public void actionPerformed(ActionEvent ae) {
                showSearchDealerView();

                // add ActionListener for Search Button in Search Dealer view
                searchView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // Check empty input
                        input = searchView.getIDData().equals("ID") ? "" : searchView.getIDData();
                        if (input.equals(""))
                            searchView.showMessage("ID cannot be empty!");
                        else {
                            // Search Dealer and show Dealer's information
                            d = dealerDAO.search(input);
                            if (d == null)
                                searchView.setNullTextField();
                            else
                                searchView.setTextFieldValue(d);
                        }
                    }
                });

                // Add Actionlistener For Back Button in Search Dealer View
                searchView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        searchView.dispose();
                    }
                });
            }
        });
        // Add ActionListener For Update Button in Dealer Manager View
        dealerMngView.addUpdateButtonListener(new ActionListener() {
            Dealer d, newDealer;
            String input = "";

            @Override
            public void actionPerformed(ActionEvent ae) {
                // Make Update Dealer View visible
                showUpdateDealerView();
                // Add ActionListener For Search Button in Update Dealer view
                updateView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // Check empty input
                        input = updateView.getIDData().equals("ID") ? "" : updateView.getIDData();
                        if (input.equals(""))
                            updateView.showMessage("ID cannot be empty!");
                        else {
                            // Search Dealer and show Dealer's information
                            d = dealerDAO.search(input);
                            if (d == null)
                                updateView.setNullTextField();
                            else
                                updateView.setTextFieldValue(d);
                        }
                    }
                });

                // Add ActionListener For Update Button in Update Dealer view
                updateView.addUpdateButton(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        // Check empty input and not exist Dealer
                        input = updateView.getIDData().equals("ID") ? "" : updateView.getIDData();
                        if (input.equals(""))
                            updateView.showMessage("ID cannot be empty!");
                        else {
                            if (d == null)
                                // User doesn't change any data
                                if (dealerDAO.search(input) != null)
                                    updateView.showMessage("Update Dealer Successfully!");
                                else
                                    updateView.showMessage("Update Dealer Failed: Dealer is not found!");
                            else {
                                // Validating new Dealer information
                                newDealer = updateView.getNewDealer();
                                if (newDealer.getName().equals("")
                                        || newDealer.getAddr().equals("")
                                        || newDealer.getPhone().equals("")
                                        || (newDealer.getContinuing() + "").equals(""))
                                    updateView.showMessage("Please fill in all fields!"); // check empty field
                                else if (!MyTool.validStr(newDealer.getPhone(), Dealer.PHONE_FORMAT))
                                    updateView.showMessage("Invalid phone number format!"); // check valid new phone
                                                                                            // number
                                else {
                                    // Update Dealer
                                    if (!dealerDAO.update(newDealer))
                                        updateView.showMessage("Update Dealer Failed: Dealer is not found!");
                                    else {
                                        updateView.showMessage("Update Dealer Successfully!");
                                        updateView.clearTextField();
                                    }
                                }
                            }
                        }
                    }
                });

                // Add Actionlistener For Back Button in Update Dealer view
                updateView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        updateView.dispose();
                    }
                });
            }
        });
        // Add ActionListener For Print All Button in Dealer Manager View
        dealerMngView.addPrintAllButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Dealer> list = dealerDAO.getList();
                showListDealerView(list);
                listView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        listView.dispose();
                    }
                });
            }
        });

        // Add ActionListener For Print Continuing Button in Dealer Manager View
        dealerMngView.addPrintContButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Dealer> list = dealerDAO.getList();
                ArrayList<Dealer> result = new ArrayList();
                for (int i = 0; i < list.size(); i++)
                    if (list.get(i).getContinuing())
                        result.add(list.get(i));
                showListDealerView(result);
                listView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        listView.dispose();
                    }
                });
            }
        });
        // Add ActionListener For Print Uncontinuing Button in Dealer Manager View
        dealerMngView.addPrintUnContButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Dealer> list = dealerDAO.getList();
                ArrayList<Dealer> result = new ArrayList();
                for (int i = 0; i < list.size(); i++)
                    if (!list.get(i).getContinuing())
                        result.add(list.get(i));
                showListDealerView(result);
                listView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        listView.dispose();
                    }
                });
            }
        });
        // Add ActionListener For Save Button in Dealer Manager View
        dealerMngView.addSaveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Dealer> list = dealerDAO.getList();
                if (MyTool.writeFile(fileName, list))
                    dealerMngView.showMessage("Save to file successfully!");
                else
                    dealerMngView.showMessage("Save to file Failed!");
            }
        });
    }

    public void showDealerMngView() {
        dealerMngView.setVisible(true);
    }

    public void exitByDispose() {
        dealerMngView.setDefaultCloseOperation(dealerMngView.DISPOSE_ON_CLOSE);
    }

    // Inner functions
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

    private void showListDealerView(ArrayList<Dealer> list) {
        listView = new DealerListView(list);
        listView.setVisible(true);
    }
}
