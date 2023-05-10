package gui.frames;

import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close
        //this.setResizable(false);
        this.setSize(500,500);

        ImageIcon image = new ImageIcon("Java Learning\\GUI More\\logo.png");
        this.setIconImage(image.getImage()); //sets icon of window
        this.getContentPane().setBackground(Color.CYAN);

        this.setVisible(true); //keep the last (seems to allow components to load)
    }
}
