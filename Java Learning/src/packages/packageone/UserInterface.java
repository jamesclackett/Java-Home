package packages.packageone;
import packages.packagethree.Calculator;

import javax.swing.*;
import java.util.Objects;

public class UserInterface {
    // main is the entry point of program
    public static void main(String[] args) {
        // This is terrible use of swing. I haven't learned it yet, just showing package use..
        String type;
        do type = JOptionPane.showInputDialog("Enter calculation type:\n" +
                "s = subtract\n" +
                "a = add\n" +
                "d = divide\n" +
                "m = multiply");
        while (!Objects.equals(type, "s") && !Objects.equals(type, "a") &&
        !Objects.equals(type, "d") && !Objects.equals(type, "m"));

        int i, j;
        String value;
        do
            value = JOptionPane.showInputDialog("Enter value 1");
        while (!Calculator.isInt(value));
        i = Integer.parseInt(value);

        do
            value = JOptionPane.showInputDialog("Enter value 2");
        while (!Calculator.isInt(value));
        j = Integer.parseInt(value);

        switch (type){
            case "a" -> JOptionPane.showMessageDialog(null, Calculator.add(i,j));
            case "s" -> JOptionPane.showMessageDialog(null, Calculator.subtract(i,j));
            case "m" -> JOptionPane.showMessageDialog(null, Calculator.multiply(i,j));
            case "d" -> JOptionPane.showMessageDialog(null, Calculator.divide(i,j));
            default -> JOptionPane.showMessageDialog(null,"error");
        }
    }
}
