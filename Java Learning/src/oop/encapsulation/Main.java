package oop.encapsulation;

public class Main {
    public static void main(String[] args) {
        /*
            Encapsulation = attributes of a class will be private and only
            accessible through methods (getters and setters)
            attributes should always be private unless you have a reason otherwise
        */

        Car car = new Car("Chevrolet", "Camaro", 2022);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println();

        car.setMake("Ford");
        car.setModel("Mustang");
        car.setYear(1969);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

    }
}
