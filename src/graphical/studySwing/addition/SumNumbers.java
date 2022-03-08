package graphical.studySwing.addition;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class SumNumbers {
    private double a = 0.0, b = 0.0;
    private JTextField theFirstTextField, theSecondTextField, theThirdTextField;

    public SumNumbers(){
        JFrame mathFrame = new JFrame("Addition");
        mathFrame.setSize(310, 210);
        mathFrame.setLocation(300, 200);
        mathFrame.setLayout(new FlowLayout());
        mathFrame.setResizable(false);
        mathFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel theFirst = new JPanel();
        theFirst.setBounds(10, 10, 300, 40);
        theFirst.setBackground(Color.LIGHT_GRAY);
        mathFrame.add(theFirst);

        JPanel theSecond = new JPanel();
        theSecond.setBounds(10, 10, 300, 40);
        theSecond.setBackground(Color.LIGHT_GRAY);
        mathFrame.add(theSecond);

        JPanel theThird = new JPanel();
        theThird.setBounds(10, 10, 300, 40);
        theThird.setBackground(Color.LIGHT_GRAY);
        mathFrame.add(theThird);

        JPanel theFourth = new JPanel();
        theFourth.setBounds(10, 10, 300, 40);
        theFourth.setBackground(Color.LIGHT_GRAY);
        mathFrame.add(theFourth);


        JLabel theFirstLabel = new JLabel("The first number");
        theFirstLabel.setSize(60, 40);
        theFirstLabel.setForeground(Color.BLUE);
        theFirst.add(theFirstLabel);

        theFirstTextField = new JTextField(9);
        theFirst.add(theFirstTextField);
        theFirstTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!theFirstTextField.getText().isEmpty()) {
                    a = Double.parseDouble(theFirstTextField.getText());
                }
                else {
                    a = 0.0;
                }
            }
        });

        JButton addTheFirstNumber = new JButton("Add");
        addTheFirstNumber.setForeground(Color.BLUE);
        theFirst.add(addTheFirstNumber);
        addTheFirstNumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!theFirstTextField.getText().isEmpty()) {
                    a = Double.parseDouble(theFirstTextField.getText());
                }
                else {
                    a = 0.0;
                }
            }
        });


        JLabel theSecondLabel = new JLabel("The second number ");
        theSecondLabel.setSize(60, 40);
        theSecondLabel.setForeground(Color.BLUE);
        theSecond.add(theSecondLabel);

        theSecondTextField = new JTextField(7);
        theSecond.add(theSecondTextField);
        theSecondTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!theSecondTextField.getText().isEmpty()) {
                    b = Double.parseDouble(theSecondTextField.getText());
                }
                else {
                    b = 0.0;
                }
            }
        });

        JButton addTheSecondNumber = new JButton("Add");
        addTheSecondNumber.setForeground(Color.BLUE);
        theSecond.add(addTheSecondNumber);
        addTheSecondNumber.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!theSecondTextField.getText().isEmpty()) {
                    b = Double.parseDouble(theSecondTextField.getText());
                }
                else {
                    b = 0.0;
                }
            }
        });


        JLabel theThirdLabel = new JLabel("Sum of numbers =");
        theThirdLabel.setSize(60, 40);
        theThirdLabel.setForeground(Color.BLUE);
        theThird.add(theThirdLabel);

        DecimalFormat df = new DecimalFormat("0.######");

        theThirdTextField = new JTextField(8);
        theThird.add(theThirdTextField);
        theThirdTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theThirdTextField.setText("" + df.format(a + b));
            }
        });

        JButton sum = new JButton("Sum");
        sum.setForeground(Color.BLUE);
        theThird.add(sum);
        sum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theThirdTextField.setText("" + df.format(a + b));
            }
        });


        JButton clean = new JButton("Clean");
        clean.setForeground(Color.BLUE);
        clean.setBounds(10, 10, 300, 40);
        theFourth.add(clean);
        clean.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = 0.0;
                b = 0.0;
                theFirstTextField.setText("");
                theSecondTextField.setText("");
                theThirdTextField.setText("");
            }
        });


        mathFrame.setVisible(true);
    }
}
