package View.Account;

import Model.Entity.Account;
import Model.Entity.Dealer;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class RemoveAccountView extends javax.swing.JFrame {

    public RemoveAccountView() {
        super("Remove Account");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        pwdField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        roleField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setText("UserName");
        nameField.setBorder(null);
        jPanel1.add(nameField);
        nameField.setBounds(290, 390, 240, 40);

        pwdField.setEditable(false);
        pwdField.setBackground(new java.awt.Color(255, 255, 255));
        pwdField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        pwdField.setForeground(new java.awt.Color(153, 153, 153));
        pwdField.setText("PassWord");
        pwdField.setBorder(null);
        jPanel1.add(pwdField);
        pwdField.setBounds(290, 490, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 220, 250);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Remove Account");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 90, 380, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 380, 270, 60);

        inputField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        inputField.setForeground(new java.awt.Color(204, 204, 204));
        inputField.setText("Username");
        inputField.setBorder(null);
        jPanel1.add(inputField);
        inputField.setBounds(450, 180, 530, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 160, 570, 110);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("UserName");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(140, 380, 120, 60);

        roleField.setEditable(false);
        roleField.setBackground(new java.awt.Color(255, 255, 255));
        roleField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        roleField.setForeground(new java.awt.Color(153, 153, 153));
        roleField.setText("Role");
        roleField.setBorder(null);
        jPanel1.add(roleField);
        roleField.setBounds(780, 390, 240, 40);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("PassWord");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(140, 490, 140, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 480, 270, 60);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Role");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(690, 390, 70, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg2.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-340, -290, 1010, 770);

        deleteButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(153, 153, 153));
        deleteButton.setText("Remove");
        deleteButton.setBorder(null);
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setFocusPainted(false);
        deleteButton.setFocusable(false);
        jPanel1.add(deleteButton);
        deleteButton.setBounds(610, 610, 250, 50);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        jPanel1.add(backButton);
        backButton.setBounds(320, 610, 250, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(770, 380, 270, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(310, 610, 270, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(600, 610, 270, 60);

        searchButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(153, 153, 153));
        searchButton.setText("Search");
<<<<<<< HEAD
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setFocusPainted(false);
        searchButton.setFocusable(false);
        jPanel1.add(searchButton);
        searchButton.setBounds(590, 280, 250, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(580, 280, 270, 60);
=======
        jPanel1.add(searchButton);
        searchButton.setBounds(610, 270, 250, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(600, 270, 270, 60);
>>>>>>> 0d0b0cb4182744f2c10a6ac4d9632fb75b955864

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }
    
    public void addBackButtonListener(ActionListener listener) {
        backButton.addActionListener(listener);
    }
    
    public void addDeleteButtonListener (ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
    public String getData() {
        return inputField.getText();
    }
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void setTextFieldValue(Account d) {
        nameField.setText(d.getAccName());
        pwdField.setText(d.getPwd());
        roleField.setText(d.getRole());
    }
    
    public void setNullTextField() {
        nameField.setText("NULL");
        pwdField.setText("NULL");
        roleField.setText("NULL");
    }
    
    public void clearTextField() {
        nameField.setText("UserName");
        pwdField.setText("Password");
        roleField.setText("Role");
        inputField.setText("Username");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameField;
<<<<<<< HEAD
    private javax.swing.JTextField phoneField;
=======
    private javax.swing.JTextField pwdField;
    private javax.swing.JTextField roleField;
>>>>>>> 0d0b0cb4182744f2c10a6ac4d9632fb75b955864
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
