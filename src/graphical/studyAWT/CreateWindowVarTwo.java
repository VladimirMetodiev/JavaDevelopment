package graphical.studyAWT;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CreateWindowVarTwo {
    public static void main(String[] args) {
        MyFrame obj = new MyFrame("This is my second Java window.");
    }
}

class MyFrame extends Frame {
    public MyFrame() throws HeadlessException {
    }

    public MyFrame(String title) throws HeadlessException {
        super(title);
        setSize(360, 240);
        setLocation(380, 180);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
}