package View.Delivery;

public class DeliveryMngView extends javax.swing.JFrame {

    public DeliveryMngView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        printAllButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        frame.setBackground(new java.awt.Color(255, 255, 255));
        frame.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Delivery's Menu");
        frame.add(jLabel1);
        jLabel1.setBounds(660, 40, 270, 47);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        frame.add(title);
        title.setBounds(30, 220, 205, 234);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg.png"))); // NOI18N
        frame.add(jLabel2);
        jLabel2.setBounds(90, 0, 355, 730);

        printAllButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        printAllButton.setText("Print All Delivery");
        frame.add(printAllButton);
        printAllButton.setBounds(860, 145, 250, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel4);
        jLabel4.setBounds(850, 140, 260, 70);

        searchButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        searchButton.setText("Search Delivery");
        frame.add(searchButton);
        searchButton.setBounds(860, 250, 250, 60);

        deleteButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        deleteButton.setText("Remove Delivery");
        frame.add(deleteButton);
        deleteButton.setBounds(460, 250, 250, 60);

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jButton1.setText("Add new Delivery");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        frame.add(jButton1);
        jButton1.setBounds(460, 140, 250, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel5);
        jLabel5.setBounds(850, 250, 260, 70);

        updateButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        updateButton.setText("Update Delivery");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        frame.add(updateButton);
        updateButton.setBounds(459, 365, 250, 50);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setText("Back");
        frame.add(backButton);
        backButton.setBounds(670, 605, 250, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel6);
        jLabel6.setBounds(660, 600, 260, 70);

        saveButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        saveButton.setText("Save");
        frame.add(saveButton);
        saveButton.setBounds(860, 360, 250, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel7);
        jLabel7.setBounds(850, 350, 260, 70);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel8);
        jLabel8.setBounds(450, 360, 260, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel9);
        jLabel9.setBounds(450, 250, 260, 70);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel12);
        jLabel12.setBounds(450, 140, 260, 70);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel frame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton printAllButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
