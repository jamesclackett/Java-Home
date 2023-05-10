package java_8.optionals;


import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        // The idea of Optionals is to convey to the programmer using a method,
        // that it may not return the intended object. Like below, there's a chance that
        // findCatByName() will return null. Adding Optional to the signature does not add
        // any functionality, but it does show that the method will not return a Cat 100% of the time.


        Optional<Cat> optionalCat = findCatByName("Tom"); //Optional Cat: may or may not be a cat
        /* pre java 8, would have to do the following to account
           for potential null values:

            if (cat != null)
                System.out.println(cat);
            else
                System.out.println(0);
        */

        // with optional (looks the same, but see above text for reason):
        if (optionalCat.isPresent())
            System.out.println(optionalCat.get().getAge()); //when get() is called on optional
                                                            //isPresent should always be checked first
        else
            System.out.println(0);
        //Note: today, orElseThrow() is preferred to get(). it does the same thing anyway


        // here is a better way (returns Cat, or a default Cat):
        Cat mycat = optionalCat.orElse(new Cat("Unknown", 0)); //
        System.out.println(mycat.getAge());
    }

    /*just a mock method, in reality, would actually search a db for cat
        private static Cat findCatByName(String name){
            Cat cat = new Cat(name, 3); // in reality would be a search DB method
            return cat; //what if the db returned null, the method would return null
        }
    */

    private static Optional<Cat> findCatByName(String name){
        Cat cat = new Cat(name, 4);
        return Optional.ofNullable(cat);
    }
}
