package timer_task;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        /*
                Timer = A facility for threads to schedule tasks
                        for future execution in a background thread

                TimeTask = A task that can be scheduled for a one-time
                           or repeated execution by a Timer
        */

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            int counter = 10;
            @Override
            public void run() {
                if (counter > 0){
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else {
                    System.out.println("Countdown finished");
                    timer.cancel();
                }

            }
        };

        //timer.schedule(timerTask, 10000);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 12);
        calendar.set(Calendar.HOUR_OF_DAY, 19);
        calendar.set(Calendar.MINUTE, 49);
        calendar.set(Calendar.SECOND, 0); // important, default sets to instance creation second

        //System.out.println(calendar.getTime());
        //timer.schedule(timerTask, calendar.getTime());

        timer.scheduleAtFixedRate(timerTask, 0, 1000);
    }
}