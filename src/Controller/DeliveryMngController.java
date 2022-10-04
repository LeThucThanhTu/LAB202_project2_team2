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
        deliveryMngView.addAddButtonListener(new ActionListener() {
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                showAddDeliveryView();
                addView.addAddButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        delivery = addView.getData();
                        
                        String deliveryID = delivery.getDeliveryID().equals("Delivery ID") ? "" : delivery.getDeliveryID();
                        String pdName = delivery.getProductName().equals("Product Name") ? "" : delivery.getProductName();
                        String cusAddr = delivery.getCusAddress().equals("Customer Address") ? "" : delivery.getCusAddress();
                        if (deliveryID.equals("") || pdName.equals("") || cusAddr.equals("")) {
                            addView.showMessage("Please fill in all fields!");
                        }else {
                            if (deliveryDAO.add(delivery)) {
                                addView.showMessage("Add new Delivery successfully!");
                            }else addView.showMessage("Add new Delivery Failed!");
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
        
        deliveryMngView.addDeleteButtonListener(new ActionListener() {
            String input = "";
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                showRemoveDeliveryView();
                removeView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        input = removeView.getData().equals("Delivery ID") ? "" : removeView.getData();
                        if (input.equals("")) removeView.showMessage("Delivery ID cannot be empty!");
                        else {
                            delivery = deliveryDAO.search(input);
                            if (delivery == null) removeView.setNullTextField();
                            else removeView.setTextFieldValue(delivery);
                        }
                    }
                });
                removeView.addRemoveButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        if (input.equals("")) removeView.showMessage("Delivery ID cannot be empty!");
                        else if (delivery == null) removeView.showMessage("Remove Delivery Failed: Cannot find Delivery!");
                        else {
                            if (deliveryDAO.delete(delivery)) removeView.showMessage("Remove Delivery Successfully!");
                            else removeView.showMessage("Remove Delivery Failed!");
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
        
        deliveryMngView.addPrintAllButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Delivery> list = deliveryDAO.getList();
                showDeliveryListView(list);
            }
        });
        
        deliveryMngView.addSaveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                ArrayList<Delivery> list = deliveryDAO.getList();
                if (MyTool.writeFile(fileName, list)){
                    deliveryMngView.showMessage("Save to file successfully!");
                }else deliveryMngView.showMessage("Save to file Failed!");
            }
        });
        
        deliveryMngView.addSearchButtonListener(new ActionListener() {
            String input = "";
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                showSearchDeliveryView();
                searchView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        input = searchView.getData().equals("Delivery ID") ? "" : searchView.getData();
                        if (input.equals("")) searchView.showMessage("Delivery ID cannot be empty!");
                        else {
                            delivery = deliveryDAO.search(input);
                            if (delivery == null) searchView.setNullTextField();
                            else searchView.setTextFieldValue(delivery);
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
        
        deliveryMngView.addUpdateButtonListener(new ActionListener() {
            String input = "";
            Delivery delivery;
            @Override
            public void actionPerformed(ActionEvent ae) {
                showUpdateDeliveryView();
                removeView.addSearchButtonListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        input = updateView.getData().equals("Delivery ID") ? "" : updateView.getData();
                        if (input.equals("")) updateView.showMessage("Delivery ID cannot be empty!");
                        else {
                            delivery = deliveryDAO.search(input);
                            if (delivery == null) updateView.setNullTextField();
                            else updateView.setTextFieldValue(delivery);
                        }
                    }
                });
                updateView.addUpdateButtonListener(new ActionListener() {
                    String input = "";
                    Delivery delivery;
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        if (input.equals("")) updateView.showMessage("Delivery ID cannot be empty!");
                        else if (delivery == null) updateView.showMessage("Update Delivery Failed: Cannot find Delivery!");
                        else {
                            if (deliveryDAO.update(delivery)) {
                                updateView.showMessage("Update Delivery Successfully!");
                                updateView.clearTextField();
                            }
                            else updateView.showMessage("Update Delivery Failed!");
                        }
                    }
                });
                
                removeView.addBackButtonListener(new ActionListener() {
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
