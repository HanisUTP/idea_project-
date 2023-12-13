package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JLabel l1, l2;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1;
    JButton b2;

    Login() {
        setTitle("Login Form");
        setVisible(true);
        setSize(800, 800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Login Form");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));

        l2 = new JLabel("Username:");
        tf1 = new JTextField();
        pf2 = new JPasswordField();
        b1 = new JButton("Submit");
        b2 = new JButton("Clear");

        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        tf1.setBounds(300, 70, 200, 30);
        pf2.setBounds(300, 110, 200, 30);
        b1.setBounds(50, 160, 100, 30);
        b2.setBounds(170, 160, 100, 30);

        add(l1);
        add(l2);
        add(tf1);
        add(pf2);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae) {
        String uname = tf1.getText();
        String pass = pf2.getText();
        if (uname.equals("admin") && pass.equals("admin")) {
            /*
            SecondPage page = new SecondPage();
            page.setVisible(true);
            JLabel label = new JLabel("Welcome:" + uname);
            page.getContentPane().add(label);

             */
            dispose();
        } else {
            JOptionPane.showMessageDialog(this,"Incorrect login or password","Error",JOptionPane.ERROR_MESSAGE);
            tf1.setText("");
            pf2.setText("");
            tf1.requestFocus();
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
    }
}