package arrays;

public class Main {
    public static void main(String[] args) {
        // Arrays are stored in contiguous blocks of memory (a linked list for example,
        // is NOT an array (each node stored anywhere)
        // the below example is a static array, which means it has an unchangeable size
        // NB 'insertions' done exist with this type, only assignment. No shifting ever takes
        // place like in an ArrayList

        String[] cars = {"BMW", "Ford", "Ferarri"};
        cars[0] = "Mercedes";
        //System.out.println(cars[1]);

        String[] cars2 = new String[3];
        cars2[0] = "Tesla";
        cars2[1] = "Volvo";
        cars2[2] = "Renault";

        for (String s : cars2) {
            System.out.println(s);
        }

        /*
        for (int i = 0; i < cars2.length; i++){
            System.out.println(cars2[i]);
        }
         */
    }
}