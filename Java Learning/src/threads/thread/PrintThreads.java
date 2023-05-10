package threads.thread;

public class PrintThreads {

    static void print(){
        System.out.println("------------------------------\nTHREADS:\n[ID,NAME,PRIORITY,GROUP]");
        int count = Thread.activeCount();
        Thread[] threadArray = new Thread[count];
        Thread.enumerate(threadArray); // places all active threads into threadArray

        for (int i = 0; i < count; i++) System.out.println(i + ": " + threadArray[i]);
        System.out.println("------------------------------\n");
    }

}
