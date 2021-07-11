package com.company.Threads;

public class Timer {
    private static  double start;

    public static void main(String[] args) {
        long sum = 0;
        start = System.nanoTime();
        for (int i = 0; i < 1_000_000_000; i++) {
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(timer(TimeType.SECONDS));
    }
    public static  double timer(TimeType timeType){
        long end = System.nanoTime();
        switch (timeType){
            case NANOS :
               return end-start;
            case MILLIS:
                return (end-start)/1000000;
            case SECONDS:
                return (end-start)/1000000000;
        }
        return -1;
    }
}
