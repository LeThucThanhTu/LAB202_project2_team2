package View.Dealer;

import Model.Entity.Dealer;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class UpdateDealerView extends javax.swing.JFrame {

    public UpdateDealerView() {
        super("Dealer Update");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        isContField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        nameField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setText("Name");
        nameField.setBorder(null);
        jPanel1.add(nameField);
        nameField.setBounds(290, 390, 240, 40);

        phoneField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        phoneField.setForeground(new java.awt.Color(153, 153, 153));
        phoneField.setText("Phone");
        phoneField.setBorder(null);
        jPanel1.add(phoneField);
        phoneField.setBounds(290, 490, 240, 40);

        isContField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        isContField.setForeground(new java.awt.Color(153, 153, 153));
        isContField.setText("true/false");
        isContField.setBorder(null);
        isContField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isContFieldActionPerformed(evt);
            }
        });
        jPanel1.add(isContField);
        isContField.setBounds(780, 488, 240, 40);

        addressField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        addressField.setForeground(new java.awt.Color(153, 153, 153));
        addressField.setText("Address");
        addressField.setBorder(null);
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addressField);
        addressField.setBounds(780, 390, 240, 40);

        idField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        idField.setForeground(new java.awt.Color(204, 204, 204));
        idField.setText("ID");
        idField.setBorder(null);
        jPanel1.add(idField);
        idField.setBounds(450, 180, 530, 70);

        updateButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        updateButton.setForeground(new java.awt.Color(153, 153, 153));
        updateButton.setText("Update");
        updateButton.setBorder(null);
        updateButton.setBorderPainted(false);
        updateButton.setContentAreaFilled(false);
        updateButton.setFocusPainted(false);
        updateButton.setFocusable(false);
        jPanel1.add(updateButton);
        updateButton.setBounds(610, 610, 250, 50);

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

        searchButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(153, 153, 153));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setFocusPainted(false);
        searchButton.setFocusable(false);
        jPanel1.add(searchButton);
        searchButton.setBounds(620, 270, 250, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 220, 250);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Update Dealer");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 90, 480, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 380, 270, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 160, 570, 110);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 380, 110, 60);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Phone");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(180, 490, 110, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 480, 270, 60);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Address");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 390, 160, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg2.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-340, -290, 1010, 770);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(770, 380, 270, 60);

        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Continue");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(660, 490, 200, 32);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(770, 480, 264, 51);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(310, 610, 270, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(600, 610, 270, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(610, 270, 270, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void isContFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isContFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isContFieldActionPerformed

    public void addUpdateButton(ActionListener listener) {
        updateButton.addActionListener(listener);
    }
    
    public void addBackButtonListener(ActionListener listener) {
        backButton.addActionListener(listener);
    }
    
    public void addSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }
    
    public String getIDData() {
        return idField.getText();
    }
    
    public Dealer getNewDealer() {
        String name = nameField.getText();
        String addr = addressField.getText();
        String cont = isContField.getText();
        String phone = phoneField.getText();
        String id = idField.getText();
        String s = id + Dealer.SEPARATOR + name + Dealer.SEPARATOR + addr + Dealer.SEPARATOR 
                + phone + Dealer.SEPARATOR + cont;
        return new Dealer(s);
    }
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void setTextFieldValue(Dealer d) {
        nameField.setText(d.getName());
        addressField.setText(d.getAddr());
        isContField.setText(d.getContinuing() + "");
        phoneField.setText(d.getPhone());
    }
    
    public void setNullTextField() {
        nameField.setText("NULL");
        addressField.setText("NULL");
        isContField.setText("NULL");
        phoneField.setText("NULL");
    }
    
    public void clearTextField() {
        idField.setText("ID");
        nameField.setText("Name");
        addressField.setText("Address");
        isContField.setText("true/false");
        phoneField.setText("Phone");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField idField;
    private javax.swing.JTextField isContField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
