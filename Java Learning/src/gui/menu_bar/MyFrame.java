package gui.menu_bar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu, editMenu, helpMenu;
    JMenuItem loadItem, saveItem, exitItem;

    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); // Mapped to 'Alt + L'
        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_E); // Mapped to 'Alt + E'
        helpMenu = new JMenu("Help");
        helpMenu.setMnemonic(KeyEvent.VK_H); // Mapped to 'Alt + H'

        // add items to file menu
        loadItem = new JMenuItem("Load");
        loadItem.addActionListener(this);
        loadItem.setMnemonic(KeyEvent.VK_L); // Mapped to Key 'L'
        fileMenu.add(loadItem);

        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(this);
        saveItem.setMnemonic(KeyEvent.VK_S); // Mapped to Key 'S'
        fileMenu.add(saveItem);

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);
        exitItem.setMnemonic(KeyEvent.VK_E); // Mapped to Key 'E'
        fileMenu.add(exitItem);

        // Add menus to menuBar
        menuBar = new JMenuBar();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) System.out.println("Loading");
        else if (e.getSource() == saveItem) System.out.println("Saving");
        else if (e.getSource() == exitItem) System.exit(0);
        //0 means successful. non-0 = unsuccessful
        else System.out.println("Error");
    }
}

