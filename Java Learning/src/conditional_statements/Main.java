package conditional_statements;

public class Main {
    public static void main(String[] args) {
        int age = 75;

        if (age >= 75){
            System.out.println("old!");
        }
        else if (age >= 18){
            System.out.println("adult!");
        }
        else {
            System.out.println("baby!");
        }
    }
}