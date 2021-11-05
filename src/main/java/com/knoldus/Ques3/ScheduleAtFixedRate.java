package com.knoldus.Ques3;
import java.util.Date;
import java.util.concurrent.*;

public class ScheduleAtFixedRate {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start making coffee At:" + new Date());
            }
        }, 1, 3L , TimeUnit.SECONDS);
//        Using scheduleWithFixedDelay() method
        executor.scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                System.out.println("Start making coffee At: " + new Date());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, 1, 3L , TimeUnit.SECONDS);
    }
}
