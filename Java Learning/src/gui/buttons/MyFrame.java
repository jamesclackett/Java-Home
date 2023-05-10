package gui.buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JButton button, button2;

    MyFrame(){
        ImageIcon icon = new ImageIcon("Java Learning\\GUI More\\java_icon.png");

        button = new JButton();
        button.setBounds(200,100,200,100);
        button.addActionListener(this);
        button.setFocusable(false); //stops text being highlighted after click
        button.setText("Im a button");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 20));
        //button.setEnabled(false); often goes in action performed (prevents >1 clicks)
        this.add(button);

        // will use lambda for this one. MyFrame doesn't need to implement ActionListener this way
        button2 = new JButton();
        button2.setBounds(200,200,100,50);
        button2.setText("me too?");
        button2.addActionListener(e -> System.out.println("hello2"));
        /*
          This is what the lambda is doing - just without the shorthand.
          Creating an anonymous class that implements ActionListener interface
        --------------------------------------------------------
            button2.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("hello2");
                }
            });
          --------------------------------------------------------
         */

        this.add(button2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) System.out.println("hello1");
    }
}
