package graphical.studyAWT.graphOfTheFunction;

import java.awt.*;

public class ButtonPanel extends Panel {
    public Label[] labels;
    public CheckboxGroup checkboxGroups;
    public Checkbox[] checkboxes;
    public Choice choice;
    public TextField textField;
    public Button button1, button2;

    public ButtonPanel(int x, int y, int w, int h){
        setLayout(null);
        setBounds(x, y, w, h);
        setBackground(Color.LIGHT_GRAY);

        labels = new Label[3];
        labels[0] = new Label("Color selection:", Label.CENTER);
        labels[0].setFont(new Font("Arial", Font.BOLD, 12));
        labels[0].setBounds(5, 5, getWidth() - 10, 30);
        add(labels[0]);

        checkboxGroups = new CheckboxGroup();
        checkboxes = new Checkbox[4];
        checkboxes[0] = new Checkbox(" red", checkboxGroups, true);
        checkboxes[1] = new Checkbox(" blue", checkboxGroups, false);
        checkboxes[2] = new Checkbox(" black", checkboxGroups, false);

        checkboxes[3] = new Checkbox(" grid ", true);

        for (int a = 0; a < 4; a++) {
            checkboxes[a].setBounds(5, 30 + a * 25, getWidth() - 10, 30);
            add(checkboxes[a]);
        }

        choice = new Choice();
        choice.add("Green");
        choice.add("Yellow");
        choice.add("Grey");
        choice.setBounds(20, 140, getWidth() - 25, 30);
        add(choice);

        labels[1] = new Label("Interval x:", Label.CENTER);
        labels[1].setFont(new Font("Arial", Font.BOLD, 12));
        labels[1].setBounds(5, 220, getWidth() - 10, 30);
        add(labels[1]);

        labels[2] = new Label("От х = 0 до х =", Label.LEFT);
        //labels[2].setFont(new Font("Arial", Font.BOLD, 12));
        labels[2].setBounds(5, 250, 70, 20);
        add(labels[2]);

        textField = new TextField("10");
        textField.setBounds(75, 250, 45, 20);
        add(textField);

        button1 = new Button("Draw");
        button1.setBounds(5, getHeight() - 75, getWidth() -10, 30);
        add(button1);

        button2 = new Button("Close");
        button2.setBounds(5, getHeight() - 35, getWidth() -10, 30);
        add(button2);
    }
}
