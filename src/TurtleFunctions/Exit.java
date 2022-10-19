package TurtleFunctions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exit implements ActionListener {
    public void actionPerformed( ActionEvent e ) {
        window.dispose();
    }
    public JFrame window;
}