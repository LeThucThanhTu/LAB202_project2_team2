/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DAO.AccountDAO;
import View.LogIn.BossView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

/**
 *
 * @author this pc
 */
public class BossController {
    private BossView bossView;
    private AccountDAO accDAO;
    
    public BossController(BossView bossView) {
        this.bossView = bossView;
        accDAO = AccountDAO.getInstance();
        
        // add account button listener in boss view
        bossView.addAccountButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        //add dealer button listener in boss view
        bossView.addDealerButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
        //add delivery button listener in boss view
        bossView.addDeliveryButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
            }
        });
        
    }
    
    public void showBossView() {
        bossView.setVisible(true);
    }
}
