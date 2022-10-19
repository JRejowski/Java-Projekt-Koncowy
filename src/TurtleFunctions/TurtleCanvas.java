package TurtleFunctions;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TurtleCanvas extends JComponent {

    public boolean shouldDraw;
    private ArrayList<Line> lines;
    public int size;
    public float rotation;
    public int positionX;
    public int positionY;


    public TurtleCanvas()
    {
        shouldDraw = true;
        lines = new ArrayList<Line>();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;

        if(rotation == 0)
            g2d.fillPolygon(new int[] {positionX - size/2, positionX + size/2, positionX}, new int[] {positionY ,positionY , positionY  - size}, 3);
        if(rotation == 90)
            g2d.fillPolygon(new int[] {positionX, positionX , positionX  + size}, new int[] {positionY - size/2, positionY + size/2, positionY }, 3);
        if(rotation == 180)
            g2d.fillPolygon(new int[] {positionX - size/2, positionX + size/2, positionX}, new int[] {positionY , positionY , positionY  + size}, 3);
        if(rotation == 270)
            g2d.fillPolygon(new int[] {positionX  - size, positionX , positionX}, new int[] {positionY, positionY - size/2, positionY + size/2}, 3);


        for(Line k : lines)
        {
            g2d.drawLine(k.x1, k.y1, k.x2, k.y2);
        }

    }

    public void clear()
    {
        if(!lines.isEmpty())
            lines.clear();
        repaint();
    }

    public void move(){
        if(rotation == 0 )
        {
            if(shouldDraw)
                lines.add(new Line(positionX,positionY,positionX, positionY-25));
            positionY -= 25;
        }
        else if(rotation == 90)
        {
            if(shouldDraw)
                lines.add(new Line(positionX,positionY,positionX+25, positionY));
            positionX += 25;
        }
        else if (rotation == 180)
        {
            if(shouldDraw)
                lines.add(new Line(positionX,positionY,positionX, positionY+25));
            positionY +=25;
        }
        else if(rotation == 270)
        {
            if(shouldDraw)
                lines.add(new Line(positionX,positionY,positionX-25, positionY));
            positionX -=25;
        }
        repaint();
    }

    public void reset(){
        rotation = 0;
        positionX = 200;
        positionY = 200;
    }

}
