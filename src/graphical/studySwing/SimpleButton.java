package graphical.studySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleButton {
    SimpleButton(){
        JFrame frame = new JFrame("Button");
        frame.setBounds(300, 180, 220, 80);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton();
        button.setFont(new Font("Courier New", Font.BOLD, 16));
        button.setForeground(Color.RED);
        button.setText("  Turn on  ");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if(event.getActionCommand().equals("  Turn on  ")){
                    button.setForeground(Color.blue);
                    button.setText(" Turn off ");
                }
                if(event.getActionCommand().equals(" Turn off ")){
                    button.setForeground(Color.RED);
                    button.setText("  Turn on  ");
                }
            }
        });

        frame.add(button);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleButton();
            }
        });
    }
}
