package printf;

public class Main {
    public static void main(String[] args) {
        //
        /*
            % [flags] [.precision] [width] [conversion character]

            conversion characters:
            s = strings, f = floats, d = decimal integers, t = time/date
            b = boolean, c = chars

            width:
            minimum number of characters to be output

            precision:
            the number of digits of precision for a float.
            '.' followed by precision wanted (i.e. 2).

            flags:
            add an effect to the output
            > - : left-justify
            > + : add a plus or minus sign to value
            > 0 : numeric values are zero-padded
            > , : comma grouping separator if > 1000 (i.e. 10,000)

         */


        System.out.printf("this is a format string %d \n", 123); //conversion char

        System.out.printf("hello %15s.\n", "there"); //width and conversion char
        System.out.printf("hello %-15s.\n", "there"); //width (left-justified) and conversion char

        System.out.printf("you have %f. euros.\n", 1000.0); //default precision = 6
        System.out.printf("you have %.3f euros.\n", 1000.0); //precision = 3

        System.out.printf("you have %+d euros.\n", 1000); //signed
        System.out.printf("you have %08d euros.\n", 1000); // zero-padded
        System.out.printf("you have %,d euros.\n", 1000); // comma separator


    }
}