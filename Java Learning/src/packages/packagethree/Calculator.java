package packages.packagethree;

import packages.packagetwo.Adder;
import packages.packagetwo.Divider;
import packages.packagetwo.Multiplier;
import packages.packagetwo.Subtractor;

public class Calculator {
    public static int multiply(int i, int j){
        return Multiplier.multiplyValues(i,j);
    }
    public static float divide(int i, int j){
        return Divider.divideValues(i,j);
    }
    public static int add(int i, int j){
        return Adder.addValues(i,j);
    }
    public static int subtract(int i, int j){
        return Subtractor.subtractValues(i,j);
    }
    public static boolean isInt(String str) {
        if (str == null) {
            return false;
        }
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
