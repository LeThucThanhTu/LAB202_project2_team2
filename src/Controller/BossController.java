/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.AccountDAO;
import View.Account.AccountMngView;
import View.Dealer.DealerMngView;
import View.Delivery.DeliveryMngView;
import View.LogIn.BossView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author this pc
 */
public class BossController {
    private BossView bossView;
    private AccountDAO accDAO;
    private AccountMngView accMngView;
    private AccountController accCtrl;
    private DealerMngController dealerMngCtrl;
    private DealerMngView dealerMngView;
    private DeliveryMngController deliveryCtrl;
    private DeliveryMngView deliveryMngView;
    
    
    public BossController(BossView bossView) {
        this.bossView = bossView;
        accDAO = AccountDAO.getInstance();
        
        // Add ActionListener For Account Button in Boss View
        bossView.addAccountButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Make Account Mangement View visible
                accMngView = new AccountMngView();
                accCtrl = new AccountController(accMngView);
                accCtrl.showAccMngView();
                accCtrl.exitByDispose();
            }
        });
        
        //Add ActionListener For Dealer Button in Boss View
        bossView.addDealerButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Make Dealer Management View visible
                dealerMngView = new DealerMngView();
                dealerMngCtrl = new DealerMngController(dealerMngView);
                dealerMngCtrl.showDealerMngView();
                dealerMngCtrl.exitByDispose();
            }
        });
        
        //Add ActionListener For Delivery Button in Boss View
        bossView.addDeliveryButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //Make Delivery Management View visible
                deliveryMngView = new DeliveryMngView();
                deliveryCtrl = new DeliveryMngController(deliveryMngView);
                deliveryCtrl.showDeliveryMngView();
                deliveryCtrl.exitByDispose();
            }
        });
        
    }
    
    public void showBossView() {
        bossView.setVisible(true);
    }
}
