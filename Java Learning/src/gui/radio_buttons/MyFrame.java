package gui.radio_buttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton, hamburgerButton, hotdogButton;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzaButton = new JRadioButton("pizza");
        pizzaButton.addActionListener(this);
        hamburgerButton = new JRadioButton("hamburger");
        hamburgerButton.addActionListener(this);
        hotdogButton = new JRadioButton("hotdog");
        hotdogButton.addActionListener(this);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(pizzaButton);
        buttonGroup.add(hamburgerButton);
        buttonGroup.add(hotdogButton);

        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == pizzaButton) System.out.println("you ordered pizza");
        else if (e.getSource() == hamburgerButton) System.out.println("you ordered hamburger");
        else if (e.getSource() == hotdogButton) System.out.println("you ordered hotdog");
        else System.out.println("Error");
    }
}
