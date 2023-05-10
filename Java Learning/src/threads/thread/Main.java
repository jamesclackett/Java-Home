package threads.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("active count: " + Thread.activeCount());
        // active count returns 2 because there is a ctrl+break thread running too.
        //This thread waits for user to call a thread dump with Ctrl+Break (Ctrl + Fn + B for me)
        // Ctr+Break thread is not run in debug mode (activeCount() will be 1)
        PrintThreads.print(); //custom class

        //System.out.println("current thread's name: " + Thread.currentThread().getName());
        //Thread.currentThread().setName("My threads.thread.static_initializer.Main Thread");
        //Syst em.out.println(Thread.currentThread().getName());
        // Thread priority is from 1 to 10 (10 is the highest priority)
        //System.out.println(Thread.currentThread().getPriority());
        //Thread.currentThread().setPriority(1);
        //Thread.currentThread().isAlive();

        /*
        for (int i = 3; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        threads.MyThread thread = new threads.MyThread();
        thread.start();


        // The below shows how a Thread will die when it finishes its run method
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <=5; i++){
                        Thread.sleep(1000);
                        System.out.println("thread1");
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i <=5; i++){
                        System.out.println("thread1 alive? " + thread1.isAlive());
                        Thread.sleep(2000);
                        System.out.println("thread2");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();
        */

        Thread thread = new Thread();
        System.out.println(thread.isDaemon());
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
    }
}