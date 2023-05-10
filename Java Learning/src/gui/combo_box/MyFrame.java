package gui.combo_box;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {
    JComboBox<String> comboBox;

    MyFrame(){
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] animals = {"dog", "cat", "horse"};
        comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);
        //comboBox.setEditable(true); //allows user to create own input
        //comboBox.addItem("rhino");
        //comboBox.setSelectedIndex(1); //sets the default to be index 1

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox)
            System.out.println(comboBox.getSelectedItem());
    }
}
