package ui;

import java.awt.event.*;
import javax.swing.*;

public class uiMain{
    // Declare JFrame and components
    protected static JFrame frame = new JFrame("Student Registration");;
    JButton button1, button2, button3;
    
    public uiMain() {

        // Initialize buttons
        button1 = new JButton("Register Yourself");
        button2 = new JButton("Get Student Details");
        button3 = new JButton("Exit");

        // Set button positions
        button1.setBounds(100, 50, 200, 40);
        button2.setBounds(100, 100, 200, 40);
        button3.setBounds(100, 150, 200, 40);


        // Add components to frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        
        // Set frame properties
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        // Register yourself button
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                // openRegistrationForm
            }
        });

        // Get Student Details Button
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Fetching Student Details...");
            }
        });
        
        // exit button
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the application
            }
        });
    }
}