package view;

import TurtleFunctions.*;

import javax.swing.*;

public class GUI {
    public static void main(String[] a) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 600, 600);
        TurtleCanvas turtle = new TurtleCanvas();

        turtle.size = 10;
        turtle.reset();
        RotateLeft left = new RotateLeft();
        left.turtle = turtle;

        RotateRight right = new RotateRight();
        right.turtle = turtle;

        Forward forward = new Forward();

        forward.turtle = turtle;

        JButton forwardB = new JButton("forward");
        forwardB.addActionListener(forward);
        forwardB.setBounds(450,160,130,30);

        Exit exit = new Exit();
        exit.window = window;

        JButton exitB = new JButton("exit");
        exitB.addActionListener(exit);
        exitB.setBounds(450,280,130,30);


        DrawOn drawon = new DrawOn();
        drawon.turtle = turtle;

        DrawOff drawoff = new DrawOff();
        drawoff.turtle = turtle;

        JButton drawonB = new JButton("pen down");
        drawonB.setBounds(450,190,130,30);
        drawonB.addActionListener(drawon);

        JButton drawoffB = new JButton("pen up");
        drawoffB.setBounds(450,220,130,30);
        drawoffB.addActionListener(drawoff);

        Clean clean = new Clean();
        clean.turtle = turtle;

        JButton cleanB = new JButton("clean");
        cleanB.addActionListener(clean);
        cleanB.setBounds(450,250,130,30);

        JButton leftB = new JButton("left");
        leftB.addActionListener(left);
        leftB.setBounds(450,100,130,30);
        JButton rightB = new JButton("right");
        rightB.addActionListener(right);
        rightB.setBounds(450,130,130,30);
        window.getContentPane().add(leftB);
        window.getContentPane().add(rightB);
        window.getContentPane().add(forwardB);
        window.getContentPane().add(drawoffB);
        window.getContentPane().add(drawonB);
        window.getContentPane().add(cleanB);
        window.getContentPane().add(exitB);
        window.getContentPane().add(turtle);
        window.setVisible(true);
    }
}
