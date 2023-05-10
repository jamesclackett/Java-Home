package gui.layouts;

import javax.swing.*;
import java.awt.*;

public class Flow {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 0,0));

        JPanel tabPanel = new JPanel();
        tabPanel.setPreferredSize(new Dimension(100,250));
        tabPanel.setBackground(Color.lightGray);
        tabPanel.setLayout(new FlowLayout());

        tabPanel.add(new JButton("1"));
        tabPanel.add(new JButton("2"));
        tabPanel.add(new JButton("3"));
        tabPanel.add(new JButton("4"));
        tabPanel.add(new JButton("5"));
        tabPanel.add(new JButton("6"));
        tabPanel.add(new JButton("7"));
        tabPanel.add(new JButton("8"));
        tabPanel.add(new JButton("9"));

        frame.add(tabPanel);
        frame.setVisible(true);
    }
}
