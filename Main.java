import java.awt.event.*;
import javax.swing.*;
import services.studentService;

class Main {
    public static void main(String args[]) {

        JFrame frame = new JFrame();

        JButton button1 = new JButton(" register yourself");
        JButton button2 = new JButton("Get Student details");
        JButton button3 = new JButton(" exit");

        // second frame variables
        JButton submit = new JButton();
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
                frame.dispose();
                JFrame studentFrame = new JFrame();
                
                JLabel nameLabel = new JLabel("Enter your name");
                JLabel branchLabel = new JLabel("Enter your branch");
                
                nameLabel.setBounds(50,50,150,30);
                branchLabel.setBounds(50,100,150,30);
                inputName.setBounds(200,50,200,30);
                inputBranch.setBounds(200,100,200,30);
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

            }
        });

        // New Frame button event listener
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name=inputName.getText();
                String branch=inputBranch.getText();
                studentService service = new studentService();
                service.putStudent(name, branch);
            }
        });


        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("stuents details are:");
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