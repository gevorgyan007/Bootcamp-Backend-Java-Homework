package com.company.Threads;

public class SumSimple {
    public static void main(String[] args) {
        long sum =0;
        long time1 = System.nanoTime();
        for (int i = 0; i <1_000_000_000 ; i++) {
            sum+=i;
        }
        System.out.println(sum);
        long time2 = System.nanoTime();
        System.out.println(time2-time1);
        //time--> 508_777_475
        //sum--> 499999999500000000
    }
}
