package com.company.TaskDay11;

public class FunctionSmollestNum {

    public static int FindMinFunc(int a, int b, int c, int d) {
        int min = Integer.MAX_VALUE;
        if (a < min)
            min = a;
        if (b < min)
            min = b;
        if (c < min)
            min = c;
        if (d < min)
            min = d;
        return min;
    }

    public static void main(String[] args) {

       int result = FindMinFunc(4,1,1,1);

        System.out.println(result);

    }
}
