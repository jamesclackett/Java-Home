package oop.inheritance_and_overriding;

public class Vehicle {
    double speed;
    int wheels;

    Vehicle(double speed, int wheels){
        this.speed = speed;
        this.wheels = wheels;
    }

    void go(){
        System.out.println("This vehicle is moving");
    }

    void stop(){
        System.out.println("This vehicle is stopped");
    }
}
