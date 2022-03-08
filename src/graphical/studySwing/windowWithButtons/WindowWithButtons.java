package graphical.studySwing.windowWithButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowWithButtons extends JFrame {
    private int count = 0;
    private String text = "Press the \"Number\" button: ";

    public WindowWithButtons(int x, int y){
        super();
        setTitle("Test window");
        setBounds(x, y, 310, 210);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        Font font = new Font(Font.SANS_SERIF, Font.BOLD|Font.ITALIC, 14);
        //setFont(font);

        JPanel jPanel = new JPanel();
        jPanel.setBounds(10, 10, 275, 120);
        jPanel.setBackground(Color.LIGHT_GRAY);
        jPanel.setLayout(new BorderLayout());

        JLabel jLabel = new JLabel(text + count);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setForeground(Color.BLUE);
        jLabel.setFont(font);

        jPanel.add(jLabel, BorderLayout.CENTER);
        add(jPanel);

        Font fontOfButtons = new Font(Font.MONOSPACED, Font.BOLD, 13);

        JButton close = new JButton("Close");
        close.setBounds(30, 135, 100, 30);
        close.setFont(fontOfButtons);
        close.addActionListener(e -> System.exit(0));
        add(close);

        JButton number = new JButton("Number");
        number.setFont(fontOfButtons);
        number.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if(count == 21) {
                    number.setEnabled(false);
                    jLabel.setText("Great, you are dumb and stubborn!");
                }
                else {
                    jLabel.setText(text + count);
                }
            }
        });
        number.setBounds(170, 135, 100, 30);
        add(number);

        setVisible(true);
    }
}
