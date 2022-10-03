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
        
        // add account button listener in boss view
        bossView.addAccountButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                accMngView = new AccountMngView();
                accCtrl = new AccountController(accMngView);
                accCtrl.showAccMngView();
                accCtrl.exitByDispose();
            }
        });
        
        //add dealer button listener in boss view
        bossView.addDealerButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dealerMngView = new DealerMngView();
                dealerMngCtrl = new DealerMngController(dealerMngView);
                dealerMngCtrl.showDealerMngView();
                dealerMngCtrl.exitByDispose();
            }
        });
        
        //add delivery button listener in boss view
        bossView.addDeliveryButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
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
