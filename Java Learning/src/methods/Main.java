package methods;

public class Main {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        hello("john");
        int k = sum(1,2);
        System.out.println(k);
    }

    static void hello(String name){
        System.out.println("hello " + name);
    }

    static int sum(int i, int j){
        return i + j;
    }
}