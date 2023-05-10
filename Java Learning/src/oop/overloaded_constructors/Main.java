package oop.overloaded_constructors;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick",
                "tomato", "mozzerella", "pepperoni");
        Pizza pizza2 = new Pizza("thick",
                "tomato", "mozzerella");
    }
}
