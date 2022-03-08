package graphical.studySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SimpleTextField {
    private ArrayList<String> expression = new ArrayList<>();

    SimpleTextField(){
        JFrame frame = new JFrame("Enter");
        frame.setSize(360, 140);
        frame.setLocation(340, 140);
        frame.setResizable(false);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 340, 60);
        panel.setBackground(Color.LIGHT_GRAY);

        frame.add(panel);


        JTextField text = new JTextField(15);
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(!text.getText().isEmpty()) {
                    expression.add(text.getText());
                    text.setText("");
                }
            }
        });


        JButton buttonAdd = new JButton("Add");
        buttonAdd.setForeground(Color.BLUE);
        buttonAdd.setFont(new Font("Courier New", Font.BOLD, 16));
        buttonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(event.getActionCommand().equals("Add")) {
                    expression.add(text.getText());
                    text.setText("");
                }
            }
        });


        JTextField visualization = new JTextField(" >>> Information ...");
        visualization.setHorizontalAlignment(SwingConstants.NORTH_EAST);
        visualization.setForeground(Color.DARK_GRAY);
        visualization.setFont(new Font("Courier New", Font.BOLD, 12));
        visualization.setPreferredSize(new Dimension(336, 40));


        JButton buttonPrint = new JButton("Print");
        buttonPrint.setForeground(Color.BLUE);
        buttonPrint.setFont(new Font("Courier New", Font.BOLD, 16));
        buttonPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder data = new StringBuilder();
                data.append(" >>> ");
                for (int a = 0; a < expression.size(); a++) {
                    if(a < expression.size() - 1) data.append(expression.get(a) + ", ");
                    else data.append(expression.get(a));
                }
                visualization.setText(data.toString());
            }
        });


        panel.add(text);
        panel.add(buttonAdd);
        panel.add(buttonPrint);
        frame.add(visualization);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleTextField();
            }
        });
    }
}
