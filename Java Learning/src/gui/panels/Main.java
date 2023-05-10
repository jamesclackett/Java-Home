package gui.panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // JPanel = a GUI component that functions as a container to hold other components
        // basically, you add components to a panel, and add panels to a frame

        // Layout Managers: see https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html*
        // Border Layout is the default for frames

        ImageIcon icon = new ImageIcon("Java Learning\\GUI More\\java_icon.png");

        JLabel label = new JLabel();
        label.setText("hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.TOP);  these work if you're using a border layout
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,75,75); //needed with a null layout

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setLayout(null);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);

        greenPanel.add(label);

        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }
}
