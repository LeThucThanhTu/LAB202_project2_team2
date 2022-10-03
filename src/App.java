
import Controller.BossController;
import Controller.DealerMngController;
import Controller.DeliveryMngController;
import Controller.LoginController;
import Model.Entity.Account;
import Model.Entity.LogIn;
import View.Dealer.DealerMngView;
import View.Delivery.DeliveryMngView;
import View.LogIn.BossView;
import View.LogIn.LogInView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author this pc
 */
public class App {
    
    public static void main(String[] args) {
        startProgram();
    }
    
    public static void startProgram() { 
        Account acc = LogIn.getInstance().getAccount();
        
        if (acc == null) {
            showLogInForm();
        }
        // blocking program until user is login
        do {
            acc = LogIn.getInstance().getAccount();
            System.out.print("");
        }while (acc == null);
        
        switch(acc.getRole()) {
            case "BOSS":
                showBossMngView();
                break;
            case "ACC-1":
                showDealerMngView();
                break;
            case "ACC-2":
                showDeliveriesMngView();
                break;
        }
    }
    
    private static void showLogInForm() {
        LogInView loginView = new LogInView();
        LoginController loginCtrl = new LoginController(loginView);
        loginCtrl.showLogInView();
    }
    
    private static void showBossMngView() {
        BossView bossView = new BossView();
        BossController bossCtrl = new BossController(bossView);
        bossCtrl.showBossView();
    }
    
    private static void showDealerMngView() {
        DealerMngView dealerMngView = new DealerMngView();
        DealerMngController dealerMngCtrl = new DealerMngController(dealerMngView);
        dealerMngCtrl.showDealerMngView();
    }
    
    private static void showDeliveriesMngView() {
        DeliveryMngView deliveryView = new DeliveryMngView();
        DeliveryMngController deliveryCtrl = new DeliveryMngController(deliveryView);
        deliveryCtrl.showDeliveryMngView();
    }
    
}
