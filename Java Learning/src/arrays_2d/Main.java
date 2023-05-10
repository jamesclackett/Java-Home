package arrays_2d;

public class Main {
    public static void main(String[] args) {
        //2D array is an array of arrays

        String[][] cars = new String[2][3];
        //    | 0 | 1 |   length = 2, depth = 3
        //    | 1 | 1 |
        //    | 2 | 2 |

        cars[0][0] = "ford";
        cars[0][1] = "ferrari";
        cars[0][2] = "bmw";
        cars[1][0] = "volvo";
        cars[1][1] = "toyota";
        cars[1][2] = "honda";

        //        0          1
        //   0 | ford    | volvo  |   length = 2, depth = 3
        //   1 | ferrari | toyota |
        //   2 | bmw     | honda  |

        // can use a nested loop to iterate through all items

        // alternative initialization
        String[][] cars2 = {
                {"ford", "ferrari", "bmw"},
                {"volvo", "toyota", "honda"}
        };
    }
}