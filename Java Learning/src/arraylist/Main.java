package arraylist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList is a dynamic array
        // Elements can be added or removed after compilation
        // Stores reference data types
        // begins with size = 10, every time it runs out of space, an
        // array 1.5 bigger is added (ie 10 > 25)
        // resizing is expensive, so good practice is setting initial capacity right.
        // Insertions are O(n) worst case (potentially have to shift everything over)
        // Search is O(1)

        ArrayList<String> food = new ArrayList<>(20);
        food.add("hamburger");
        food.add("hot dog");
        food.add("churro");

        food.set(1, "cake");
        food.remove(1);

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

        food.clear();
        System.out.println(food.size());

    }

}