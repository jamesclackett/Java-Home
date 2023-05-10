package arraylist_2d;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(3);
        list.add("pasta"); list.add("cheese"); list.add("pancake");

        ArrayList<String> list2 = new ArrayList<>(3);
        list.add("eggs"); list.add("bacon"); list.add("sugar");

        ArrayList<String> list3 = new ArrayList<>(3);
        list.add("milk"); list.add("salt"); list.add("chocolate");

        ArrayList<ArrayList<String>> list2D = new ArrayList<>(3);
        list2D.add(list); list2D.add(list2); list2D.add(list3);

    }
}