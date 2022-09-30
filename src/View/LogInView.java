package View;

import Controller.LoginController;
import Model.Entity.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogInView extends JFrame {
    private static JLabel logInTitle, usrTitle, pwdTitle;
    private static JTextField usrField;
    private static JPasswordField pwdField;
    private static JButton logInButton;
    private static JCheckBox showPwdBox;
    private static JPanel logInPanel;
    // static int x = 1000, y = 500;

    public LogInView() {
        initComponents();
    }

    private void initComponents() {
        logInPanel = new JPanel();
        logInPanel.setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        logInTitle = new JLabel("Log In", SwingConstants.CENTER);
        logInTitle.setFont(new Font("Fira Code NF", 3, 68));
        logInTitle.setBounds(300, 10, 350, 120);
        logInPanel.add(logInTitle);

        usrTitle = new JLabel("Username");
        usrTitle.setFont(new Font("Fira Code NF", 1, 18));
        usrTitle.setBounds(300, 150, 100, 20);
        logInPanel.add(usrTitle);

        usrField = new JTextField();
        usrField.setBounds(400, 150, 300, 28);
        logInPanel.add(usrField);

        pwdTitle = new JLabel("Password");
        pwdTitle.setFont(new Font("Fira Code NF", 1, 18));
        pwdTitle.setBounds(300, 200, 100, 20);
        logInPanel.add(pwdTitle);

        pwdField = new JPasswordField(15);
        pwdField.setBounds(400, 200, 300, 28);
        logInPanel.add(pwdField);

        logInButton = new JButton("LOG IN");
        logInButton.setFont(new Font("Fira Code NF", 1, 18));
        logInButton.setBounds(300, 250, 400, 50);
        logInPanel.add(logInButton);
        // logInButton.setBackground();
        logInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String args[]) {
        LogInView frame = new LogInView();
        frame.setTitle("Log In Page");
        frame.setLocation(new Point(300, 200));
        frame.add(logInPanel);
        frame.setSize(1000, 500);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
