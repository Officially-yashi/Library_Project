package ui.student;

import java.awt.event.*;
import javax.swing.*;
import ui.student.indexUIStudent;

public class uiStudentRegister {

    // Declare JFrame and components
    JFrame studentFrame;
    JButton submit, backButton;
    JTextField inputName;
    JTextField inputBranch;

    public uiStudentRegister() {
        // Initialize frame
        studentFrame = new JFrame();
        inputName = new JTextField();
        inputBranch = new JTextField();

        backButton = new JButton("Back");
        backButton.setBounds(400, 20, 70, 40);
        studentFrame.add(backButton);

        submit = new JButton("submit");

        JLabel nameLabel = new JLabel("Enter your name");
        JLabel branchLabel = new JLabel("Enter your branch");

        nameLabel.setBounds(50, 50, 150, 30);
        branchLabel.setBounds(50, 100, 150, 30);
        inputName.setBounds(180, 50, 200, 30);
        inputBranch.setBounds(180, 100, 200, 30);
        submit.setBounds(200, 150, 100, 30);

        studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studentFrame.setSize(500, 300);
        studentFrame.setLayout(null);
        studentFrame.setVisible(true);

        studentFrame.add(nameLabel);
        studentFrame.add(inputName);
        studentFrame.add(branchLabel);
        studentFrame.add(inputBranch);
        studentFrame.add(submit);

        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                indexUIStudent.isVisible(true);
                studentFrame.dispose();
            }
        });
    }

}
