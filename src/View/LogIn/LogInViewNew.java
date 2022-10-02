
package View.LogIn;

public class LogInViewNew extends javax.swing.JFrame {

    public LogInViewNew() {
        initComponents();
//        setSize(Toolkit.getDefaultToolkit().getScreenSize());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame = new javax.swing.JPanel();
        usrField = new javax.swing.JTextField();
        pwdField = new javax.swing.JPasswordField();
        usrFrame = new javax.swing.JLabel();
        pwdFrame = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        title3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        forgotUsrButton = new javax.swing.JButton();
        button = new javax.swing.JButton();
        forgotPwdButton = new javax.swing.JButton();
        showBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        frame.setBackground(new java.awt.Color(255, 255, 255));
        frame.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        frame.setLayout(null);

        usrField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        usrField.setForeground(new java.awt.Color(204, 204, 204));
        usrField.setText("Email or Phone");
        usrField.setBorder(null);
        frame.add(usrField);
        usrField.setBounds(110, 350, 530, 60);

        pwdField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        pwdField.setBorder(null);
        frame.add(pwdField);
        pwdField.setBounds(110, 480, 530, 60);

        usrFrame.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\Rectangle 1.png")); // NOI18N
        frame.add(usrFrame);
        usrFrame.setBounds(90, 340, 562, 85);

        pwdFrame.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\Rectangle 1.png")); // NOI18N
        frame.add(pwdFrame);
        pwdFrame.setBounds(90, 470, 562, 85);

        title.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\My project (4).png")); // NOI18N
        frame.add(title);
        title.setBounds(190, 90, 340, 70);

        title2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 58)); // NOI18N
        title2.setForeground(new java.awt.Color(102, 102, 102));
        title2.setText("Sign in");
        frame.add(title2);
        title2.setBounds(270, 150, 181, 78);

        title3.setFont(new java.awt.Font("Tw Cen MT", 0, 40)); // NOI18N
        title3.setForeground(new java.awt.Color(179, 180, 182));
        title3.setText("Use your group2 account");
        frame.add(title3);
        title3.setBounds(160, 230, 397, 45);
        frame.add(jLabel1);
        jLabel1.setBounds(640, 510, 0, 0);

        forgotUsrButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        forgotUsrButton.setForeground(new java.awt.Color(66, 133, 244));
        forgotUsrButton.setText("Forgot email?");
        forgotUsrButton.setBorder(null);
        frame.add(forgotUsrButton);
        forgotUsrButton.setBounds(90, 430, 109, 25);

        button.setIcon(new javax.swing.ImageIcon("C:\\Users\\lethu\\OneDrive\\Desktop\\Code_Java\\LAB202_project2_team2\\src\\View\\icon\\Group 2.png")); // NOI18N
        button.setBorder(null);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });
        frame.add(button);
        button.setBounds(530, 630, 123, 55);

        forgotPwdButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        forgotPwdButton.setForeground(new java.awt.Color(66, 133, 244));
        forgotPwdButton.setText("Forget Password?");
        forgotPwdButton.setBorder(null);
        frame.add(forgotPwdButton);
        forgotPwdButton.setBounds(90, 650, 147, 25);

        showBox.setBackground(new java.awt.Color(255, 255, 255));
        showBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        showBox.setForeground(new java.awt.Color(102, 102, 102));
        showBox.setText("Show Passoword");
        showBox.setBorder(null);
        frame.add(showBox);
        showBox.setBounds(90, 580, 159, 25);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(frame, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JButton forgotPwdButton;
    private javax.swing.JButton forgotUsrButton;
    private javax.swing.JPanel frame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pwdField;
    private javax.swing.JLabel pwdFrame;
    private javax.swing.JCheckBox showBox;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JTextField usrField;
    private javax.swing.JLabel usrFrame;
    // End of variables declaration//GEN-END:variables
}
