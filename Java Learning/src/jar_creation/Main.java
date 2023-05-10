package jar_creation;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jar Creation Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.add(new JLabel("Test"));
        frame.setVisible(true);

        /*
            Steps to create runnable jar:
            1) In Project Settings, go to artifacts
            2) new Jar select module and jar_creation.Main class
            3) Press Ok, go to main Build tab and build artifacts
            4) find in directory
        */
    }
}