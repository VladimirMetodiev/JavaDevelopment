package graphical.studyAWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CreateWindow {
    public static void main (String[] args) {
        Frame myFirstJavaWindow = new Frame("This is my first Java window! Hurrah!");

        myFirstJavaWindow.setSize(360, 240);

        myFirstJavaWindow.setLocation(380, 180);

        /* Създавам събитие - затваряне на прозореца */
        myFirstJavaWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });

        myFirstJavaWindow.setVisible(true);

        /*
         * С класът Frame създавам обект (прозорец).
         * С методът .setSize() - задавам широчината и височината на прозореца, като аргументи на метода.
         * С методът .setLocation() - задавам положението на прозореца върху екрана, като координати в пиксели, на
         * горният ляв ъгъл на прозореца, спрямо горният ляв ъгъл на екрана.
         * С методът .setVisible(), обекта (прозорец) се извежда на екрана.
         * Методът .addWindowListener() се използва за регистриране на обработчик на събития за класът WindowEvent.
         * Клас WindowEvent - събития свързани с прозорец.
         */
    }
}
