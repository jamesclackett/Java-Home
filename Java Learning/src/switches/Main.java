package switches;

public class Main {
    public static void main(String[] args) {
        String day = "Friday";

        //regular switch
        switch (day){
            case "Monday" : System.out.println("It is Monday!");
                break;
            case "Tuesday" : System.out.println("It is Tuesday!");
                break;
            case "Wednesday" : System.out.println("It is Wednesday!");
                break;
            case "Thursday" : System.out.println("It is Thursday!");
                break;
            case "Friday" : System.out.println("It is Friday!");
                break;
            case "Saturday" : System.out.println("It is Saturday!");
                break;
            case "Sunday" : System.out.println("It is Sunday!");
                break;
            default: System.out.println("That is not a day");
        }
        /*
        switch behavior: break ends execution, if it is forgotten then java will
        go to the next case and execute its line of code...until a break is reached.
        Even though a case has already been matched.

        This behavior is useful if we want multiple cases that do the same thing:

            switch (errorCode) {
                case 400:
                case 404:
                case 405:
                    System.out.println("Something is wrong with the request!");
                    break;
                case 500:
                case 501:
                case 505:
                    System.out.println("Something is wrong with the server!");
                    break;
}
         */

        // enhanced switch  **the -> means auto-include break**
        //                      can also use multiple values per case
        switch (day) {
            case "Monday" -> System.out.println("It is Monday!");
            case "Tuesday" -> System.out.println("It is Tuesday!");
            case "Wednesday" -> System.out.println("It is Wednesday!");
            case "Thursday" -> System.out.println("It is Thursday!");
            case "Friday" -> System.out.println("It is Friday!");
            case "Saturday" -> System.out.println("It is Saturday!");
            case "Sunday" -> System.out.println("It is Sunday!");
            default -> System.out.println("That is not a day");
        }
    }
}