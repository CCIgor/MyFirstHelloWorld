package com.example.helloworld;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCloud {
    private JPanel panelMain;
    private JButton myButton;

/*    public WordCloud() {
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });
    }
*/

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainFrame");
        frame.setTitle("Word Cloud");
        frame.setSize(1000, 620);
        frame.setResizable(false);
        frame.setLocation(50, 50);
        frame.setVisible(true);
    }
}
