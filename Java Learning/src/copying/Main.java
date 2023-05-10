package copying;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Chevrolet", "Camaro", 2012);
        Car car2 = new Car("Ford", "Mustang", 2012);

        // car2 = car1  **this does NOT copy** simply means 2 references to single object

        car2.copy(car1); // a copy method should be created for the class

        Car car3 = new Car(car1); // a copy constructor should be created for the classs
    }
}