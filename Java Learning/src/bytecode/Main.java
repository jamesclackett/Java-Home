package bytecode;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 20;
        int k = i + j;
        System.out.println(k);

        // View the Bytecode for above statements. Reference the Java Bytecode instruction list
        // to understand what is happening. In short the bytecode is a series of commands that
        // tell the JVM to add and remove values from the local variable array, and also to
        // pop, push, add etc. these values to the operand stack.
        // It also tells the jvm when to invoke methods, create classes etc.
    }
}