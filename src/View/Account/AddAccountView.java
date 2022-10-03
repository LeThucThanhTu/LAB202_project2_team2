
package View.Account;

import Model.Entity.Account;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddAccountView extends javax.swing.JFrame {

    public AddAccountView() {
        super("Add Account");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pwdField = new javax.swing.JTextField();
        usrField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        roleField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(930, 490, 220, 280);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Add New Account");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 110, 410, 50);

        pwdField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        pwdField.setForeground(new java.awt.Color(204, 204, 204));
        pwdField.setText("Password");
        pwdField.setBorder(null);
        jPanel2.add(pwdField);
        pwdField.setBounds(140, 340, 530, 70);

        usrField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        usrField.setForeground(new java.awt.Color(204, 204, 204));
        usrField.setText("user");
        usrField.setBorder(null);
        jPanel2.add(usrField);
        usrField.setBounds(150, 220, 520, 60);

        addButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 153, 153));
        addButton.setText("Add Account");
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setFocusPainted(false);
        addButton.setFocusable(false);
        jPanel2.add(addButton);
        addButton.setBounds(430, 675, 250, 50);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        jPanel2.add(backButton);
        backButton.setBounds(130, 675, 250, 50);

        roleField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        roleField.setForeground(new java.awt.Color(204, 204, 204));
        roleField.setText("Role");
        roleField.setBorder(null);
        jPanel2.add(roleField);
        roleField.setBounds(140, 460, 530, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(760, -30, 420, 810);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(120, 210, 570, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(120, 330, 570, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(120, 450, 570, 90);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(420, 670, 270, 0);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(120, 670, 270, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(420, 670, 260, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(130, 670, 260, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
    
    public void addBackButtonListener(ActionListener listener) {
        backButton.addActionListener(listener);
    }
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public Account getData() {
        String accName = usrField.getText();
        String accPwd = pwdField.getText();
        String role = roleField.getText();
        Account a = new Account(accName, accPwd, role);
        System.out.println(a);
        return a;
    }
    
    public void clearTextField() {
        usrField.setText("User");
        pwdField.setText("Password");
        roleField.setText("Role");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pwdField;
    private javax.swing.JTextField roleField;
    private javax.swing.JTextField usrField;
    // End of variables declaration//GEN-END:variables
}
