import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import services.studentService;

class Main {
static List<String> studentList = new ArrayList<>();
    public static void main(String args[]) {

        JFrame frame = new JFrame();

        JButton button1 = new JButton(" register yourself");
        JButton button2 = new JButton("Get Student details");
        JButton button3 = new JButton(" exit");
       
        // second frame variables
        JButton submit = new JButton("Submit");
        JTextField inputName = new JTextField();
        JTextField inputBranch = new JTextField();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button1.setBounds(100, 50, 200, 40);
        button2.setBounds(100, 100, 200, 40);
        button3.setBounds(100, 150, 200, 40);
       

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
       
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Register Event
                frame.setVisible(false);
                JFrame studentFrame = new JFrame();
                
                JButton button4 = new JButton("Back");
                button4.setBounds(400, 20, 70, 40);
                studentFrame.add(button4);

                JLabel nameLabel = new JLabel("Enter your name");
                JLabel branchLabel = new JLabel("Enter your branch");
                
                nameLabel.setBounds(50,50,150,30);
                branchLabel.setBounds(50,100,150,30);
                inputName.setBounds(180,50,200,30);
                inputBranch.setBounds(180,100,200,30);
                submit.setBounds(200,150,100,30);

                studentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                studentFrame.setSize(500, 300);
                studentFrame.setLayout(null);
                studentFrame.setVisible(true);

                studentFrame.add(nameLabel);
                studentFrame.add(inputName);
                studentFrame.add(branchLabel);
                studentFrame.add(inputBranch);
                studentFrame.add(submit);

                button4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                       frame.setVisible(true);
                       studentFrame.dispose();
                    }
                });
        
        

        // New Frame button event listener
        submit.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                
                System.out.println("ActionListener added");
               
                String name=inputName.getText();
                String branch=inputBranch.getText();
                if (!name.isEmpty() && !branch.isEmpty()) {
                    studentList.add("Name: " + name + ", Branch: " + branch);
                    JOptionPane.showMessageDialog(studentFrame, "Student Registered Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(studentFrame, "Please fill all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                }
     
                System.out.println("button clicked");
                
            }
        }); 
            }
        });


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

                if (studentList.isEmpty()) {
                    studentDetails.setText("No student records found.");
                } else {
                    StringBuilder details = new StringBuilder();
                    for (String student : studentList) {
                        details.append(student).append("\n");
                    }
                    studentDetails.setText(details.toString());
                }

                getstudentFrame.add(studentDetails);
            }
        });
       

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

       
    }
}