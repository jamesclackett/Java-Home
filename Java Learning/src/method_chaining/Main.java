package method_chaining;

public class Main {
    public static void main(String[] args) {
        // Method Chaining = a common syntax for making multiple method calls in OOP
        // condenses code into less lines

        String name = "hello";
        name = name.concat(" there   ");
        name = name.toUpperCase();
        name = name.trim();

        System.out.println("A: "  + name);

        // can also be written as:
        name = "hello";
        name = name.concat(" there   ").toUpperCase().trim();

        System.out.println("B: " + name);
    }


}