package graphical.studySwing;

import javax.swing.*;
import java.awt.*;

public class SimpleLabel {
    SimpleLabel() {
        JFrame frame = new JFrame();                                    // Създавам рамка
        frame.setTitle("A Simple Swing Application");                   // Поставям заглавие
        frame.setSize(360, 120);                                // Поставям размери на рамката
        frame.setLocation(300, 300);                                    // Определям местоположението
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);      // Определям как да се затвори

        Font newFont = new Font(Font.MONOSPACED, Font.BOLD, 30);        // Създавам шрифт (за етикета)

        JLabel myLabel = new JLabel();                          // Създавам етикет
        myLabel.setText(" >>> I'm Vladimir.");                    // Поставям надпис
        myLabel.setForeground(Color.green);                      // Определям цветът на надписа (етикета)
        myLabel.setFont(newFont);                                // Задавам шрифта на етикета
        //myLabel.setHorizontalAlignment(JLabel.CENTER);          // Подравнявам етикета в центъра

        frame.add(myLabel, BorderLayout.CENTER);                 // Добавям етикета на рамката и едновременно с това определям, как да се позиционира етикета вътре в рамката

        frame.setVisible(true);                                 // Рамката може да се визуализира на екрана
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SimpleLabel();
            }
        });
    }
}
