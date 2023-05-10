package gui.labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //JLabel is a GUI display area for text, image or both

        ImageIcon icon = new ImageIcon("Java Learning\\GUI More\\java_icon.png");
        Border border = BorderFactory.createLineBorder(Color.GRAY, 3);

        JLabel label = new JLabel();
        label.setText("hello");
        label.setIcon(icon);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.RED);
        label.setFont(new Font("MV Boli", Font.BOLD, 20));
        label.setIconTextGap(50); //allows minus numbers too to go closer to icon
        label.setBackground(Color.BLACK);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(100,100,250,250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        //frame.pack(); // makes frame fit components. pack must be called after all components added
    }
}
