package TurtleFunctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotateLeft implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        turtle.rotation -= 90;
        if(turtle.rotation<0)
            turtle.rotation = 270;
        turtle.repaint();
    }

    public TurtleCanvas turtle;

}