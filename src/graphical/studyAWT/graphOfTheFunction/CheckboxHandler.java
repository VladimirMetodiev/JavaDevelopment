package graphical.studyAWT.graphOfTheFunction;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckboxHandler implements ItemListener {
    private Choice ch;

    CheckboxHandler(ButtonPanel p) {
        this.ch = p.choice;
    }

    public void itemStateChanged(ItemEvent event) {
        ch.setEnabled(event.getStateChange() == ItemEvent.SELECTED);
    }
}
