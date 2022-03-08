package graphical.studySwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SimpleCheckBox {
    SimpleCheckBox(){
        JFrame frameOfTheCheckBox = new JFrame("Check box");
        frameOfTheCheckBox.setBounds(300, 200, 260, 80);
        frameOfTheCheckBox.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font fontOfCheckBox = new Font(Font.SANS_SERIF, Font.BOLD, 15);

        JCheckBox jCheckBox = new JCheckBox();
        jCheckBox.setFont(fontOfCheckBox);
        jCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
        jCheckBox.setText(" Simple check box");
        frameOfTheCheckBox.add(jCheckBox);

        jCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(jCheckBox.isSelected()) {
                    jCheckBox.setForeground(Color.BLUE);
                    jCheckBox.setText(" Check");
                }
                else {
                    jCheckBox.setForeground(Color.RED);
                    jCheckBox.setText(" Uncheck");
                }
            }
        });

        frameOfTheCheckBox.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleCheckBox();
            }
        });
    }
}
