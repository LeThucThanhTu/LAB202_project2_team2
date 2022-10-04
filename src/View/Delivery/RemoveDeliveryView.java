package View.Delivery;

import Model.Entity.Delivery;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class RemoveDeliveryView extends javax.swing.JFrame {

    public RemoveDeliveryView() {
        super("Remove Delivery");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        productNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deliveryIDField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cusAddrField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
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

        productNameField.setEditable(false);
        productNameField.setBackground(new java.awt.Color(255, 255, 255));
        productNameField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        productNameField.setForeground(new java.awt.Color(153, 153, 153));
        productNameField.setText("Name");
        productNameField.setBorder(null);
        jPanel1.add(productNameField);
        productNameField.setBounds(290, 390, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 220, 250);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Remove Delivery");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 90, 510, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 380, 270, 60);

        deliveryIDField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        deliveryIDField.setForeground(new java.awt.Color(204, 204, 204));
        deliveryIDField.setText("Delivery ID");
        deliveryIDField.setBorder(null);
        jPanel1.add(deliveryIDField);
        deliveryIDField.setBounds(450, 180, 530, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 160, 570, 110);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Product Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(110, 380, 180, 60);

        cusAddrField.setEditable(false);
        cusAddrField.setBackground(new java.awt.Color(255, 255, 255));
        cusAddrField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        cusAddrField.setForeground(new java.awt.Color(153, 153, 153));
        cusAddrField.setText("Address");
        cusAddrField.setBorder(null);
        cusAddrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cusAddrFieldActionPerformed(evt);
            }
        });
        jPanel1.add(cusAddrField);
        cusAddrField.setBounds(840, 390, 240, 40);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Customer Address");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(620, 390, 220, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg2.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-340, -290, 1010, 770);

        removeButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        removeButton.setForeground(new java.awt.Color(153, 153, 153));
        removeButton.setText("Remove");
        jPanel1.add(removeButton);
        removeButton.setBounds(610, 610, 250, 50);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("Back");
        jPanel1.add(backButton);
        backButton.setBounds(320, 610, 250, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(830, 380, 270, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(310, 610, 270, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(600, 610, 270, 60);

        searchButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(153, 153, 153));
        searchButton.setText("Search");
        jPanel1.add(searchButton);
        searchButton.setBounds(600, 270, 250, 50);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel15);
        jLabel15.setBounds(590, 270, 270, 60);

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

    private void cusAddrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cusAddrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cusAddrFieldActionPerformed

    public void addRemoveButtonListener(ActionListener listener) {
        removeButton.addActionListener(listener);
    }
    
    public void addBackButtonListener(ActionListener listener) {
        backButton.addActionListener(listener);
    }
    
    public void addSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }
    
    public void setTextFieldValue(Delivery delivery) {
        productNameField.setText(delivery.getProductName());
        cusAddrField.setText(delivery.getCusAddress());
    }
    
    public void setNullTextField() {
        productNameField.setText("NULL");
        cusAddrField.setText("NULL");
    }
    
    public String getData() {
        return deliveryIDField.getText();
    }
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cusAddrField;
    private javax.swing.JTextField deliveryIDField;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField productNameField;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
