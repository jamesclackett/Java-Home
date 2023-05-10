package oop.inheritance_and_overriding;

public class Main {
    public static void main(String[] args) {
        // Inheritance = when class(s) inherit attributes and methods of another
        Car car = new Car(200, 4, 2);
        car.go();

        Bicycle bicycle = new Bicycle(20, 2, 2);
        bicycle.stop();

        System.out.println(car.doors);
        System.out.println(bicycle.pedals);
    }
}
