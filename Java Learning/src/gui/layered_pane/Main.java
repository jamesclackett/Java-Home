package gui.layered_pane;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        /*
                JLayeredPane = Swing container that provides a third dimension
                for positional components i.e. depth (z-index)
         */

        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.cyan);
        label1.setBounds(50,50,200,200);

        JLabel label2= new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.magenta);
        label2.setBounds(100,100,200,200);

        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0, 500,500);

        // new additions to layer go under previous
        // higher no. layers go on top of lower no. layers
        //cyan
        layeredPane.add(label1, Integer.valueOf(0)); // can also use JLayeredPane.[name of pane]
        //magenta
        layeredPane.add(label2, Integer.valueOf(1));
        //green
        layeredPane.add(label3, Integer.valueOf(1));


        JFrame jFrame = new JFrame("JLayeredPane");
        jFrame.add(layeredPane);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(new Dimension(500,500));
        jFrame.setSize(500,500);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
