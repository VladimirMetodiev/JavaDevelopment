package graphical.studyAWT.windowWithButton;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowWithButton extends Frame {
    private int count = 0;
    private String text = "Press the \"Number\" button: ";

    public WindowWithButton(int x, int y) {
        super();
        setTitle("Test window");
        setBounds(x, y, 300, 200);                              // Разположение и размери на прозореца [вместо .seSize() и .stLocation()]
        setResizable(false);                                    // .setResizable() - прозорец с фиксирани размери
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {      // WindowEvent - обработчик на събитието
                System.exit(0);
            }
        });
        setLayout(null);                                        // В задачата разположението на компонентите се указва ръчно, затова в метода .setLayout() пиша null, вместо да поставя референция към обектът на мениджър на разположението

        Font myFont = new Font(Font.DIALOG, Font.BOLD|Font.ITALIC, 13);     // Създавам обект на шрифт
        setFont(myFont);

        Panel myPanel = new Panel();                                    // Създавам обект - Panel
        myPanel.setBounds(10, 30, 280, 120);        // Разположение и размери на панела
        myPanel.setBackground(Color.LIGHT_GRAY);
        myPanel.setLayout(new BorderLayout());                          // Задавам за панела мениджър на оформлението

        Label myLabel = new Label(text + count);                            // Създавам обект - Label
        myLabel.setAlignment(Label.CENTER);                             // Задавам подравняване на текста към центъра
        myLabel.setForeground(Color.BLUE);                              // Задавам цвят

        myPanel.add(myLabel, BorderLayout.CENTER);              // Добавям етикетът в панела, като го разполагам в центъра
        add(myPanel);                                           // Добавям панела в прозорецът

        Button left = new Button("Close");                        // Създавам обект - Button [като аргумент на конструктора задавам името на бутона]
        left.setBounds(40, 155, 90, 30);            // Разположение и размери на бутона
        left.addActionListener(e -> System.exit(0));                // Добавям събитие
        add(left);                                                      // Добавям бутона на прозореца

        Button right = new Button("Number");                    // Създавам втори обект - Button
        right.addActionListener(new ActionListener() {                  // Създавам обработчик на събитие, за вторият бутон, на базата на анонимен клас
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if(count == 21) {
                    right.setEnabled(false);                        // С методът .setEnabled() и аргумент false правя бутонът неактивен
                    myLabel.setText("Great, you are dumb and stubborn!");
                }
                else {
                    myLabel.setText(text + count);
                }
            }
        });
        right.setBounds(170, 155, 90, 30);
        add(right);                                                 // Добавям вторият бутон на прозореца

        setVisible(true);                                           // С .setVisible() и аргумент true, при стартиране на програмата, извеждам прозорецът на екрана
    }
}
