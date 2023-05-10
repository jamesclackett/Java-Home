package oop.basics;

public class Main {
    public static void main(String[] args) {
        // Classes are like a blueprint. Contains fields and methods
        // objects are classes that have been instantiated

        Human human = new Human("Rick", 26, 75);
        Human human2 = new Human("John", 31, 80);

        human.eat();
        human2.drink();

    }
}