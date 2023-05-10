package jvm_architecture;

public class Main {
    public static void main(String[] args) {
         /*
        JVM : A process based virtual machine that can run java bytecode
        > Is platform-dependent itself, but is what allows the Java language to be
        platform-independent.
        > typing 'java jvm_architecture.Main' is asking the computer to run jvm_architecture.Main with java.exe.
        > If you have 3 different Java Apps running, then 3 different JVM instances are running.
        > JVM is stopped when either:
            * System.exit() is called
            * All non-daemon threads are finished (daemons are vital background processes)


        Consists of 3 sub-systems:
            1) Class Loading
            2) Runtime Data Area
            3) Execution Engine
           -------------------------------------------------------------------------------------------
            CLASS LOADING:
            STEP 1 (Loading into memory)
            > 3 ClassLoaders
               * Bootstrap   - Written in native code (compiled) so can be first to load
                               Loads core java classes and other the classloaders
               * Extension   - Is a class object and child of Bootstrap.
                               Loads extension classes (not included in core or written by
                               user but important for application. E.g. classes for Databases)
                               ** No longer exists Java 9+. See below.
               * Application - child of Extension.This loads classes that are found in the classpath.
            > Usually, the class with main() method is loaded first.
            > If a class isn't found there will be NoClassDefFoundError/ClassNotFoundException.

            ** Since Java 9+ The Extension classloader is now called platform. Some less essential
            core modules have been relegated here and Java community classes that have become
            standardised. Classes previously loaded here should now be added to classpath to be loaded
            by the Application ClassLoader

            STEP 2 (Linking)
            > Verify - Class files that have been loaded are verified for correctness
            (i.e. were they compiled in the correct way the jvm understands).
            > Prepare - Allocate memory for static/class variables. Set default values for now.
            > Resolve - Convert symbolic references to actual (e.g. Person -> C:/Programs/Java/Person)
            * this can be done all at the beginning or done as needed

            STEP 3 (Initialization)
            > The class is initialized i.e. static variables are initialized with actual values.
            > Classes are not initialized until either:
                A) A static method is called (main() for example causes jvm_architecture.Main to be initialized)
                B) An instance of the class is created (i.e. 'new ArrayList<>()')
           --------------------------------------------------------------------------------------------
            RUNTIME DATA AREA

            Method Area
             > Definition of classes stored here (ie fields, method info + code, constructors,
             constant pool, static variables).
             > Basically, everything in a .class file, from an instruction point of view
             are actually stored here.
             > Method area is logically a part of heap, but some implementations don't garbage
             collect it.
             > When a class is actually instantiated it is in regular heap memory

            Heap Area
             > Stores all actual instances of classes and their instance variables.
             * remember, class = description | object = instantiated class
             ** There is only one method area and one heap area per JVM.

            Stack Area
             > A new stack area is created for every new thread
             > Where the contents of methods (variables, operands) and
              partial results are loaded for execution.
             > For each method call, one entry to the stack is made
             > One entry/level is called a Stack Frame.
             > The Stack Frame is made up of (Frame Data, local variables, operand stack)

            PC Registers
             > JVM supports multiple threads
             > Each thread gets its own register to hold address of currently executing instruction
             > When the instruction is executed, the register gets the next instruction

            Native method stacks
             > Contains stacks that support native methods (compiled in C/C++ etc)
             > For every new thread, a new method stack area is created
             > Native methods allow better performance at the expense of portability.
             > Basically just the same as regular stack area, but for native code

            --------------------------------------------------------------------------------------------
            EXECUTION ENGINE

            Bytecode needs to be turned into machine code
            Hot code is compiled Just In Time (JIT). Non-hot code is interpreted (it's faster to just
            interpret non-hot code).

            Interpreter:
            * Goes through the bytecode line by line, translating into machine code. This
            is kind of slow.
            * When a method is called multiple times, each time a
            new interpretation is needed (i.e. for loops - memory is called each loop)

            JIT (Just In Time) Compiler:
            * Execution Engine first uses Interpreter to execute bytecode, but when it finds
            repeated code (hot code) it uses the JIT Compiler to optimise and compile the entire
            repeated section into machine code.
            * For example, in a for-loop with n iterations, memory will not be accessed n times. A
            local variable will be created and to work with, and then afterwards it will be written
            to memory (so only 1 access).

            Garbage Collector:

            * Collects and removes unreferenced objects.
            * 2 phases: Mark and Sweep
            * Carried out automatically by JVM but can be called using System.gc()

            Java Native Interface (JNI)
            * This is what executes native code


            ----------------------------------------------------------------------------------------

            Step-By-Step:

            i) Source files compiled to class files.

            ii) JVM instance created and given the class file that the user specified (normally
            containing the main method). Let's call it Example.class

            iii) Bootstrap ClassLoader created which loads the child classloaders.

            1) Thread created for Example.class.

            2) Example.class loaded into the Method Area by the Application/System ClassLoader.

            3) The main method is given its own frame within the Stack that is associated with Example.class.

            4) The Interpreter and/or JIT compiler will work it's way down the code of main(). They
            will make use of the local variable array and operand stack within the frame mentioned in step 3.

            5) Calls to other methods results in new frames being created for said methods.
            Interpreter/compiler will work through the method just like in step 4.

            6) If a method uses other classes, these will be loaded into the Method area too.
            If classes are instantiated then the created object will be stored in Heap Memory.

         */
    }
}