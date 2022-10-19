package TurtleFunctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forward implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        turtle.move();
        turtle.repaint();
    }

    public TurtleCanvas turtle;

}
