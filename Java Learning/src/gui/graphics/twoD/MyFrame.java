package gui.graphics.twoD;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        MyPanel panel = new MyPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setSize(500,500);
        this.setLocationRelativeTo(null); //puts window in middle of screen
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

    class MyPanel extends JPanel{
        MyPanel(){
            this.setPreferredSize(new Dimension(500,500));
        }

        public void paint(Graphics g){
            Graphics2D g2D = (Graphics2D) g;
            g2D.setStroke(new BasicStroke(5));
            g2D.setPaint(Color.RED);
            //g2D.drawLine(0,0,500,500);
            //g2D.drawRect(0,0,100,200);
            //g2D.fillRect(0,0,100,200);
            //g2D.drawOval(0,0,100,100);
            //g2D.drawArc(0,0,100,100,0,180);

            //int[] xPoints = {150,250,350};
            //int[] yPoints = {300,150,300};
            //g2D.drawPolygon(xPoints, yPoints, 3);

        }
    }


}
