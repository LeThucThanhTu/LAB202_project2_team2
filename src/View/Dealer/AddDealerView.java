package View.Dealer;

public class AddDealerView extends javax.swing.JFrame {

    public AddDealerView() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addressField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        phoneField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        addressField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        addressField.setForeground(new java.awt.Color(204, 204, 204));
        addressField.setText("Address");
        addressField.setBorder(null);
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel2.add(addressField);
        addressField.setBounds(140, 540, 530, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\bg.png")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(760, -30, 420, 810);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\logo.png")); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(930, 490, 220, 280);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Add New Dealer");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(220, 60, 370, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\textFrame.png")); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 530, 570, 90);

        nameField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setText("Name");
        nameField.setBorder(null);
        jPanel2.add(nameField);
        nameField.setBounds(140, 290, 530, 70);

        idField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        idField.setForeground(new java.awt.Color(204, 204, 204));
        idField.setText("ID");
        idField.setBorder(null);
        jPanel2.add(idField);
        idField.setBounds(150, 170, 520, 60);

        addButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(153, 153, 153));
        addButton.setText("Add Dealer");
        jPanel2.add(addButton);
        addButton.setBounds(430, 675, 250, 50);

        phoneField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        phoneField.setForeground(new java.awt.Color(204, 204, 204));
        phoneField.setText("Phone");
        phoneField.setBorder(null);
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });
        jPanel2.add(phoneField);
        phoneField.setBounds(140, 412, 530, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\textFrame.png")); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(120, 160, 570, 90);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("Back");
        jPanel2.add(backButton);
        backButton.setBounds(130, 675, 250, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\textFrame.png")); // NOI18N
        jPanel2.add(jLabel6);
        jLabel6.setBounds(120, 280, 570, 90);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\textFrame.png")); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(120, 400, 570, 90);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\Rectangle 3.png")); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(420, 670, 270, 75);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\Rectangle 3.png")); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(120, 670, 270, 75);

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

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    // End of variables declaration//GEN-END:variables
}
