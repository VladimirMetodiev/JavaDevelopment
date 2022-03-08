package graphical.studyAWT.graphOfTheFunction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonOneHandler implements ActionListener {
    private ButtonPanel p1;
    private PlotPanel p2;

    ButtonOneHandler(ButtonPanel p1, PlotPanel p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void actionPerformed(ActionEvent ae) {
        p2.plotter = p2.plotter.remember(p1);
        p2.plotter.plot(p2.getGraphics());
    }
}
