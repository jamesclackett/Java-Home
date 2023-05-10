package overloading;

public class Main {
    public static void main(String[] args) {
        // **not to be confused with method overriding**
        // Overloaded methods share the same name but have different signatures
        // method signature = name + parameters
        // javac compiler decides which method is meant based on signature


        int x = add(1,2);
        String string = add("hel", "lo");
        int y = add(1,2,3);
        int z = add(1,2,3,4);
    }   

    static int add(int i, int j){
        System.out.println("overloaded 1 called");
        return i + j;
    }

    static String add(String s, String s2){
        System.out.println("overloaded 2 called");
        return s + s2;
    }

    static int add(int i, int j, int k){
        System.out.println("overloaded 3 called");
        return i + j + k;
    }

    static int add(int i, int j, int k, int l){
        System.out.println("overloaded 4 called");
        return i + j + k + l;
    }
}