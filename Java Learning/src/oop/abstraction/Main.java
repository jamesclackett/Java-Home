package oop.abstraction;

public class Main {
    public static void main(String[] args) {
        // abstract classes cannot be instantiated, are made to have subclasses
        // abstract methods are declared without an implementation

        //Vehicle vehicle = new Vehicle() this doesn't work
        Car car = new Car();
        car.go();
    }
}
