package TurtleFunctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawOff implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        turtle.shouldDraw = false;
    }
    public TurtleCanvas turtle;
}