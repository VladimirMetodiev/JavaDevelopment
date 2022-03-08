package graphical.studySwing;

import javax.swing.*;
import java.awt.*;

public class CreateWindowVarTwo {
    public static void main(String[] args) {
        MySwingFrame window = new MySwingFrame("My Swing window");
    }
}

class MySwingFrame extends JFrame {
    public MySwingFrame(String title) throws HeadlessException {
        super(title);
        setSize(360, 240);
        setLocation(380, 180);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}