package wrapper_classes;

public class Main {
    public static void main(String[] args) {
        // wrapper class = provides a way to use primitive data types as reference data types.
        // reference data types contain useful methods.
        // they can be used with collections (Eg ArrayList)

        // primitive:  |    wrapper:
        // ----------  |    --------
        // boolean     |    Boolean
        // char        |    Character
        // int         |    Integer
        // double      |    Double

        // autoboxing = the automatic conversion that the java compiler makes between the primitive
        //              data types and their corresponding wrapper class.
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive.

        Boolean b = true; // primitive boolean 'true' will be autoboxed to a Boolean object
        Integer i = 12; // primitive int 12 will be autoboxed to an Integer object

        if (b == true) System.out.println("true"); // Boolean object 'b' unboxed to primitive for comp.
    }
}