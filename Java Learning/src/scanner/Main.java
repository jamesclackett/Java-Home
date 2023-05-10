package scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        //Scanner is used to parse the chars input from
        //keyboard into something more meaningful
        //'System.in' itself simply returns the ASCII character number
    }
}