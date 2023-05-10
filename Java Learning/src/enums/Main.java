package enums;

enum Planet { // letters should be all upper case
    MERCURY(1),
    VENUS(2),
    EARTH(3),
    MARS(4),
    JUPITER(5),
    SATURN(6),
    URANUS(7),
    NEPTUNE(8);

    int number;

    Planet(int number){
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        // enum = enumeration (ordered listing of items in a collection)
        // a grouping of constants, but they behave similarly to objects

        Planet planet = Planet.EARTH;
        canILiveHere(planet);

        Planet planet2 = Planet.MARS;
        canILiveHere(planet2);
    }

    static void canILiveHere(Planet p){
        System.out.println(p + "?");
        System.out.println("this is planet no." + p.number);
        switch (p){
            case EARTH :
                System.out.println("you can live here");
                break;
            default:
                System.out.println("You can't live here");
                break;
        }
        System.out.println();
    }
}