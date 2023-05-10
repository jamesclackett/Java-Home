package threads.multi_threading;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
                Multithreading =    the process of executing multiple threads simultaneously
                                    Helps maximize utilization of CPU
                                    Threads are independent - do not affect or interrupt
                                    other threads.
                                    Useful for serving multiple clients, multiplayer games, or
                                    other mutually independent tasks.
        */

        // there are multiple ways to create a thread:
        // 1) Extend Thread class and override run()
        // 2) Create Thread with an anonymous inner Runnable
        // 3) Create a class that implements runnable and give this to Thread (Thread(Runnable r))
        // Number 3 is best normally (class doesn't have to be a Thread, can extend something else)

        //Thread thread = new Thread(); // with base    class, run() is basically empty
        MyThread thread1 = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

        thread1.start();
        //thread1.join(); // will pause main thread until thread1 is finished
       // thread1.join(3000); // will pause main thread for 3 seconds while thread1 executing
        thread2.start();

        //System.out.println(1/0); // causes error in main, but other user threads still continue

    }
}
