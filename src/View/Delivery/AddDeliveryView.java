
package View.Delivery;

import Model.Entity.Delivery;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class AddDeliveryView extends javax.swing.JFrame {

    public AddDeliveryView() {
        super("Add Delivery");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        productNameField = new javax.swing.JTextField();
        deliveryIDField = new javax.swing.JTextField();
        usrAddrField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        jPanel2.add(backButton);
        backButton.setBounds(70, 630, 250, 50);

        addButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 153, 153));
        addButton.setText("Add Delivery");
        addButton.setBorder(null);
        addButton.setBorderPainted(false);
        addButton.setContentAreaFilled(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addButton.setFocusPainted(false);
        addButton.setFocusable(false);
        jPanel2.add(addButton);
        addButton.setBounds(370, 630, 250, 50);

        productNameField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        productNameField.setForeground(new java.awt.Color(204, 204, 204));
        productNameField.setText("Product Name");
        productNameField.setBorder(null);
        productNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(productNameField);
        productNameField.setBounds(80, 290, 530, 70);

        deliveryIDField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        deliveryIDField.setForeground(new java.awt.Color(204, 204, 204));
        deliveryIDField.setText("Delivery ID");
        deliveryIDField.setBorder(null);
        jPanel2.add(deliveryIDField);
        deliveryIDField.setBounds(90, 170, 520, 60);

        usrAddrField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        usrAddrField.setForeground(new java.awt.Color(204, 204, 204));
        usrAddrField.setText("Customer Address");
        usrAddrField.setBorder(null);
        usrAddrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrAddrFieldActionPerformed(evt);
            }
        });
        jPanel2.add(usrAddrField);
        usrAddrField.setBounds(80, 410, 530, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(700, -70, 420, 810);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(870, 440, 220, 280);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Add New Delivery");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(130, 50, 530, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(60, 160, 570, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 280, 570, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(60, 400, 570, 90);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(420, 670, 270, 0);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(120, 670, 270, 0);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jLabel4.setFocusable(false);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(370, 620, 280, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jLabel10.setFocusable(false);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(60, 620, 280, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usrAddrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrAddrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrAddrFieldActionPerformed

    private void productNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameFieldActionPerformed

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
    
    public void addBackButtonListener(ActionListener listener) {
        backButton.addActionListener(listener);
    }
    
    public Delivery getData() {
        String deliveryID = deliveryIDField.getText();
        String productName = productNameField.getText();
        String usrAddr = usrAddrField.getText();
        return new Delivery(deliveryID, productName, usrAddr);
    }
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField deliveryIDField;
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
    private javax.swing.JTextField productNameField;
    private javax.swing.JTextField usrAddrField;
    // End of variables declaration//GEN-END:variables
}
