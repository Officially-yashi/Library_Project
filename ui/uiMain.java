package ui;

import java.awt.event.*;
import javax.swing.*;
import ui.student.indexUIStudent;

public class uiMain{
    // Declare JFrame and components
    static JFrame mainFrame;
    JButton adminButton, studentButton, exiButton;
    boolean isVisible = true;
    
    public uiMain() {
        mainFrame = new JFrame("Simple Frame");
        mainFrame.setSize(500, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        adminButton = new JButton("Admin Panel");
        studentButton = new JButton("Student Panel");
        exiButton = new JButton("Exit");


        adminButton.setBounds(100, 50, 200, 40);
        studentButton.setBounds(100, 100, 200, 40);
        exiButton.setBounds(100, 150, 200, 40);



        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Admin Panel button clicked");
            }
        });

        studentButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.setVisible(false);
                new indexUIStudent();
            }
        });

        exiButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose(); // Close the application
            }
        });

        mainFrame.add(adminButton);
        mainFrame.add(studentButton);
        mainFrame.add(exiButton);
        mainFrame.setVisible(true);
    }

    public static void isVisible(boolean val){
        mainFrame.setVisible(val);
    }

}