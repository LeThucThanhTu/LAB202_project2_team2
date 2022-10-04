
package Controller;

import Model.DAO.AccountDAO;
import View.LogIn.BossView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;

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

        // add dealer button listener in boss view
        bossView.addDealerButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });

        // add delivery button listener in boss view
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
