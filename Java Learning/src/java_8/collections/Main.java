package java_8.collections;

public class Main {
    public static void main(String[] args) {
        /*
            Collections = production grade implementations of common data structures

            The Collection interface defines traits that a grouping of objects should have
            Extends the Iterable interface that defines traits that an iterable object should have

            Iterable has the forEach() method that many classes implement
            Collections has size(), isEmpty(), contains(), iterator(), clear()

            Set, List and Queue implement the Collections interface, getting all the above traits
            and add some of their own (Eg Queue has peek())
            Concrete classes like ArrayList implement these interfaces, agreeing to have certain
            behaviours

                    Iterable
                        |
                   Collections
                /       |       \
              Set      List   Queue
                |       |        |
           HashSet  ArrayList   PriorityQueue
           TreeSet  LinkedList
        LinkedHashSet
        */

    }
}
