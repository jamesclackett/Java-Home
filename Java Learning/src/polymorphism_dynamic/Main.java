package polymorphism_dynamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            polymorphism = many shapes/forms
            dynamic = after compilation (i.e. run-time)

            eg. A corvette is a corvette, a car, and an object
        */

        Scanner scanner = new Scanner(System.in);
        Animal animal; // we don't know what specific animal the user will choose.

        System.out.println("What animal do you want?");
        System.out.println("(1 = polymorphism_dynamic.Dog) or (2 = polymorphism_dynamic.Cat)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog(); // Becomes a polymorphism_dynamic.Dog at runtime. This is dynamic polymorphism
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            System.out.println("Invalid choice");
            animal = new Animal();
            animal.speak();
        }
    }
}