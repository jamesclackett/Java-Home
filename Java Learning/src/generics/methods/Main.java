package generics.methods;

public class Main {
    public static void main(String[] args) {
        /*
            Generics enable types (classes and interfaces) to be parameters when
            defining: classes, interfaces, methods.
            Benefit = eliminates the need to create multiple versions of classes/methods
            for different data types.

            Eg instead of example(String s){} ....example(int i)....etc,
            have example<T>(T t){}

        */

        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {1.0, 2.2, 7.9, 0.1};
        Character[] charArray = {'a', 'b', 'c', 'd'};
        String[] strArray = {"He", "is", "the", "worst"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(strArray);

    }
    //generic method
    static <T> void displayArray(T[] array){
        for (T t : array)
            System.out.print(t+" ");
        System.out.println();
    }
}