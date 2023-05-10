package while_loops;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        //while-loop
        while (name.isBlank()){
            name = JOptionPane.showInputDialog("Enter your name");
        }
        System.out.println("Hello " + name);

        int i = 5;
        //do-while loop checks the condition first, so guarantees at least one loop
        //execution. Its basically a reverse while-loop
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}