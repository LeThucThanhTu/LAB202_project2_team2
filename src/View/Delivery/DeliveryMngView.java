package View.Delivery;

import java.awt.event.ActionListener;

public class DeliveryMngView extends javax.swing.JFrame {

    public DeliveryMngView() {
        super("Delivery Management");
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        printAllButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frame.setBackground(new java.awt.Color(255, 255, 255));
        frame.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Delivery's Menu");
        frame.add(jLabel1);
        jLabel1.setBounds(660, 40, 500, 47);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        frame.add(title);
        title.setBounds(30, 220, 205, 234);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg.png"))); // NOI18N
        frame.add(jLabel2);
        jLabel2.setBounds(90, 0, 355, 730);

        printAllButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        printAllButton.setText("Print All Delivery");
        printAllButton.setBorder(null);
        printAllButton.setContentAreaFilled(false);
        printAllButton.setFocusPainted(false);
        printAllButton.setFocusable(false);
        frame.add(printAllButton);
        printAllButton.setBounds(860, 145, 250, 50);

        searchButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        searchButton.setText("Search Delivery");
        searchButton.setBorder(null);
        searchButton.setContentAreaFilled(false);
        searchButton.setFocusPainted(false);
        searchButton.setFocusable(false);
        frame.add(searchButton);
        searchButton.setBounds(860, 250, 250, 60);

        deleteButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        deleteButton.setText("Remove Delivery");
        deleteButton.setBorder(null);
        deleteButton.setContentAreaFilled(false);
        deleteButton.setFocusPainted(false);
        deleteButton.setFocusable(false);
        frame.add(deleteButton);
        deleteButton.setBounds(460, 250, 250, 60);

        addButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        addButton.setText("Add new Delivery");
        addButton.setBorder(null);
        addButton.setContentAreaFilled(false);
        addButton.setFocusPainted(false);
        addButton.setFocusable(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        frame.add(addButton);
        addButton.setBounds(460, 140, 250, 60);

        updateButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        updateButton.setText("Update Delivery");
        updateButton.setBorder(null);
        updateButton.setContentAreaFilled(false);
        updateButton.setFocusPainted(false);
        updateButton.setFocusable(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        frame.add(updateButton);
        updateButton.setBounds(459, 365, 250, 50);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        frame.add(backButton);
        backButton.setBounds(670, 605, 250, 50);

        saveButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        saveButton.setText("Save");
        saveButton.setBorder(null);
        saveButton.setContentAreaFilled(false);
        saveButton.setFocusPainted(false);
        saveButton.setFocusable(false);
        frame.add(saveButton);
        saveButton.setBounds(860, 360, 250, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel4);
        jLabel4.setBounds(850, 140, 260, 70);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel5);
        jLabel5.setBounds(850, 250, 260, 70);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        frame.add(jLabel6);
        jLabel6.setBounds(660, 600, 260, 70);

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
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, 1216, Short.MAX_VALUE)
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

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    public void addAddButtonListener(ActionListener listener) {
        addButton.addActionListener(listener);
    }
    
    public void addDeleteButtonListener(ActionListener listener) {
        deleteButton.addActionListener(listener);
    }
    
    public void addSearchButtonListener(ActionListener listener) {
        searchButton.addActionListener(listener);
    }
    
    public void addPrintAllButtonListener(ActionListener listener) {
        printAllButton.addActionListener(listener);
    }
    
    public void addUpdateButtonListener(ActionListener listener) {
        updateButton.addActionListener(listener);
    }
    
    public void addSaveButtonListener(ActionListener listener) {
        saveButton.addActionListener(listener);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel frame;
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
