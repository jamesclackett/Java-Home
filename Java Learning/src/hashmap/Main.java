package hashmap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap implements the Map interface
        // Similar in usage to ArrayList, but with key-value pairs

        HashMap<String, String> countries = new HashMap<>();
        countries.put("USA", "New York");

        System.out.println(countries);
        System.out.println(countries.get("USA"));

        countries.replace("USA", "Chicago");
        System.out.println(countries.get("USA"));
        System.out.println(countries.containsKey("USA"));
        System.out.println(countries.containsValue("Chicago"));

        countries.remove("USA");
        countries.clear();
        System.out.println(countries.size());

        for (String s : countries.keySet()) {
            System.out.println(s);
            //or
            System.out.println(countries.get(s));
        }

    }
}