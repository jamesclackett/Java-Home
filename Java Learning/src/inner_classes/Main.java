package inner_classes;

public class Main {
    public static void main(String[] args) {
        /*
                Inner Class = A class inside another class
                useful if the class is limited in scope
                usually private but not necessary
                helps group classes that belong together
                extremely useful for listeners for specific events
                precursors for anonymous inner classes
         */

        Outside outside = new Outside();
        Outside.Inside inside = outside.new Inside();

        System.out.println(outside.x + inside.y);
    }
}