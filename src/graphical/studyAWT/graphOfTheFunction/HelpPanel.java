package graphical.studyAWT.graphOfTheFunction;

import java.awt.*;

public class HelpPanel extends Panel {
    public Label label;
    public TextArea textArea;

    HelpPanel(int x, int y, int w, int h) {
        setBackground(Color.LIGHT_GRAY);
        setBounds(x, y, w, h);
        setLayout(null);

        label = new Label("INFORMATION", Label.CENTER);
        label.setBounds(0, 0, w, 20);
        add(label);

        textArea = new TextArea(" Graph of the function y(x) = (1 + sin(x))/(1 + |x|) ");
        textArea.setFont(new Font("Serif", Font.PLAIN, 15));
        textArea.setBounds(5, 20, w - 10, 60);
        textArea.setEditable(false);                                        // Областта е недостъпна за редактиране:
        add(textArea);
    }
}
