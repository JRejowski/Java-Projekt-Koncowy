package TurtleFunctions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clean implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        turtle.clear();
        turtle.reset();
    }

    public TurtleCanvas turtle;

}