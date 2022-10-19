package TurtleFunctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawOn implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        turtle.shouldDraw = true;
    }
    public TurtleCanvas turtle;
}
