package com.example.demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MultipleChoice extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4;
    JLabel l;
    int score = 0;
    int count = 0;
    MultipleChoice() {
        l = new JLabel("What is the capital of India?");
        l.setBounds(50,50,300,20);
        add(l);
        b1 = new JButton("New Delhi");
        b1.setBounds(50,100,100,20);
        add(b1);
        b2 = new JButton("Mumbai");
        b2.setBounds(200,100,100,20);
        add(b2);
        b3 = new JButton("Kolkata");
        b3.setBounds(50,150,100,20);
        add(b3);
        b4 = new JButton("Chennai");
        b4.setBounds(200,150,100,20);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setSize(400,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            JOptionPane.showMessageDialog(this,"Correct Answer!");
            score++;
            count++;
            if(count == 10) {
                JOptionPane.showMessageDialog(this,"Your score is: " + score + "/10");
                dispose();
            }
            else {
                dispose();
                new MultipleChoice();
            }

        }
        if(e.getSource()==b2 || e.getSource()==b3 || e.getSource()==b4) {
            JOptionPane.showMessageDialog(this,"Wrong Answer!");
            count++;
            if(count == 10) {
                JOptionPane.showMessageDialog(this,"Your score is: " + score + "/10");
                dispose();
            }
            else {
                dispose();
                new MultipleChoice();
            }

        }
    }
    public static void main(String[] args) {
        new MultipleChoice();
    }
}