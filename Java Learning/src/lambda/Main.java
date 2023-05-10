package lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        /*
                Lambda expression = feature for Java 8 and above
                also known as an anonymous method
                need to use a functional interface (has only one
                abstract method)
                format:
                (arguments) -> {statements(s)}

                *AIC = Anonymous Inner Class)

                Method references '::' are similar.
                If a method matches (input/output) matches the functional interface's,
                then it can be used instead itself, instead of AIC/lambda

                Basically, when a functional interface needs to be implemented, it can be done with
                AIC or lambda. Lambda is just a shorthand version of the AIC.
                But if there exists a method somewhere that fits the same description as the interface
                method to be implemented, then we can simply reference that method using '::'
        */

        // Anonymous inner class
        MyInterface myInterface = new MyInterface() {
            @Override
            public void message() {
                System.out.println("hi");
            }
        };

        //lambda
        MyInterface myInterface2 = () -> System.out.println("hi"); // '()' means no params

        //lambda with multiline statements:
        MyInterface myInterface3 = () -> {
            System.out.println("hi");
            System.out.println("hi again");
        };

        // method reference
        MyInterface myInterface4 = Main::testMeth;

        //another example of method reference (testMeth takes MyInterface as a param)
        // normally you would have to create AIC/lambda that implements MyInterface
        testMeth2(Main::testMeth);
    }

    static void testMeth(){
        //I don't have an input or output. Just like MyInterface.message
        //my reference can be passed, so I will be used as the implementation of MyInterface
    }

    static void testMeth2(MyInterface myInterface){
    }


}