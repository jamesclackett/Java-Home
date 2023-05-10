package gui.key_listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class MyFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;

    MyFrame(){
        icon = new ImageIcon("Java Learning/GUI More/rocketship.png");

        label = new JLabel();
        label.setBounds(0,0, 100,100);
        //label.setBackground(Color.RED);
        //label.setOpaque(true);
        label.setIcon(icon);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.BLACK);
        this.setLayout(null);
        this.addKeyListener(this);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // invoked when a key is typed. Uses KeyChar - outputs char
        switch (e.getKeyChar()){
            case 'a':
                label.setLocation(label.getX()-5, label.getY());
                break;
            case 'w':
                label.setLocation(label.getX(), label.getY()-5);
                break;
            case 's':
                label.setLocation(label.getX()+5, label.getY());
                break;
            case 'z':
                label.setLocation(label.getX(), label.getY()+5  );
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // invoked when a physical key is pressed down. Uses KyCode - outputs int
        // keycode is the number of the physical keyboard button. kind of mapped to ascii
        switch (e.getKeyCode()){
            case 37:
                label.setLocation(label.getX()-5, label.getY());
                break;
            case 38:
                label.setLocation(label.getX(), label.getY()-5);
                break;
            case 39:
                label.setLocation(label.getX()+5, label.getY());
                break;
            case 40:
                label.setLocation(label.getX(), label.getY()+5  );
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // called whenever a button is released
    }
}
