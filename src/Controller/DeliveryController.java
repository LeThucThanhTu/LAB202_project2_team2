package Controller;

import Model.DAO.DeliveryDAO;
import View.Delivery.DeliveryMngView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeliveryController {
    private DeliveryMngView deliveryMngView;
    private DeliveryDAO deliveryDAO;
    
    public DeliveryController(DeliveryMngView view) {
        this.deliveryMngView = view;
        deliveryDAO = new DeliveryDAO();
        deliveryMngView.addAddButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Add");
            }
        });
        
        deliveryMngView.addDeleteButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Delete");
            }
        });
        
        deliveryMngView.addPrintAllButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Print all");
            }
        });
        
        deliveryMngView.addSaveButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Save");
            }
        });
        
        deliveryMngView.addSearchButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Search");
            }
        });
        
        deliveryMngView.addUpdateButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Update");
            }
        });
    }
    
    public void showDeliveryMngView() {
        deliveryMngView.setVisible(true);
    }
}
