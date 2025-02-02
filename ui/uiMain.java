package ui;

import java.awt.event.*;
import javax.swing.*;
import ui.student.uiStudentRegister;

public class uiMain{
    // Declare JFrame and components
    static JFrame frame;
    JButton button1, button2, button3;
    boolean isVisible = true;
    
    public uiMain() {
        frame = new JFrame("Student Registration");
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
                System.out.println("hi");
                new uiStudentRegister();
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


    public static void isVisible(boolean val){
        frame.setVisible(val);
    }
}