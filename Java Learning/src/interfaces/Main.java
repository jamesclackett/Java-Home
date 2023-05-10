package interfaces;

public class Main {
    public static void main(String[] args) {
        /*
            Interfaces = a template that can be APPLIED TO a class. As opposed to an abstract class
            that is a template FOR a class
            Interfaces are for common behaviors, when HOW the behaviour happens is irrelevant.
            Should always program to an interface, not an implementation
            This means not care where functionality comes from.
            Eg: (1) List<String> list = new ArrayList<>();
                instead of
                (2) ArrayList<String> list = new ArrayList<>();

                in (1), in the rest of our app, list can only have List methods.
                It cannot use any specific ArrayList methods. This is good, since we can later
                change list to be any other type of List without breaking the code.

           Interfaces can have attributes and default methods, but these are public static,
           and final. This is because interfaces are stateless and non-instantiable.
           Even if you do not specify public static final, compiler automatically does so.

           But... for the most part, interfaces should only have abstract method declarations

        */

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        Prey prey = new Fish();
        prey.flee();

    }
}