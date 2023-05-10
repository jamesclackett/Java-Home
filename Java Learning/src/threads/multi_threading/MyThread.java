package threads.multi_threading;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >=0; i--){
            System.out.println("Thread 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //System.out.println(1/0); // will cause error. Watch how thread 2 continues regardless
        }
        System.out.println("Thread 1: finished");
    }
}
