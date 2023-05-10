package equals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // '.equals()' or '=='?

        // '.equals()' is an object method which compares the 'content value' to another object.
        // '==' is an operator which checks if value is the same.
        // In java, primitives contain their actual value, but objects contain an address as
        // their value. so using == on objects will only be true if they are literally the same object
        // in memory.

        System.out.println(1 == 1); // returns true, same value so same memory location

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(1);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);

        System.out.println(a1 == a2); // returns false. Different objects with separate memory
        System.out.println(a1.equals(a2)); // returns true

        // Note Strings that are initialized like primitives (ie String s = "hello";) are stored
        // in the String pool, however not if instantiated with 'new'.
        // The string pool stores new string literals so to avoid duplicates.
        // For example, new string literal "hello" will be stored in the pool and the variable
        // assigned to it gets the address. All subsequent creations of a "hello" literal
        // variables will simply reference the original literal that lies in the pool.

        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");

        System.out.println(s1 == s2); // true // s1 and s2 are the same "HELLO" in the pool
        System.out.println(s1 == s3); // false // s3 is not in the pool
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}