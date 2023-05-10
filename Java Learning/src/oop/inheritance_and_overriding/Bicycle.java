package oop.inheritance_and_overriding;

public class Bicycle extends Vehicle{
    int pedals;
    Bicycle(double speed, int wheels, int pedals) {
        super(speed, wheels);
        this.pedals = pedals;
    }
}
