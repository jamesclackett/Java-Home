package gui.mouse_listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //invoked when a mouse button has been clicked (pressed + released) on a component
        System.out.println("clicked mouse");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //invoked when a mouse button has been pressed on a component
        System.out.println("pressed mouse");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //invoked when a mouse button has been released on a component
        System.out.println("released mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //invoked when the mouse enters a component
        System.out.println("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //invoked when the mouse exits a component
        System.out.println("mouse exited");
    }
}
