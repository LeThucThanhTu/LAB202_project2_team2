/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Delivery;

import Model.Entity.Delivery;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author letu
 */
public class SearchDeliveryView extends javax.swing.JFrame {

    /**
     * Creates new form SearchDealerViewNew
     */
    public SearchDeliveryView() {
        super("Search Delivery");
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        searchButtton = new javax.swing.JButton();
        pdNameField = new javax.swing.JTextField();
        deliveryIDField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        cusAddrField = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        jPanel1.add(backButton);
        backButton.setBounds(290, 610, 250, 50);

        searchButtton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        searchButtton.setForeground(new java.awt.Color(153, 153, 153));
        searchButtton.setText("Search");
        searchButtton.setBorder(null);
        searchButtton.setBorderPainted(false);
        searchButtton.setContentAreaFilled(false);
        searchButtton.setFocusPainted(false);
        searchButtton.setFocusable(false);
        searchButtton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButttonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButtton);
        searchButtton.setBounds(620, 610, 250, 50);

        pdNameField.setEditable(false);
        pdNameField.setBackground(new java.awt.Color(255, 255, 255));
        pdNameField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        pdNameField.setForeground(new java.awt.Color(153, 153, 153));
        pdNameField.setText("Name");
        pdNameField.setBorder(null);
        jPanel1.add(pdNameField);
        pdNameField.setBounds(290, 390, 240, 40);

        deliveryIDField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        deliveryIDField.setForeground(new java.awt.Color(204, 204, 204));
        deliveryIDField.setText("Delivery ID");
        deliveryIDField.setBorder(null);
        jPanel1.add(deliveryIDField);
        deliveryIDField.setBounds(450, 180, 530, 70);

        addressField.setEditable(false);
        addressField.setBackground(new java.awt.Color(255, 255, 255));
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
        addressField.setBounds(840, 390, 240, 40);

        cusAddrField.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(cusAddrField);
        cusAddrField.setBounds(830, 380, 270, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 220, 250);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Search Delivery");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 80, 450, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 380, 270, 60);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 160, 570, 110);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Product name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 380, 180, 60);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Customer Address");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(610, 390, 210, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg2.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-340, -290, 1010, 770);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(280, 610, 270, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(610, 610, 270, 60);

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

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void searchButttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButttonActionPerformed

    public void addBackButtonListener(ActionListener listener) {
        backButton.addActionListener(listener);
    }
    
    public void addSearchButtonListener(ActionListener listener) {
        searchButtton.addActionListener(listener);
    }
    
    public void setTextFieldValue(Delivery delivery) {
        pdNameField.setText(delivery.getProductName());
        cusAddrField.setText(delivery.getCusAddress());
    }
    
    public void setNullTextField() {
        pdNameField.setText("NULL");
        addressField.setText("NULL");
    }
    
    public String getData() {
        return deliveryIDField.getText();
    }
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cusAddrField;
    private javax.swing.JTextField deliveryIDField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pdNameField;
    private javax.swing.JButton searchButtton;
    // End of variables declaration//GEN-END:variables
}
