package graphical.studySwing;

import javax.swing.*;

public class CreateWindow {
    public static void main(String[] args) {
        JFrame mySwingWindow = new JFrame("My Swing window");

        mySwingWindow.setSize(360, 240);

        mySwingWindow.setLocation(380, 180);

        mySwingWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        mySwingWindow.setVisible(true);

        /*
         * С класът JFrame създавам обект (прозорец)
         * С методът .setSize() - задавам широчината и височината на прозореца, като аргументи на метода
         * С методът .setLocation() - задавам положението на прозореца върху екрана
         * Метод .setDefaultCloseOperation() с аргумент EXIT_ON_CLOSE - затваря прозорецът и прекратява програмата
         * С методът .setVisible(), обекта (прозорец) се извежда на екрана
         */
    }
}
