package ui.student;

import java.awt.event.*;
import javax.swing.*;
import ui.uiMain;
import services.studentService;
import models.Student;

public class indexUIStudent {

    // Declare JFrame and components
    static JFrame frame;
    JButton button1, button2, backButton;

    public indexUIStudent() {

        frame = new JFrame("Student Registration");
        // Initialize buttons
        button1 = new JButton("Register Yourself");
        button2 = new JButton("Get Student Details");

        backButton = new JButton("Back");

        // Set button positions
        backButton.setBounds(400, 20, 70, 40);
        button1.setBounds(100, 50, 200, 40);
        button2.setBounds(100, 100, 200, 40);

        // Add components to frame
        frame.add(button1);
        frame.add(button2);
        frame.add(backButton);

        // Set frame properties
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Register yourself button
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                new uiStudentRegister();
            }
        });

        // Get Student Details Button
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //get student details
                System.out.println("stuents details are:");
                frame.dispose();
                JFrame getstudentFrame = new JFrame();
                getstudentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                getstudentFrame.setSize(500, 300);
                getstudentFrame.setLayout(null);
                getstudentFrame.setVisible(true);

                JTextArea studentDetails = new JTextArea();
                studentDetails.setBounds(50, 50, 400, 200);

                StringBuilder details = new StringBuilder();
                Student student = studentService.getStudent(1);

                if (student != null) {
                    details.append("Student found: ").append(student.name).append(" branch: ").append(student.branch).append("\n");
                } else {
                    details.append("No student found!");
                }

                studentDetails.setText(details.toString());

                getstudentFrame.add(studentDetails);
            }
        });

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // calling the isVisible methdo in the uiMain class
                uiMain.isVisible(true);
                frame.dispose();
            }
        });
    }

    public static void isVisible(boolean val) {
        frame.setVisible(val);
    }
}
