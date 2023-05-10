package gui.option_pane;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /*
                JOptionPane = pop up a standard dialog box that prompts users for a value
                or informs them of something
        */

        // There are multiple types: Information, Plain, Error, Warning, Question
        JOptionPane.showMessageDialog(null, "This is a message",
                "Title", JOptionPane.INFORMATION_MESSAGE);

        //JOptionPane.showConfirmDialog(null, "do you code?",
                //"Title",JOptionPane.YES_NO_CANCEL_OPTION);

        // showConfirm dialog returns 0 for yes, 1 for no, 2 for cancel
        System.out.println(JOptionPane.showConfirmDialog(null, "do you code?",
               "Title",JOptionPane.YES_NO_CANCEL_OPTION));

        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);

        // OptionDialog is a combination of the above
        ImageIcon icon = new ImageIcon("Java Learning/GUI More/java_icon.png");
        String[] responses = {"option 1", "option 2", "option 3"};

        JOptionPane.showOptionDialog(null, "message",
               "Title", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE,
                icon, responses, 0 );
    }
}
