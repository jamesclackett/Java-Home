package oop.inheritance_and_overriding;

public class Car extends Vehicle{
    int doors = 2;

    Car(double speed, int wheels, int doors) {
        super(speed, wheels);
        this.doors = doors;
    }

    @Override // overrides the go() inherited from Vehicle class
    void go() {
        System.out.println("The car is moving");
    }
}
