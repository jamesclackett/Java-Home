package generics.classes;

public class Main {
    public static void main(String[] args) {
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<String, Integer> myString = new MyGenericClass<>("hello");
    }
}
