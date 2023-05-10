package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
       /*
            Exception = an event that occurs during the execution of a program
            that disrupts the normal flow of instructions.

            try/catch blocks allow the program to handle exceptions


            * Checked exceptions: at compile-time
                > method must handle or throw exception

            * Unchecked/runtime exceptions: at run-time
                > Eg ArrayOutOfBounds, divide by zero
       */

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Enter a whole number to divide:");
            int i = scanner.nextInt();

            System.out.println("Enter a whole number to divide by:");
            int d = scanner.nextInt();

            int result = i/d; //If you divide by 0, then arithmetic exception occurs
            System.out.println(result);
        }
        catch (ArithmeticException exc){
            System.out.println("Invalid input");
        }
        catch (InputMismatchException exc){
            System.out.println("You must enter a number");
        }
        catch (Exception e){ // this is for unanticipated exceptions. Don't use on own, it's lazy
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("This wil always print");
            scanner.close();
            // A good use for finally blocks is to close anything that's opened (i.e. files)
        }

    }
}