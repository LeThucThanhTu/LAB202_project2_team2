package Controller;

import Lib.MyTool;
import Model.DAO.DeliveryDAO;
import Model.Entity.Config;
import Model.Entity.Delivery;
import View.Delivery.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DeliveryMngController {
    private DeliveryMngView deliveryMngView;
    private DeliveryDAO deliveryDAO;
    private AddDeliveryView addView;
    private RemoveDeliveryView removeView;
    private SearchDeliveryView searchView;
    private UpdateDeliveryView updateView;
    private DeliveryListView listView;
    private String fileName = new Config().getDeliveryFile();
    
    public DeliveryMngController(DeliveryMngView view) {
        this.deliveryMngView = view;
        deliveryDAO = new DeliveryDAO();
        
        //Add ActionListener For Add Button in Delivery Manager View
        deliveryMngView.addAddButtonListener(new ActionListener() {
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Make Add View visible
                showAddDeliveryView();
                //Add ActionListener For Add Button in Add Delivery View
                addView.addAddButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        delivery = addView.getData();
                        //Check empty input
                        String deliveryID = delivery.getDeliveryID().equals("Delivery ID") ? "" : delivery.getDeliveryID();
                        String pdName = delivery.getProductName().equals("Product Name") ? "" : delivery.getProductName();
                        String cusAddr = delivery.getCusAddress().equals("Customer Address") ? "" : delivery.getCusAddress();
                        if (deliveryID.equals("") || pdName.equals("") || cusAddr.equals("")) {
                            addView.showMessage("Please fill in all fields!");
                        }else {
                            //Validating input
                            if (deliveryDAO.search(deliveryID) !=  null) addView.showMessage("Invalid Delivery ID: Delivery ID is Exist!");
                            else {
                                //Add Delivery
                                if (deliveryDAO.add(delivery)) {
                                    addView.showMessage("Add new Delivery successfully!");
                                }else addView.showMessage("Add new Delivery Failed!");
                            }
                        }
                    }
                });
                //Add ActionListener For Back Button in Add Delivery View
                addView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        addView.dispose();
                    }
                });
            }
        });
        
        //Add ActionListener For Remove Button in Delivery Manager View
        deliveryMngView.addDeleteButtonListener(new ActionListener() {
            String input = "";
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Make Remove View visible
                showRemoveDeliveryView();
                //Add ActionListener For Search Button in Remove Delivery View
                removeView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        //Check empty input
                        input = removeView.getData().equals("Delivery ID") ? "" : removeView.getData();
                        if (input.equals("")) removeView.showMessage("Delivery ID cannot be empty!");
                        else {
                            //Search Delivery and show Delivery's information
                            delivery = deliveryDAO.search(input);
                            if (delivery == null) removeView.setNullTextField();
                            else removeView.setTextFieldValue(delivery);
                        }
                    }
                });
                //Add ActionListener For Remove Button in Remove Delivery View
                removeView.addRemoveButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        //Check empty input and not exist Delivery
                        input = removeView.getData().equals("Delivery ID") ? "" : removeView.getData();
                        if (input.equals("")) removeView.showMessage("Delivery ID cannot be empty!");
                        else {
                            delivery = deliveryDAO.search(input);
                            //Remove Delivery
                            if (deliveryDAO.delete(delivery)) removeView.showMessage("Remove Delivery Successfully!");
                            else removeView.showMessage("Remove Delivery Failed: Delivery is not found!");
                        }
                    }
                });
                
                //Add ActionListener For Back Button in Remove Delivery View
                removeView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        removeView.dispose();
                    }
                });
            }
        });
        
        //Add ActionListener For Print All Button in Delivery Manager View
        deliveryMngView.addPrintAllButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Delivery> list = deliveryDAO.getList();
                showDeliveryListView(list);
                listView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        listView.dispose();
                    }
                });
            }
        });
        
        //Add ActionListener For Save Button in Delivery Manager View
        deliveryMngView.addSaveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Delivery> list = deliveryDAO.getList();
                if (MyTool.writeFile(fileName, list)){
                    deliveryMngView.showMessage("Save to file successfully!");
                }else deliveryMngView.showMessage("Save to file Failed!");
            }
        });
        
        //Add ActionListener For Search Button in Delivery Manager View
        deliveryMngView.addSearchButtonListener(new ActionListener() {
            String input = "";
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Make Search View visible
                showSearchDeliveryView();
                //Add ActionListener For Search Button in Search Delivery View
                searchView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        //Check empty input
                        input = searchView.getData().equals("Delivery ID") ? "" : searchView.getData();
                        if (input.equals("")) searchView.showMessage("Delivery ID cannot be empty!");
                        else {
                            //Search Delivery and show Delivery's information
                            delivery = deliveryDAO.search(input);
                            if (delivery == null) searchView.setNullTextField();
                            else searchView.setTextFieldValue(delivery);
                        }
                    }
                });
                //Add ActionListener For Back Button in Search Delivery View
                searchView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        searchView.dispose();
                    }
                });
            }
        });
        
        //Add ActionListener For Update Button in Delivery Manager View
        deliveryMngView.addUpdateButtonListener(new ActionListener() {
            String input = "";
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Make Update View visible
                showUpdateDeliveryView();
                //Add ActionListener For Search Button in Udate Delivery View
                updateView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        //Check empty input
                        input = updateView.getData().equals("Delivery ID") ? "" : updateView.getData();
                        if (input.equals("")) updateView.showMessage("Delivery ID cannot be empty!");
                        else {
                            //Search Delivery and show Delivery's information
                            delivery = deliveryDAO.search(input);
                            if (delivery == null) updateView.setNullTextField();
                            else updateView.setTextFieldValue(delivery);
                        }
                    }
                });
                //Add ActionListener For Update Button in Update Delivery View
                updateView.addUpdateButtonListener(new ActionListener() {
                    String input = "";
                    Delivery delivery, newDelivery;
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        //Check empty input and not exist Delivery
                        input = updateView.getData().equals("Delivery ID") ? "" : updateView.getData();
                        if (input.equals("")) updateView.showMessage("Delivery ID cannot be empty!");
                        else {
                            if (delivery == null) {
                                if (deliveryDAO.search(input) != null) updateView.showMessage("Update Delivery Successfully!");
                                else updateView.showMessage("Update Delivery Failed: Delivery is not found!");
                            }else {
                                newDelivery = updateView.getNewData();
                                //Update Delivery
                                if (deliveryDAO.update(newDelivery)) {
                                    updateView.showMessage("Update Delivery Successfully!");
                                    updateView.clearTextField();
                                }
                                else updateView.showMessage("Update Delivery Failed: Delivery is not found!");
                            }
                            
                        }
                    }
                });
                //Add ActionListener For Back Button in Update Delivery View
                updateView.addBackButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        updateView.dispose();
                    }
                });
            }
        });
    }
    
    public void showDeliveryMngView() {
        deliveryMngView.setVisible(true);
    }
    
    private void showAddDeliveryView() {
        addView = new AddDeliveryView();
        addView.setVisible(true);
    }
    
    private void showRemoveDeliveryView() {
        removeView = new RemoveDeliveryView();
        removeView.setVisible(true);
    }
    
    private void showSearchDeliveryView() {
        searchView = new SearchDeliveryView();
        searchView.setVisible(true);
    }
    
    private void showUpdateDeliveryView() {
        updateView = new UpdateDeliveryView();
        updateView.setVisible(true);
    }
    
    private void showDeliveryListView(ArrayList<Delivery> list) {
        listView = new DeliveryListView(list);
        listView.setVisible(true);
    }
    
    public void exitByDispose() {
        deliveryMngView.setDefaultCloseOperation(deliveryMngView.DISPOSE_ON_CLOSE);
    }
}
