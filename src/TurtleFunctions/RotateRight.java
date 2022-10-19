package TurtleFunctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RotateRight implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        turtle.rotation += 90;
        if(turtle.rotation==360)
            turtle.rotation = 0;
        turtle.repaint();
    }

    public TurtleCanvas turtle;

}
