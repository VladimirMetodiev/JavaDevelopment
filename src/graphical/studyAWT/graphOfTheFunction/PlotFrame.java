package graphical.studyAWT.graphOfTheFunction;

import java.awt.*;
import java.awt.event.*;

public class PlotFrame extends Frame {
    public PlotFrame(int h, int w) {
        setTitle("Graph of the function");
        setBounds(100, 50, h, w);
        setBackground(Color.GRAY);
        setResizable(false);
        setLayout(null);

        //setIconImage(getToolkit().getImage("pictures\\icon.png"));

        Font myFont = new Font("Ariel", Font.BOLD, 11);
        setFont(myFont);

        ButtonPanel buttonPanel = new ButtonPanel(6, 25, w / 4, h - 30);
        add(buttonPanel);

        PlotPanel plotPanel = new PlotPanel(w / 4 + 10, 25, 3 * w / 4 - 15, h - 120, buttonPanel);
        add(plotPanel);

        HelpPanel helpPanel = new HelpPanel(w / 4 + 10, w - 90, 3 * w / 4 - 15, 85);
        add(helpPanel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        buttonPanel.button1.addActionListener(new ButtonOneHandler(buttonPanel, plotPanel));
        buttonPanel.button2.addActionListener(new ButtonTwoHandler());
        buttonPanel.checkboxes[3].addItemListener(new CheckboxHandler(buttonPanel));

        setVisible(true);
    }
}
