package exception_handling.custom_handling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Exception = an event, after execution that disrupts the normal
            flow of a program
            E.g. ArithmeticException (user divides by 0), FileNotFoundException
            can make own Exceptions
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("problem occurred");
        }
    }

    private static void checkAge(int age)  throws AgeException{
        if (age < 18) throw new AgeException("Too young!");
        else System.out.println("signed up");
    }
}
