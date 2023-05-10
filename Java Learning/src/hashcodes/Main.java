package hashcodes;

public class Main {
    public static void main(String[] args) {
        /*
                Hashcode puts an object through a hash function and returns an int value
                This is useful for datastructures like HashMap. For example, a string key
                can be turned into an int, operations now can be carried out on it (like %),
                to determine its location in the HashMap
                * hashCode will return the same value for identical value objects
                    i.e. "hello" and "hello" will always have the same hashCode (per application run)
                * the hashCode of Integers are the same as their literal value (hashCode of 14 is 14)
                * Note: it is possible (although unlikely) that different objects have the same hashCode
                    so, should never use to compare equality
        */

        String s = "hello";
        String s2 = new String("hello");
        System.out.println(s2.hashCode() + ", " + s.hashCode());

        Integer i = 13;
        System.out.println(i.hashCode());

        Double d = 14.5;
        System.out.println(d.hashCode());

    }
}
