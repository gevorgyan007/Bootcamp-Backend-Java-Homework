package com.company.Threads;

public class SumThread {
   public static long  sum1 = 0 ;
   public static long  sum2 =0;
    public static void main (String[] args) {
        long time1 = System.nanoTime();
        Runnable sumF = () -> {
            for (int i = 0; i < 500_000_000; i++) {
                sum1+=i;
            }
        };

        Runnable sumF2 = () -> {
            for (int i = 500_000_000; i < 1_000_000_000; i++) {
                sum2+=i;
            }
        };

        Thread thread = new Thread(sumF);
        Thread thread2 = new Thread(sumF2);

        thread.start();
        thread2.start();
        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of 1-1.000.000.000--> "+(sum1 + sum2));
        long time2 = System.nanoTime();
        System.out.println("Time --> " +(time2-time1));
    }
}
