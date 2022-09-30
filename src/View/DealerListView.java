/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author this pc
 */
public class DealerListView {
    private static JLabel title, user, password;
    private static JTextField usrField;
    private static JPasswordField pwdField;
    private static JButton button;
    private static JCheckBox showPwd;
    private static JCheckBox rememberPwd;
    private static JPanel panel;

    public DealerListView() {
        initComponents();
    }

    private void initComponents() {
        panel = new JPanel();
        panel.setLayout(null);

        title = new JLabel("Log In", SwingConstants.CENTER);
        title.setFont(new Font("Fira Code NF", 3, 68));
        title.setBounds(300, 10, 350, 120);
        panel.add(title);

        user = new JLabel("Username");
        user.setFont(new Font("Fira Code NF", 1, 18));
        user.setBounds(300, 150, 100, 20);
        panel.add(user);

        usrField = new JTextField();
        usrField.setBounds(400, 150, 300, 28);
        panel.add(usrField);

        password = new JLabel("Password");
        password.setFont(new Font("Fira Code NF", 1, 18));
        password.setBounds(300, 200, 100, 20);
        panel.add(password);

        pwdField = new JPasswordField(15);
        pwdField.setBounds(400, 200, 300, 28);
        panel.add(pwdField);

        showPwd = new JCheckBox("Show password?");
        showPwd.setBounds(580, 230, 150, 20);
        panel.add(showPwd);

        rememberPwd = new JCheckBox("Remember me?");
        rememberPwd.setBounds(300, 330, 150, 20);
        panel.add(rememberPwd);

        button = new JButton("LOG IN");
        button.setFont(new Font("Fira Code NF", 1, 18));
        button.setBounds(300, 280, 400, 50);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String args[]) {
        LogInView frame = new LogInView();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Dealer Menugit");
        frame.setLocation(new Point(300, 200));
        frame.setSize(1000, 500);
        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
