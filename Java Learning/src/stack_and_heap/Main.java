package stack_and_heap;

public class Main {
    public static void main(String[] args) {
        // Java divides memory into Stack and Heap.

        // Stack is used for static memory allocation (size unchanging, allocated at compile-time)
        //  variables are stored in Stack. When new methods are called, their variables
        //  get pushed onto the stack. When the method completes, its variables are
        //  flushed, freeing up memory for the next method.
        // ** methods are stored in the Method area
        // * if stack is full, will get a stack overflow error
        // * faster than heap memory
        // ** there are always exceptions. Sometimes variables can end up in heap if necessary
        // (for example instance variables of a class/object)
        // But remember, objects usually dont end up in the stack.
        // sometimes JVM can see that an object never leaves a method (ie it doesnt
        // need to persist), so they put it on the stack for efficiency

        // Heap is used for dynamic memory allocation (size can change, allocated at run-time)
        // Objects are stored in heap (but remember object references are stored in stack).
        // The application itself is stored in heap.
        // Heap is used for objects because they are larger/more expensive and also
        // because then they can persist, unlike stack variables that are lost when
        // popped. The downside of this is that they will need to be garbage collected eventually
        // Heap is divided into old space and new space on a FIFO basis. When the heap is full,
        // the oldest (unreferenced) objects start to get garbage collected.

        // Garbage = unreferenced objects
        // Garbage collection = removal of oldest unreferenced objects
        // unreferenced object is object with no associated reference variable

        // how an object is unreferenced:
        Object o1 = new Object(); //stored in memory location fx09 (example)
        Object o2 = new Object(); //stored in memory location fx13 (example)
        o1 = o2; // the Object that is stored in fx09 is now unreferenced
                 // because o2 = fx13 and now o1 also = fx13. Nothing equals fx09 anymore

        new Object(); // this is also an unreferenced object (no reference variable to begin with

        // String pool
        // Basically a pool of strings that have already been used to avoid having
        // 200 different "hello" strings in memory
        // Is stored in heap memory

        String s = "hello"; // String obj with val of "hello" created in pool. so s = fx09 (example)
        String s1 = "hello"; // JVM realises that there's already a hello in String pool, so s1 = fx09
        String s2 = "hello"; // s2 = fx09 etc etc
    }
    // An example of why heap is used for objects:
    static Object foo(){
        Object o = new Object();
        return o; // since the object o is referencing is in heap, it can be used outside of method
    }
}